package com.practice;

import java.util.Scanner;

/*
 * Maximum and minimum of an array using minimum number of comparisons
 */
public class MaxMinOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of an array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements of an array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int min, max,i;
		if (n % 2 == 0) {
			if (arr[0] < arr[1]) {
				min = arr[0];
				max = arr[1];
			} else {
				min = arr[1];
				max = arr[0];
			}
			i=2;
		}else{
			i=1;
			max = min = arr[0];
		}

		while(i< n-1) {
			if (arr[i] > arr[i + 1]) {
				if (arr[i] > max) {
					max = arr[i];
				}
				if (min > arr[i + 1]) {
					min = arr[i + 1];
				}
			} else {
				if (arr[i + 1] > max) {
					max = arr[i + 1];
				}
				if (arr[i] < min) {
					min = arr[i];
				}
			}
			i =i+2;
		}

		sc.close();

		System.out.println("Max and min elements are " + max + " and " + min);

	}

}
