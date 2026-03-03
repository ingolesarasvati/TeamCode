package String;

import java.util.Date;

public class DateClassTime {
	public static void main(String[] args) {

		Date d1 = new Date();
		System.out.println(d1.getTime());

		Date d2 = new Date(d1.getTime());

		System.out.println(d2);
		String dateformat = d2.toString();

		String hour = dateformat.substring(11, 13);
		System.out.println("Hour :" + hour);

		String min = dateformat.substring(14, 16);
		System.out.println("Min  : " + min);

		String sec = dateformat.substring(17, 19);
		System.out.println("sec : " + sec);

		String format2= dateformat.concat(hour).concat(" ").concat(min).concat(" ").concat(sec);
		System.out.println(format2);
		
		String format3 = dateformat.concat("H").concat(hour).concat("M")
				.concat(min).concat("S").concat(sec);;
		
		
	

	}
}
