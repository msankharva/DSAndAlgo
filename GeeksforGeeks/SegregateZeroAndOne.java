package com.practice;

import java.util.Scanner;



/*
 * Segregate 0s and 1s in an array
	You are given an array of 0s and 1s in random order. 
	Segregate 0s on left side and 1s on right side of the array.
 	Traverse array only once.
 */
public class SegregateZeroAndOne {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of an array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements of an array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0, j = n - 1; i < j;) {

			if (arr[i] >arr[j]) {
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				i++;
				j--;
			} else {
				if (arr[i] != 1) {
					i++;
				}
				if (arr[j] != 0) {
					j--;
				}
			}

		}

		System.out.print("Segregated array is:-- ");
		for (int a : arr) {
			System.out.print(a + ",");
		}
		sc.close();
	}

}
