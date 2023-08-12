# Chatty-Bot

Chatty-Bot is a Java project that provides a console-based chatbot with various interactive features. The bot can engage 
the user in conversations, and perform age prediction, counting, and more. Exception handling is implemented to guide 
the user in providing correct input, and while loops ensure a continuous.

## Features

1. **Warm Welcome:** Chatty-Bot greets the user and asks for their name with a friendly welcome message.

2. **Age Prediction:**
   - The bot predicts the user's age.
   - User is asked to enter remainders when their age is divided by 3, 5, and 7.
   - The bot calculates the age based on the remainders provided.
   - The bot displays the calculated age along with a motivating message suggesting it's the right time to start learning
     programming.

3. **Number Counting:**
   - Chatty-Bot can count numbers based on user input.
   - If the user enters a non-negative number, the counting starts from 0 in increasing order.
   - If the user enters a negative number, the counting starts from 0 in decreasing order.

4. **Quiz:**
   - Chatty-Bot can present a quiz with 1 question.
   - The user is encouraged if they guess the correct option in the first try.
   - Even if the user guesses correctly after multiple tries, they are congratulated.

5. **Farewell Message:** The chatbot provides a farewell message to conclude the interaction.

## Exception Handling

Chatty-Bot uses both pre-defined and custom exceptions to guide the user on input errors and the expected input format.

## Implementation Details

- The project employs while loops to create infinite loops, ensuring the user must enter valid input in every prompt to get
  the desired output.
- Exception handling is integrated to gracefully handle unexpected input and guide the user.

## Getting Started

To run the Chatty-Bot project, you need a Java environment installed on your system. Simply compile and run the Java source 
file to interact with the bot.

```bash
# Compile the Java source files
javac Main.java

# Run the application
java Main
```

Follow the on-screen instructions provided by Chatty-Bot to engage in various conversations and enjoy the features it offers.

## Feedback and Contributions

We welcome your feedback on Chatty-Bot and any contributions you'd like to make. If you find any issues or have ideas for 
enhancements, please feel free to open an issue or create a pull request on the project's GitHub repository.

Thank you for using Chatty-Bot! We hope you have a fun and interactive experience with the bot.
