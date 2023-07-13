package chattybot;

import java.util.Scanner;

public class ChattyBot {
	
	private final static Scanner sc = new Scanner (System.in);
	
	protected void introMessage() {
		System.out.println("Hello! My name is Aid.\nI was created in 2007.");
	}
	
	protected void askUserName() {
		System.out.println("Please, remind me your name.");
		String userName = sc.nextLine();
		System.out.println("What a great name you have, " + userName + "!");
	}
	
	protected void predictAge() {
		System.out.println("Let me predict your age");
		System.out.println("Say me remainders of dividing your age with 3, 5 and 7 respectively : ");
		int remainder3 = sc.nextInt();
		int remainder5 = sc.nextInt();
		int remainder7 = sc.nextInt();
		int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
		System.out.println("Your age is " + age + ": that's a good time to start programming!");
	}
	
	protected void countNumbers() {
		System.out.println("Now, I will prove it to you that I can count to any number you want.");
		int rangeEnd = sc.nextInt();
		for (int i = 0; i <= rangeEnd; i++) {
			System.out.println(i + "!");
		}
	}
	
	protected void testProgrammingKnowledge() {
		System.out.println("Let's test your programming knowledge.\nWhy do we use methods?\n1. To repeat a statement multiple times."
				+ "\n2. To decompose a program into several small subroutines.\n3. To determine the execution time of program.\n4. To interrupt the execution"
				+ "of the program.");
		int choice = sc.nextInt();
		int guessCount = 1;
		while (choice != 2) {
			System.out.println("Please, try again.");
			guessCount++;
			choice = sc.nextInt(); 
		}
		if (guessCount == 1) {
			System.out.println("Hurray, you got it in the first try!");
		}
		else {
			System.out.println("Congratulations, you got it!");
		}
	}
	
	protected void outroMessage() {
		System.out.println("Have a nice day ahead!");
	}

}
