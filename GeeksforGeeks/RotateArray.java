package com.practice;

import java.util.Scanner;

//Given an array of size n, rotate it by d elements. 

public class RotateArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int test = 0; test < t; test++) {
			int n = sc.nextInt();
			int d = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int j, i = 0;
			while (i < d) {
				int temp = arr[0];
				i++;
				for (j = 0; j < n - 1; j++) {
					arr[j] = arr[j + 1];
				}
				arr[j] = temp;
			}

			//System.out.println("Rotated array:-");
			for (int x : arr) {
				System.out.print(x + " ");
			}
			System.out.println();
			sc.close();
		}
	}

}
