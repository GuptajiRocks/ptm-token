from flask import Flask, request, render_template
import sqlite3
import pyodbc

app = Flask(__name__)

# DATABASE = "example.db"
def get_db_connection():
    conn = pyodbc.connect('DRIVER={ODBC Driver 18 for SQL Server};SERVER=arihantsqldbs.database.windows.net;DATABASE=freeDB;UID=arihant@arihantsqldbs;PWD=jesus@12')
    return conn

def init_db():
    conn = get_db_connection()
    cursor = conn.cursor()

    cursor.execute("CREATE TABLE IF NOT EXISTS users (id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT NOT NULL,class TEXT NOT NULL)")
    conn.commit()
    conn.close()


@app.route("/")
def main_page():
    return render_template("index.html")

@app.route("/accept")
def accept_details():
    name = request.args.get("name")
    classs = request.args.get("class")

    conn = get_db_connection()
    cursor = conn.cursor()
    cursor.execute('''
        INSERT INTO users (name, class)
        VALUES (?, ?)
    ''', (name, classs))
    conn.commit()

    cursor.execute("SELECT id, name, class FROM users")
    rows = cursor.fetchall()

    return render_template("results.html", results=rows)

@app.route("/removeAll")
def start_over():
    conn = get_db_connection()
    cursor = conn.cursor()
    cursor.execute("DELETE FROM users")
    conn.commit()
    cursor.execute("SELECT id, name, class FROM users")
    rows = cursor.fetchall()
    conn.commit()
    conn.close()

    return render_template("results.html", results=rows)

@app.route("/results")
def only_results_page():
    conn = get_db_connection()
    cursor = conn.cursor()
    cursor.execute("SELECT id, name, class FROM users")
    rows = cursor.fetchall()
    conn.commit()
    conn.close()

    return render_template("results.html", results=rows)

init_db()

if __name__ == "__main__":
    app.run(debug=True)
    




