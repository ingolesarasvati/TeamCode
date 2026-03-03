package String;

public class StringBufferMethods {
	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("Automation Test");

		s.append(" Testing");
		System.out.println(s); // Automation Test Testing

		s.delete(10, 15);
		System.out.println(s); // Automation Testing

		System.out.println(s.replace(0, 10, "Manual")); // Manual Testing

		StringBuffer s2 = new StringBuffer("API Testing");
		System.out.println(s2.insert(3, " SDET")); // API SDET Testing

		System.out.println(s2.substring(4)); // SDET Testing

		System.out.println(s2.substring(4, 6)); // SD

		StringBuffer s1 = new StringBuffer("SDET");
		System.out.println(s1.length()); // 4

		System.out.println(s1.charAt(2)); // E

		System.out.println(s1.reverse()); // TEDS
		
		System.out.println(s1.capacity());  //20

	}
}
