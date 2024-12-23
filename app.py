from flask import Flask, request, render_template
import sqlite3

app = Flask(__name__)

@app.route("/")
def main_page():
    return render_template("index.html")

