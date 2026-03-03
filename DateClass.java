package String;
/*
WAP to find out the hour,min and sec
 */

import java.util.Date;

public class DateClass {

	
		public static void main(String[] args) {
			Date d1 = new Date();
			System.out.println(d1.getTime());

			Date d2 = new Date(d1.getTime());

			System.out.println(d2);       //Thu Dec 11 19:33:20 IST 2025
			String dateformat = d2.toString();

			String hour = dateformat.substring(11, 13);
			System.out.println("Hour :" +hour);

			String min = dateformat.substring(14, 16);
			System.out.println("Min  : "+min);

			String sec = dateformat.substring(18,20);
			System.out.println("sec : "+sec);
			
		

	}

}
