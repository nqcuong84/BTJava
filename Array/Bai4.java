package Array;

import java.util.Arrays;

public class Bai4 {

	public static void main(String[] args) {
		int[] arr= {3, 4, 5, 7, 9};
		System.out.println("Array : "+Arrays.toString(arr));
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum is :"+sum);
	}

}
