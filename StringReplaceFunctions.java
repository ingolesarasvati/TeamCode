package String;

public class StringReplaceFunctions {
	public static void main(String[] args) {
		String s1 = "tetsing";
		System.out.println(s1.replace('e', 'E')); // tEtsing

		String c = "Manual Testing ";

		System.out.println(c.replace("Manual", "API")); // API Tetsing

		// repalce all capital letter
		System.out.println(c.replaceAll("[A-Z]", ""));   //anual etsing 

		// replace all smaller letter
		System.out.println(c.replaceAll("[a-z]", ""));   //M T 
		
		
		String d= "k v no 2";
		
		// replace all number
		System.out.println(d.replaceAll("[0-9]", ""));       //k v no 
		
		
		
		
		
		
		

	}

}
