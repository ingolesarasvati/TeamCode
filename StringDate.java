package String;

import java.util.Date;

public class StringDate {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1.getTime());

		Date d2 = new Date(d1.getTime());

		System.out.println(d2);
		String dateformat = d2.toString();

		String month = dateformat.substring(4, 7);
		System.out.println(month);

		String date = dateformat.substring(8, 10);
		System.out.println(date);

		String year = dateformat.substring(dateformat.length() - 4);
		System.out.println(year);
		
		
		
		String format2=date.concat(month).concat(date);
		System.out.println(format2);
		
		//String format3= 

	}

}
