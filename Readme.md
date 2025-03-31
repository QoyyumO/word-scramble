# Word Scramble Game - Java OOP Project

![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Swing](https://img.shields.io/badge/GUI-Swing-orange.svg)
![OOP](https://img.shields.io/badge/Paradigm-OOP-brightgreen.svg)

A graphical word scramble game developed in Apache NetBeans to help students improve their spelling skills, demonstrating core Java and Object-Oriented Programming concepts.

## Project Overview
This application fulfills the requirements for PAU-CSC 310 (Object-Oriented Programming) assignment by:
- Providing an interactive GUI for students
- Implementing word scrambling and guessing mechanics
- Tracking scores and attempts
- Offering hints and letter reveals

## Features
✔️ Graphical student interface (Java Swing)  
✔️ Word scrambling algorithm  
✔️ Attempt tracking (3 attempts/word)  
✔️ Score calculation system  
✔️ "Get Letter" helper (5 uses total)  
✔️ Hint functionality  
✔️ Color-coded feedback (blue/red messages)  
✔️ Word progression with NEXT button  

## OOP Concepts Demonstrated
- **Encapsulation**: Private fields with getters/setters
- **Inheritance**: Extended JFrame and AbstractButton
- **Polymorphism**: Method overloading/overriding
- **Abstraction**: Interfaces/abstract classes for game logic
- **Composition**: Multiple classes working together

## How to Run
1. Clone this repository
2. Open in Apache NetBeans (JDK 17+ recommended)
3. Build and run `Main.java`

```bash
wordScramble/
├── build/                  # Compiled class files
├── dist/
│   └── wordScramble.jar      # Executable JAR file
├── nbproject/              # NetBeans project configuration
├── src/
│   └── wordScramble/         # Source code package
│       ├── wordScramble.java  # Main application class
│       ├── SingleCharDocument.java  # Input validation
│       └── SpellingGame.java        # Core game logic
├── build.xml               # Ant build script
└── manifest.mf             # JAR manifest └── Scramble.java    # Word scrambling
```


## Requirements
- Java JDK 17+
- Apache NetBeans (recommended)

## Future Enhancements
- Database integration for word lists
- Multiplayer functionality
- Difficulty levels

© 2025
