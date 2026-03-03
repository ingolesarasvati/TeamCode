package String;

public class StringBuilderMethods {
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("test cycle");
		
		System.out.println(s1.append(" test"));  //test cycle test
		
		System.out.println(s1.reverse());  //tset elcyc tset
		
		System.out.println(s1.delete(0, 3)); //t elcyc tset
		
		System.out.println(s1.replace(5, 10, "automation"));  //t elcautomationet
		
		System.out.println(s1.substring(5));  //automationet
		
		System.out.println(s1.substring(5, 8)); //aut
		
		System.out.println(s1.insert(4, " the")); //  t el thecautomationet

	}

}
