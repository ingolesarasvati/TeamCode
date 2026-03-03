package String;

public class StringMethods {
	public static void main(String[] args) {

		String a = "auto";

		int count = a.indexOf('t');
		System.out.println(count); // 2

		System.out.println(a.concat("mation")); // automation

		System.out.println(a.toUpperCase()); // //AUTO

		System.out.println(a.toLowerCase()); // auto

		char c1 = a.charAt(0);
		System.out.println(c1); // a

		String b = " K V No Bangalore ";
		System.out.println(b); // K V No Bangalore
		System.out.println(b.trim()); // K V No Bangalore

		String s = "AutomationTesting";

		System.out.println(s.equals("automationtetsing")); // False

		System.out.println(s.substring(5)); // aionTesting
		System.out.println(s.substring(1, 5)); // utom

		String name = "Manish Kumar Tiwari";

		boolean b1 = name.contains("Singh");
		System.out.println(b1);   //false
		
		
	
         
         
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
