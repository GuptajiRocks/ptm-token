import pyodbc
SERVER = 'arihantsqldbs.database.windows.net'
DATABASE = 'freeDB'
USERNAME = 'arihant'
PASSWORD = 'jesus@12'

conn = pyodbc.connect('DRIVER={ODBC Driver 18 for SQL Server};SERVER=arihantsqldbs.database.windows.net;DATABASE=freeDB;UID=arihant@arihantsqldbs;PWD=jesus@12')
cursor = conn.cursor()

cursor.execute("use freeDB")
cursor.execute("DELETE from nc")
conn.commit()
cursor.execute("INSERT INTO nc(name, college) VALUES ('Vishnu','BU')")
conn.commit()
cursor.execute("SELECT * FROM nc")
result = cursor.fetchall()
print(result)