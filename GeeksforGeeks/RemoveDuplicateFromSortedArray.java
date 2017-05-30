package com.practice;


/*
 * Given a sorted array, the task is to remove the duplicate elements from the array.
 */
public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {

		

		int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 7, 7 };
		
		int j = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i];
				j++;
			}
		}
		arr[j] = arr[arr.length-1];
		for(int i = 0;i<j+1;i++){
			System.out.print(arr[i]+",");
		}
	}

}
