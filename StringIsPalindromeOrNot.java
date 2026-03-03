package String;

public class StringIsPalindromeOrNot {
	public static void main(String[] args) {
		String input = "MADAM";

		String output = "";

		for (int i = input.length() - 1; i >= 0; i--) {

			output = output + input.charAt(i);

		}
		if (input.equals(output)) {
			System.out.println("String is Palindrome  ");
		} else {

			System.out.println("String is Not Palindrome");
		}
	}

}
