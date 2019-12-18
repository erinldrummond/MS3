# MS3 Coding Challenge Purpose
The purpose behind this repo was to create an application using JavaScript language to consume a file, parse the data, and insert it into a SQLite database. However, data that may be missing informaiton (whether it's a name, gender, image, etc.) should appear in a separate CSV file. Also, while the application is expected to have the ability to run multiple times, there should be a log file that tallies how many records were received, how many succeeded, and how many failed.

## Getting Started
To get the app running, you need to:
- Have Eclipse or another integrated development environment (IDE) ready for use
- Download [sqlite-jdbc-3.27.2.1](https://bitbucket.org/xerial/sqlite-jdbc/downloads/)
- Add a path to the JDBC JAR file

## Overview
To begin the challenge, I immediately began developing a code that would read and parse the data found within the provided CSV file (or ProvidedCSV.csv). Once this task was completed and I was pleased with the result (which can be found within the file titled CSVReader.java), I turned my attention to the database. SQLite is something I am not entirely familiar with and I quickly recognized it as a database well-suited for Python language, but I was eager to tackle this challenge despite my lack of expertise. I invited the difficulty, and I went on to create the database before adding a code (called SQLiteConversion.java) designed to connect the data that had already been parsed to the SQLite database. This completed the first task of the challenge.

Next, I needed to pull the records that were missing values and did not match the column count. I decided to do this by creating another database in SQLite, having enjoyed learning so much about it in the previous task. Once I created this database and separated the data by using the SELECT and DELETE clauses, I exported the table to created the CSV-bad.csv file. Finally it was time to tally the records. I was glad I had chosen to wait to perform this step, because I had the opportunity to write fairly similar codes to find the total amount of records and total amoun to failed records. After this code was created in TallyRecords.java, I simply had to subtract these results to find the amount of records that were successful.

Overall, I was fascinated by this challenge and enjoyed any difficulty that came my way. I chose my designs based on my prior knowledge and research for topics I may not have been comfortable with to start. I also assumed that whomever uses this program has some prior knowledge with Java as well as an IDE already installed.
