package com.practice;

import java.util.Scanner;
import java.util.Stack;
/*
 * A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})" 

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.

Input Format

There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.

The part of the code that handles input operation is already provided in the editor.

Output Format

For each case, print 'true' if the string is balanced, 'false' otherwise.

Sample Input

{}()
({()})
{}(
[]
Sample Output

true
true
false
true
 */
public class BalancedStringUsingStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			Stack<Character> s1 = new Stack<>();
			for (int i = 0; i < input.length(); i++) {
				if (!s1.isEmpty()) {
					switch (input.charAt(i)) {
					case '}': {
						if (s1.peek() == '{')
							s1.pop();
					}
						break;
					case ']': {
						if (s1.peek() == '[')
							s1.pop();
					}
						break;
					case ')': {
						if (s1.peek() == '(')
							s1.pop();
					}
						break;
					default:
						s1.push(input.charAt(i));
					}

				} else {
					s1.push(input.charAt(i));
				}

			}
			System.out.println(s1.isEmpty());
		}

	}

}
