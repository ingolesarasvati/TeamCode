package String;

public class MutableProgram {
	public static void main(String[] args) {
		String a = "Automation"; // Immutable
		String b = a.concat(" Testing");
		System.out.println(a); // Automation
		System.out.println(b); // Automation Testing

		StringBuffer s = new StringBuffer("Manual"); // Mutable
		s.append(" Tetsing");
		System.out.println(s); // Manual Tetsing

		StringBuilder s1 = new StringBuilder("API"); // Mutable
		s1.append(" Tetsing ");
		System.out.println(s1); // API Tetsing

	}

}
