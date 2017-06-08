package com.practice.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
 * SparseArray is the choice you should make when your map key is an integer, and those integers are not sequential, meaning not 0, 1, 2, 3, 4, ... n - but more like, 43, 2045, 12, 5. 
Now, let's assume for a moment that your keys were integers, but also sequential (0, 1, 2, 3, 4, ... n). What would be the best choice of collection in this case? Well, lets assume that your values are Strings. In this case, your best choice here would be a String array (String[]). The reason for this is that the String array answers all your needs with a minimum impact on performance.
myStringArray[0] would return the String value of the key '0', and so on.
SparseArray works exactly like this, except we allow some values inside the array to be empty (hence, 'sparse'). A SparseArray will create a large array behind the scenes, and use the integer keys as the indexes of the array where the values are placed.
Essentially, HashMaps also work this way - behind the scenes there is a large integer array which is used to place values. The only difference is that in HashMaps, the keys are not integers, they could be anything. For sake of our example, lets say the keys are Strings. What a HashMap will do is it will use a hash function to convert this String key into an integer, then use that to position the value in the array. This can lead to cases where two different Strings produce the same integers. In these cases, the HashMap will perform another operation such as queueing values in the array, or producing a new key, and so on. This, and the production of an integer key via a hash function, can sometimes involve quite a bit of performance.
SparseArray allows you to skip this entirely since with integer keys, none of this is necessary, and therefore is more efficient.
 
 Problem:-
 There are N strings. Each string's length is no more than 20 characters. 
 There are also Q queries. For each query, 
 you are given a string, and you need to find out how many times this string occurred previously.
 */
public class SparseArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String key = br.readLine();
			if (map.containsKey(key)) {
				int count = map.get(key);
				count++;
				map.put(key, count);
			} else {
				map.put(key, 1);
			}
		}

		int query = Integer.parseInt(br.readLine());
		for (int j = 0; j < query; j++) {
			String q = br.readLine();
			if (map.get(q) != null)
				System.out.println(map.get(q));
			else {
				System.out.println(0);
			}
		}
		br.close();
	}

}
