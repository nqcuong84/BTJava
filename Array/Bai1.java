package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {

	public static boolean contains(int[] arr, int so)
	{
		for(int numbers:arr) {
			if(so==numbers)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr = {1789, 2035, 1899, 1456, 2013};
		System.out.println("Array : "+Arrays.toString(arr));
		System.out.println(contains(arr, 2013));
		System.out.println(contains(arr, 2014));
	}

}
