import requests

def get_page_source(url):
    try:
        response = requests.get(url)
        response.raise_for_status()  # Raise an HTTPError for bad responses
        return response.text
    except requests.exceptions.RequestException as e:
        return f"An error occurred: {e}"

if __name__ == "__main__":
    url = input("Enter the website URL: ")
    page_source = str(get_page_source(url))
    if isinstance(page_source, str):  # Check if page_source is a string (not an error message)
        with open("result.html", "w", encoding='utf-8') as f: 
            f.write(page_source)
        print("Page source saved to result.html")
    else:
        print(page_source)

