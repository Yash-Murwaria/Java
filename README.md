
# 🗳️ Java Voting System

## 📚 Project Summary
This is a Java-based Voting System built as part of our academic project.  
It simulates the core functionalities of an **Electronic Voting Machine (EVM)** with modular architecture, input validation, data persistence using serialization, and structured code based on best practices.

The system supports:
- ✅ Voter & Candidate Registration
- ✅ Vote Casting
- ✅ Double Voting Prevention
- ✅ Result Tracking
- ✅ Voting Start/Stop Control
- ✅ Persistent Vote Storage


## 👨‍💻 Team Members
- Yash Murwaria  
- Suryansh Yadav  
- Ayushi Tyagi  
- Harshit Khurana  


## 📁 Folder Layout

Java-Voting-System/
├── model/
│   ├── Voter.java              # Voter class with ID, name, vote status
│   ├── Candidate.java          # Candidate class with ID, name, vote count
│   └── VoteManager.java        # Main logic for registration, voting, results
│
├── data/
│   └── FileStorage.java        # Save/load system state using serialization
│
├── utils/
│   └── InputValidator.java     # Regex-based input validation for names
│
├── votes.ser                   # Serialized file storing voter & vote state
├── MainApp.java                # Entry point for running the console menu
└── README.md                   # This documentation file

## ✅ Features Implemented

- ✅ Voter Registration  
- ✅ Candidate Registration  
- ✅ Vote Casting  
- ✅ View Results (sorted by highest votes)  
- ✅ Start/Stop Voting  
- ✅ Prevent Double Voting  
- ✅ Error Handling with Messages  
- ✅ Data Persistence using File Serialization  
- ✅ Modular Code (MVC-aligned folder structure)

## 🚀 Innovations

- 🔄 Real-time vote result sorting  
- 🔐 Double voting protection with state tracking  
- 📂 Persistent vote saving and reloading  
- 🧠 Regex-based input validation  
- 🧱 Clean, modular architecture with reusable components  
- 🛑 Voting is only allowed when active  

## 🛠️ Technologies Used

- **Language:** Java 23  
- **Concepts Used:**
  - Java Collection Framework (`HashMap`, `ArrayList`)
  - File I/O & Serialization
  - Regex Validation
  - Object-Oriented Programming
  - Console-based UI

## 📄 Project Structure Explanation

- `MainApp.java` – User menu system and interaction flow  
- `VoteManager.java` – Handles all business logic (register, vote, count, etc.)  
- `Voter.java`, `Candidate.java` – Represent voters/candidates using OOP  
- `FileStorage.java` – Saves & loads system state to `votes.ser`  
- `InputValidator.java` – Centralized input validation methods  

## 🧪 Testing & Validation

- ✅ Console interactions tested for all possible input flows  
- ✅ Input validation checks:
  - Names: must be alphabetic (regex enforced)
  - Duplicate votes: not allowed
  - Voting outside allowed session: blocked
- ✅ No runtime exceptions observed during invalid input
- ✅ Saved state successfully restored after relaunch

## 📌 Instructions to Run

1. **Clone this repository:**
```bash
git clone https://github.com/Yash-Murwaria/Java-Voting-System.git
cd Java-Voting-System

	2.	Compile and run (Java 23):

javac model/*.java data/*.java utils/*.java MainApp.java
java MainApp

	3.	Vote Data Will Be Saved In: votes.ser

Made with ❤️ by Team STACK
