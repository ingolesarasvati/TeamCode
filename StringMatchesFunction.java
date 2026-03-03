package String;

public class StringMatchesFunction {
	public static void main(String[] args) {
		String a= "auto";
		
		// Check if string starts with a
	boolean b1=	a.matches("a(.*)");
		System.out.println(b1);
		// Check if string ends  with o
		boolean b2=	a.matches("(.*)o");
		System.out.println(b2);
		
		// Check if string  has the exact 4 letters
		
		boolean b3=	a.matches("....");
		System.out.println(b3);
		
		// check if the string has https in it or not 
		String url="https://www.google.com/";
		boolean b4=	url.matches("https(.*)");
		System.out.println(b4);
		
		
	}

}
