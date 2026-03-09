# Palindrome Checker App

This project is a Java-based Palindrome Checker application.

## Features
- Validates if a given string is a palindrome.
- **Performance Comparison**: Measures and compares the execution performance of different palindrome validation algorithms (Use Case 13).
- Calculates and displays the execution time in nanoseconds for each algorithm.

## Algorithms Benchmarked
The application currently benchmarks the following two methods:
1. **Two Pointer Method**: Uses two pointers at the start and end of the string, moving towards the center to check for matching characters.
2. **Stack Method**: Pushes all characters of the string onto a stack, then pops them off to compare with the original string characters.

## How to Run
1. Navigate to the source directory:
   ```bash
   cd PalindromeCheckerApp/src
   ```
2. Compile the Java source file:
   ```bash
   javac UseCase13PalindromeCheckerApp.java
   ```
3. Run the compiled application:
   ```bash
   java UseCase13PalindromeCheckerApp
   ```
4. Enter a string when prompted to see the validation result and the performance benchmark for both algorithms.