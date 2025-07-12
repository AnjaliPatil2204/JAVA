package sort.array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {33,2,1,14,13};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("After sorting");
		
		Arrays.sort(arr);
		for(int i =0;i<arr.length;i++)
			System.out.println(arr[i]);

	}

}
