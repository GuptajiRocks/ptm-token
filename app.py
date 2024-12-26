from flask import Flask, request, render_template
import os
from psycopg2 import pool
from dotenv import load_dotenv

load_dotenv()

connection_string = os.getenv('DATABASE_URL')

app = Flask(__name__)

def get_db_connection():
    connection_pool = pool.SimpleConnectionPool(1,10,connection_string)
    conn = connection_pool.getconn()
    return conn
    

# def init_db():
#     conn = get_db_connection()
#     cursor = conn.cursor()

#     cursor.execute("")
#     conn.commit()
#     conn.close()


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
        INSERT INTO temp (name, class)
        VALUES (%s, %s)
    ''', (name, classs))
    conn.commit()

    cursor.execute("SELECT id, name, class FROM temp;")
    rows = cursor.fetchall()

    return render_template("results.html", results=rows)

@app.route("/removeAll")
def start_over():
    conn = get_db_connection()
    cursor = conn.cursor()
    cursor.execute("DELETE FROM temp;")
    conn.commit()
    cursor.execute("SELECT id, name, class FROM temp;")
    rows = cursor.fetchall()
    conn.commit()
    conn.close()

    return render_template("results.html", results=rows)

@app.route("/results")
def only_results_page():
    conn = get_db_connection()
    cursor = conn.cursor()
    cursor.execute("SELECT id, name, class FROM temp;")
    rows = cursor.fetchall()
    conn.commit()
    conn.close()

    return render_template("results.html", results=rows)


if __name__ == "__main__":
    app.run(debug=True)
    




