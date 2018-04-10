package Array;

import java.util.Arrays;

public class Bai5 {

	public static void main(String[] args) {
		int[] arr= {1789, 2035, 1899, 1456, 2013};
		System.out.println("Before : "+Arrays.toString(arr));
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=arr.length-1;j>i;j--)
			{
				if(arr[j]<arr[j-1])
				{
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		System.out.println("After : "+Arrays.toString(arr));
	}

}
