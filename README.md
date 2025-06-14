
# 🗳️ Java Voting System

## 📚 Project Summary
This is a Java-based Voting System created as part of our group project.
It simulates the core functionalities of an EVM (Electronic Voting Machine) and can be potentially used in real-world digital elections.
It includes voter and candidate registration, vote casting, and real-time result tracking.

## 👨‍💻 Team Members
- Yash Murwaria 
- Suryansh Yadav  
- Ayushi Tyagi  
- Harshit Khurana  

Java-Voting-System/
│
├── model/                       # Data classes (Candidate, Voter, VoteManager)
│   ├── Candidate.java
│   ├── Voter.java
│   └── VoteManager.java
│
├── view/                        # GUI components (Swing-based)
│   ├── LoginFrame.java
│   ├── MainFrame.java
│   ├── AdminPanel.java
│   └── ResultPanel.java
│
├── controller/                 # Handles logic and event control
│   ├── AuthController.java
│   ├── VoteController.java
│   └── AdminController.java
│
├── data/                        # Serialization and storage
│   ├── VoterData.java
│   ├── FileStorage.java
│   └── votes.ser               # Serialized vote file
│
├── utils/                       # Utility functions and validators
│   ├── InputValidator.java
│   └── LoggerUtil.java
│
├── assets/                      # Screenshots or other media
│   ├── login_screen.png
│   └── vote_results.png
│
├── test/                        # Unit test classes (JUnit)
│   ├── VoteManagerTest.java
│   └── InputValidatorTest.java
│
├── Main.java                    # App entry point
├── README.md                    # Project description and guide
└── Java_Voting_System_Documentation.pdf   # Detailed report/documentation

## ✅ Features Implemented
- ✅ Voter Registration  
- ✅ Candidate Registration  
- ✅ Vote Casting  
- ✅ View Results  
- ✅ Start/Stop Voting  
- ✅ Prevent Double Voting  
- ✅ Error Handling with Informative Messages  

## 🚀 Innovations
- ⚡ Real-time vote result updates  
- 🌐 Designed with real-world usability in mind  
- 🔒 Prevents double voting through voter ID tracking  
- ❗ Robust error handling for invalid inputs and duplicate votes

## 🛠️ Technologies Used
- **Language:** Java 23  
- **Concepts Applied:**  
  - Java Collection Framework (HashMap, etc.)  
  - Basic Input/Output  
  - Control Structures (Loops, Conditions)  
  - Core Java Classes  

## 📄 Project Structure
- `VotingSystem.java` – Main class and console logic  
- `OnlineVotingSystem` – Core voting logic and features  
- `voters`, `candidates`, `votes` – Managed using Java Maps  
- Modular functions for each menu-driven action

## 🧪 Testing & Validation
- All features tested via console menu system  
- Input validations implemented for:
  - Valid voter and candidate IDs  
  - Duplicate voting prevention  
  - Voting only within active session  
- No crashes or runtime exceptions on invalid input

## 🧾 Project Documentation
- Documentation and design files have been submitted on **GUVI Platform** along with the GitHub link  
- Includes class structure and flow of operations  

## Flowchart 
![Uploading 7B7A6150-0448-4186-96B8-BD32F96AE51A.png…]()


## 📌 Instructions to Run
1. Clone the repository:  
   ```bash
   git clone https://github.com/Yash-Murwaria/Java

	2.	Compile and run using terminal or any Java IDE:

javac VotingSystem.java
java VotingSystem

📌 Notes
	•	Ensure Java 23 is installed in your environment.
	•	Designed for console-based interaction with potential for GUI upgrades in future versions.

Made with ❤️ by Team STACK
