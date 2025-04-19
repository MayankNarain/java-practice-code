from flask import Flask, request, render_template
import torch
from transformers import CLIPProcessor, CLIPModel
from PIL import Image
import os

app = Flask(__name__)

# Load the pre-trained AI model (CLIP)
model = CLIPModel.from_pretrained("openai/clip-vit-base-patch32")
processor = CLIPProcessor.from_pretrained("openai/clip-vit-base-patch32")

UPLOAD_FOLDER = "static/uploads"
os.makedirs(UPLOAD_FOLDER, exist_ok=True)
app.config["UPLOAD_FOLDER"] = UPLOAD_FOLDER

# Function to detect AI-generated content
def detect_ai_usage(image_path):
    image = Image.open(image_path)
    labels = ["Real Image", "AI-Generated Image"]
    inputs = processor(text=labels, images=image, return_tensors="pt", padding=True)
    outputs = model(**inputs)
    probs = outputs.logits_per_image.softmax(dim=1)[0]
    ai_percentage = probs[1].item() * 100  # Probability of AI-generated content
    return ai_percentage

# Homepage with file upload
@app.route("/", methods=["GET", "POST"])
def index():
    if request.method == "POST":
        if "file" not in request.files:
            return render_template("index.html", error="No file uploaded.")

        file = request.files["file"]
        if file.filename == "":
            return render_template("index.html", error="No file selected.")

        filepath = os.path.join(app.config["UPLOAD_FOLDER"], file.filename)
        file.save(filepath)

        # Run AI detection
        ai_percentage = detect_ai_usage(filepath)

        return render_template("index.html", image_path=filepath, ai_percentage=ai_percentage)

    return render_template("index.html")

if __name__ == "__main__":
    app.run(debug=True)
