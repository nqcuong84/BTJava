package Array;

import java.util.Arrays;

public class Bai2 {

	public static void maxAndMin(int arr[]) {
		int max = 0, min = 0;
		int temp=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>temp)
			{
				max=arr[i];
			}else if(arr[i]<temp)
			{
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
	
	public static void main(String[] args) {
		int[] arr = {53, 32, 19, 79, 25, 5, 47};
		System.out.println("Array : "+Arrays.toString(arr));
		maxAndMin(arr);
	}

	

}
