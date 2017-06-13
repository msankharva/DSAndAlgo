package com.practice;

import java.util.Scanner;


/*
 * A string s contains many patterns of the form 1(0+)1 where(0+) represents any non-empty consecutive sequence of 's. The patterns are allowed to overlap.

For example, consider string "1101001", we can see there are two consecutive sequences "1(0)1" and "1(00)1" which are of the form 1(0+)1 .
 */
public class PatternCount {

	static int patternCount(String s) {
		int count = 0;
		char[] a = s.toCharArray();
		boolean startone = false;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == '1') {
				if (startone) {
					count++;
				} else {
					startone = true;
				}
			} else if (a[i] == '0') {
				continue;
			} else {
				startone = false;
			}

		}
		
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			int result = patternCount(s);
			System.out.println(result);
		}
	}

}
