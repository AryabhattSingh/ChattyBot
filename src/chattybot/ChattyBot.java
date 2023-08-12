package chattybot;

import java.util.Scanner;

public class ChattyBot {

	private final static Scanner sc = new Scanner(System.in);

	protected void introMessage() {
		System.out.println("\r\n"
				+ " /$$   /$$                             /$$     /$$                                           /$$\r\n"
				+ "| $$  | $$                            | $$    | $$                                          | $$\r\n"
				+ "| $$  | $$  /$$$$$$  /$$   /$$       /$$$$$$  | $$$$$$$   /$$$$$$   /$$$$$$   /$$$$$$       | $$\r\n"
				+ "| $$$$$$$$ /$$__  $$| $$  | $$      |_  $$_/  | $$__  $$ /$$__  $$ /$$__  $$ /$$__  $$      | $$\r\n"
				+ "| $$__  $$| $$$$$$$$| $$  | $$        | $$    | $$  \\ $$| $$$$$$$$| $$  \\__/| $$$$$$$$      |__/\r\n"
				+ "| $$  | $$| $$_____/| $$  | $$        | $$ /$$| $$  | $$| $$_____/| $$      | $$_____/          \r\n"
				+ "| $$  | $$|  $$$$$$$|  $$$$$$$        |  $$$$/| $$  | $$|  $$$$$$$| $$      |  $$$$$$$       /$$\r\n"
				+ "|__/  |__/ \\_______/ \\____  $$         \\___/  |__/  |__/ \\_______/|__/       \\_______/      |__/\r\n"
				+ "                     /$$  | $$                                                                  \r\n"
				+ "                    |  $$$$$$/                                                                  \r\n"
				+ "                     \\______/                                                                   \r\n"
				+ "");
		System.out.println("My name is Aid.\nI was created in 2007.");
	}

	protected void askUserName() {
		System.out.println("\nPlease, let me know your name : ");
		System.out.println("-------------------------------");
		while (true) {
			String userName = sc.nextLine();
			try {
				if (userName.length() < 1) {
					throw new PossibleExceptions();
				} else {
					// The caret ^ symbol tells the computer that the match must start at the
					// beginning of the string or line.
					// It tells the computer to match the preceding character (or set of characters)
					// for 0 or more times (upto infinite).
					// It tells the computer that the match must occur at the end of the string or
					// before \n at the end of the line or string.
					// This regex checks if the userName contains only alphabets
					if (userName.matches("^[a-zA-Z]*$")) {
						System.out.println("\nWhat a great name you have, " + userName + "!");
						break;
					} else {
						throw new PossibleExceptions();
					}
				}
			} catch (PossibleExceptions e) {
				if (userName.length() < 1) {
					e.nameMustContainAtLeast1Character();
				} else {
					e.nameMustContainOnlyAlphabets();
				}
			} // end of try-catch
		}
	}

	protected void predictAge() {
		System.out.println("\n\nLet me predict your age");
		System.out.println("------------------------");
		System.out.println("Say me the remainders of dividing your age with 3, 5 and 7 respectively...\n"
				+ "==Remember the remainder is always smaller than divisor, otherwise the divisor "
				+ "will divide one more time==");

		int remainder3 = takeInputAndCheckNonNegativeInputException(3);
		int remainder5 = takeInputAndCheckNonNegativeInputException(5);
		int remainder7 = takeInputAndCheckNonNegativeInputException(7);

		int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
		System.out.println("\nYour age is " + age + ": that's a good time to start programming!");

	}

	private int takeInputAndCheckNonNegativeInputException(int number) {
		// Loop till user enters a non-negative number
		while (true) {
			System.out.println("\nEnter the remainder when age is divided by" + number + " : ");
			try {
				int remainder = Integer.parseInt(sc.next());
				if (remainder < 0) {
					throw new PossibleExceptions();
				} else {
					// This breaks the infinite loop as well
					return remainder;
				}
			} catch (NumberFormatException | PossibleExceptions e) {
				new PossibleExceptions().onlyNonNegativeNumbersAreAllowed();
			}
		} // end of while
	}

	protected void countNumbers() {
		System.out.println("\n\nNow, I will prove it to you that I can count to any number you want.");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Enter the number till which you want me to count : ");
		while (true) {
			try {
				int rangeEnd = Integer.parseInt(sc.next());
				System.out.println("\nCounting the numbers...");
				if (rangeEnd >= 0) {
					for (int i = 0; i <= rangeEnd; i++) {
						System.out.println(i + "!");
					}
				} else {
					for (int i = 0; i >= rangeEnd; i--) {
						System.out.println(i + "!");
					}
				}
				// breaking the while loop
				break;

			} catch (NumberFormatException e) {
				new PossibleExceptions().onlyIntegerNumbersAreAllowed();
			}
		}
	}

	protected void testProgrammingKnowledge() {
		System.out.println("\n\nLet's test your programming knowledge." + "\n--------------------------------------"
				+ "\nWhy do we use methods?" + "\n1. To repeat a statement multiple times."
				+ "\n2. To decompose a program into several small subroutines."
				+ "\n3. To determine the execution time of program.\n4. To interrupt the execution"
				+ " of the program.");
		System.out.println("\nEnter your choice : ");
		while (true) {
			int guessCount = 1;
			try {
				int choice = Integer.parseInt(sc.next());

				if (choice < 1 || choice > 4) {
					throw new PossibleExceptions();
				}

				while (choice != 2) {
					System.out.println("Wrong answer. Please, try again.");
					guessCount++;
					System.out.println("\nEnter your choice : ");
					choice = Integer.parseInt(sc.next());
				}

				if (guessCount == 1) {
					System.out.println("\nHurray, you got it in the first try!");
					break;
				} else {
					System.out.println("\nCongratulations, you got it!");
					break;
				}

			} catch (NumberFormatException e) {
				new PossibleExceptions().onlyIntegerNumbersAreAllowed();
			} catch (PossibleExceptions e) {
				e.onlyNumbersFrom1to4AreAllowed();
			}
		}
	}

	protected void outroMessage() {
		System.out.println("\nHave a nice day ahead!");
		System.out.print("----------------------");
	}

}