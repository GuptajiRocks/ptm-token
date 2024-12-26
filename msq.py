import os
from psycopg2 import pool
from dotenv import load_dotenv

load_dotenv()

connection_string = os.getenv('DATABASE_URL')

connection_pool = pool.SimpleConnectionPool(1,10,connection_string)

# Check if the pool was created successfully
if connection_pool:
    print("Connection pool created successfully")

# Get a connection from the pool
conn = connection_pool.getconn()

# Create a cursor object
cur = conn.cursor()
cur.execute("SELECT * FROM temp;")
tables = cur.fetchall()

print(tables)

