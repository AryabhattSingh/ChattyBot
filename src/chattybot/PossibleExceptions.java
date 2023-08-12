package chattybot;

public class PossibleExceptions extends Exception {

	private static final long serialVersionUID = 1L;

	void nameMustContainAtLeast1Character() {
		System.out.print("""
				***********************************************
				ERROR : Name must contain atleast one character
				***********************************************
				""");
		System.out.println("\nPlease enter your name again : ");
		System.out.println("-------------------------------");
	}

	void nameMustContainOnlyAlphabets() {
		System.out.print("""
				****************************************************
				ERROR : Name must contain only alphabetic characters
				****************************************************
				""");
		System.out.println("\nPlease enter your name again : ");
		System.out.println("-------------------------------");
	}

	void onlyNonNegativeNumbersAreAllowed() {
		System.out.print("""
				**********************************************************
				ERROR : Remainders must be non-negative whole numbers only
				**********************************************************
				""");
		System.out.println("\nPlease enter the remainders again : ");
		System.out.println("------------------------------------");
	}

	void onlyIntegerNumbersAreAllowed() {
		System.out.print("""
				*****************************************
				ERROR : Input must be integer number only
				*****************************************
				""");
		System.out.println("\nPlease enter again : ");
		System.out.println("----------------------");
	}

	void onlyNumbersFrom1to4AreAllowed() {
		System.out.print("""
				***************************************
				ERROR : Allowed numbers are from 1 to 4
				***************************************
				""");
		System.out.println("\nPlease enter again : ");
		System.out.println("----------------------");
	}

}