package String;

public class ReverseString {

	public static void main(String[] args) {

		String input = "Automation";

		String rev = "";

		for (int i = input.length() - 1; i >= 0; i--) {

			rev = rev + input.charAt(i);

		}
		System.out.println(rev);

	}

}
