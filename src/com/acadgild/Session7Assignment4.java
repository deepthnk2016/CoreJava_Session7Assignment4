package com.acadgild;

import java.util.Arrays;
/**
 * 
 * Program to print the anagram words from an array of Strings
 * ===========================================================
 * Algorithm:
 * ===========================================================
 * 	i. Loop through the list of strings.
 * ii. Delete the contents of temp buffer.
 * 		ii. Take another loop to start looping from the next words of first loop.
 *     iii. Compare the length of the two strings, if doesn't match then pick next word.
 *      iv. If matches then sort both the strings and then compare them. If matches then check if
 *          check if both the strings are present in buffer. If not add them to the buffer and temp
 *          buffer.
 *       v. Check if temp buffer has values in it. If values present then print the values.
 * =============================================================         
 *      
 */
public class Session7Assignment4 {

	public static void main(String[] args) {

		// Take two string buffers.
		StringBuffer buffer = new StringBuffer();
		StringBuffer buffer_temp = new StringBuffer();
		
		// Take two arrays.
		String[] letters1, letters2;
		String[] inputArray = { "listen", "pot", "part", "opt", "trap", "silent", "top", "this", "hello", "hits",
				"what", "shit" };

		// Loop through the array of Strings.
		for (int i = 0; i < inputArray.length; i++) {
			
			// Delete the contents of the temp buffer.
			buffer_temp.delete(0, buffer.length());
			
			// Loop through the next word from the array of Strings.
			for (int j = i + 1; j < inputArray.length; j++) {
				//	Check the length of the two Strings.
				if (inputArray[i].length() == inputArray[j].length()) {
					// Convert both strings to lower case.
					inputArray[i].toLowerCase();
					inputArray[j].toLowerCase();
					
					// Convert the Strings to array of characters and sort them.
					letters1 = inputArray[i].split("");
					Arrays.sort(letters1);

					letters2 = inputArray[j].split("");
					Arrays.sort(letters2);

					// Compare the two arrays.
					if (Arrays.equals(letters1, letters2)) {
						// If matches then check if th they are present in the buffer? If not
						// then add both the Strings to temp buffer and buffer.
						if (buffer.indexOf(inputArray[i]) < 0) {
							buffer.append(inputArray[i] + " ");
							buffer_temp.append(inputArray[i] + " ");

						}
						if (buffer.indexOf(inputArray[j]) < 0) {
							buffer.append(inputArray[j] + " ");
							buffer_temp.append(inputArray[j] + " ");

						}

					}
				}

			}
			// Check if length of temp buffer is greater than 0. If greater than 0 then print it.
			if (buffer_temp.length() > 0) {
				System.out.println(buffer_temp.toString());
			}
		}

	}

}
