
# Voting System (CLI Java App)

## Student Name
**[Your Full Name Here]**

## Project Title
Voting Ballot Management System (Command-Line Interface)

## Description
This is a Java-based command-line application for managing voting ballots. The system supports CRUD (Create, Read, Update, Delete) operations for election ballots, allowing users to add, view, update, and delete ballots and their associated candidates.

## Objectives
- Implement a file-based CRUD system in Java.
- Develop a command-line interface for user interaction.
- Store and retrieve persistent data using text files.
- Apply input validation and error handling.
- Generate reports summarizing application data and user actions.
- Log all key activities in a file.
- Practice modular programming and object-oriented design principles.

## Project Requirement List
1. Add a new ballot with a list of candidates.
2. Display all existing ballots.
3. Update the name of an existing ballot.
4. Delete an existing ballot.
5. Input validation for empty and invalid inputs.
6. Save ballots persistently in a text file.
7. Log all user activities to a log file.
8. Generate a report showing total ballots and log contents.
9. Modular design with separate classes for ballots, candidates, and data handling.
10. User-friendly command-line interface with a clear menu system.

## Documentation

### Algorithms & Data Structures
- Ballots and candidates are stored using `ArrayList` structures.
- The data persistence uses file I/O with structured plain text format.
- A switch-case driven menu loop enables user interaction.

### Modules / Functions
- `BallotManager`: Handles all CRUD operations.
- `FileHandler`: Manages file read/write and activity logging.
- `ReportGenerator`: Creates summary reports of ballots and logs.

### Challenges Faced
- Designing a readable file format for storing nested data (ballots and candidates).
- Maintaining separation of concerns between modules while keeping data flow consistent.
- Handling file I/O exceptions gracefully without crashing the app.

## Test Cases and Outputs

### Test Case 1: Adding a Ballot
**Input:**
```
1 (Add Ballot)
Ballot Name: Class President Election
Candidate: Alice
Candidate: Bob
Candidate: done
```

**Expected Output:**
```
Ballot added successfully.
```

### Test Case 2: Viewing Ballots
**Input:** `2 (View Ballots)`

**Expected Output:**
```
1. Class President Election - Candidates: [Alice, Bob]
```

### Test Case 3: Updating Ballot
**Input:**
```
3 (Update Ballot)
Ballot Number: 1
New Name: Student Council Election
```

**Expected Output:**
```
Ballot updated successfully.
```

### Test Case 4: Generating Report
**Input:** `5 (Generate Report)`

**Expected Output:**
```
--- Report ---
Total ballots: 1
Activity log:
[Timestamp] - Added ballot: Class President Election
[Timestamp] - Updated ballot: Student Council Election
```

### Screenshots
Include screenshots of:
- Menu interface
- Adding a ballot
- Viewing ballots
- Updating a ballot
- Generating a report
- Log and ballot file contents

## Code Quality
- Code is modular and separated into logical components.
- Follows Java naming conventions and best practices.
- Uses minimal comments as required.

## Files Used
- `data/ballots.txt`: Stores ballots and candidates.
- `logs/activity.log`: Stores activity logs.

---

**End of README**
