package String;

public class CountNoOfAlphabetNumericSpacesAndSpecialCharacters {
	static int noofAlphabets;
	static int noofWhiteSpaces;
	static int noofSpecialCharacters;
	static int noofNumeric;

	public static void main(String[] args) {
		String input = "k v no 2 bangalore ^&%";

		char[] c1 = input.toCharArray();

		for (int i = 0; i < c1.length; i++) {
			boolean b1 = Character.isAlphabetic(c1[i]);
			if (b1 == true) {
				noofAlphabets++;

			}
			boolean b2 = Character.isWhitespace(c1[i]);
			if (b2 == true) {
				noofWhiteSpaces++;
			}
			boolean b3 = Character.isDigit(c1[i]);
			if (b3 == true) {
				noofNumeric++;

			}
		}
		System.out.println(" Count of Alphabets are : " + noofAlphabets);
		System.out.println(" Countof Spaces are : " + noofWhiteSpaces);
		System.out.println(" Count of Numerics are : " + noofNumeric);

		noofSpecialCharacters = input.length() - (noofAlphabets + noofWhiteSpaces + noofNumeric);
		System.out.println(" Count of Special Characters are : " + noofSpecialCharacters);
	}

}
