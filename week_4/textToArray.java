
//created 2018-11-16 by Samuel Tschappler without any outside help

import java.io.*;
import java.util.Arrays;

public class textToArray {

	public static void main(String[] args) throws IOException {
		String fileName = "C:\\Users\\user\\Documents\\text.txt";
		String[][] array = buildArrayFromFile(fileName);
		System.out.println(array);
		String output = "";

		for (int m = 0; m < array.length; m++) {
			for (int n = 0; n < array[m].length; n++) {
				if (array[m][n] != "@") {
					output = output + array[m][n];
				}
			}
		}
		//couldn't get this part but hey not gonna leave it any more
		System.out.println(output);
	}

	static String[] addElement(String[] a, String e) {
		a = Arrays.copyOf(a, a.length + 1);
		a[a.length - 1] = e;
		return a;
	}

	static String[][] addArray(String[][] a, String[] e) {
		a = Arrays.copyOf(a, a.length + 1);
		a[a.length - 1] = e;
		return a;
	}

	static String[] buildWordArray(String word) {

		String[] wordArray = { " " };
		String[] letters = word.split("");
		for (int x = 0; x < 20; x++) {
			// loops through the line

			if (x < word.length()) {
				wordArray = addElement(wordArray, letters[x]);

			} else {
				wordArray = addElement(wordArray, "@");

			}

		}

		return wordArray;
	}

	static String[][] buildArrayFromFile(String fileName) {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String[][] finalArray = { { "" } };

		for (int y = 0; y < 40; y++) {
			// read line by line
			String line = null;
			String[] wordArray = { "" };
			try {
				line = in.readLine();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			if (line != null) {
				// if a line exists read line word by word
				String[] words = line.split(" ");

				for (int x = 0; x < words.length; x++) {
					// loops through the line
					wordArray = buildWordArray(words[x]);
					finalArray = addArray(finalArray, wordArray);
				}
			} else {
				// fills the rest of the array with @;

				for (int z = 0; z < 20; z++) {
					// loops through the word
					wordArray = addElement(wordArray, "@");
				}
				finalArray = addArray(finalArray, wordArray);
			}

		}
		return finalArray;
	}
}
