package Arrays;

import java.util.Arrays;

/*
WAP to find out out of many values present in Array which is maximum and which is minimum
 */
public class FindOutValuesPresentInArrayMaxAndMinimum {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 25;
		arr[1] = 30;
		arr[2] = 1;
		arr[3] = 90;
		arr[4] = 85;
		System.out.println(Arrays.toString(arr));

		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];

			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("The Max Value: " + max);
		System.out.println("The Min Value : " + min);
	}

}
