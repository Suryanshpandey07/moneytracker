# Money Tracker CLI

A simple Command Line Interface (CLI) application built in Java to track personal expenses.

## Features

- Add expenses
- Update expenses
- Store expense data in a local file (data.json)
- Track creation and update timestamps

## Project Structure

text moneytracker/ ├── manager.java ├── task.java ├── text.java └── data.json 

## Requirements

- Java 8 or later

## Compile

bash javac *.java 

## Usage

### Add an Expense

bash java manager add Milk 50 

Example Output:

text added Milk with price 50 at time 2026-06-20T18:30:00 

### Update an Expense

bash java manager update Milk 60 

Example Output:

text updated Milk with price 60 at time 2026-06-20T18:45:00 

## Data Storage

Expenses are stored in data.json.

Example:

json {"name":"Milk","price":"50","time":"2026-06-20T18:30:00"} 

## Future Improvements

- List all expenses
- Delete expenses
- Add unique IDs
- Calculate spending summaries
- Store data as a valid JSON array
- Search and filter expenses

## Author

Suryansh Pandey
helped by-https://roadmap.sh/projects/expense-tracker
