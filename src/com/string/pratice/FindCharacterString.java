package com.string.pratice;

public class FindCharacterString {
	public static void main(String[] args) {
		String s1 = "ankita";
		System.out.println("Charater at 3rd index is :" + s1.charAt(3));
		System.out.println("2nd mtd");

		char s2 = s1.toCharArray()[2];
		System.out.println("2nd character is:" + s2);

		System.out.println("Using java 8 features");

		/*
		 * Get the string and the index 
		 * Convert String into IntStream using
		 * String.chars() method.
		 * 
		 *  Convert IntStream into Stream using
		 * IntStream.mapToObj() method. 
		 * 
		 * Convert Stream into Character[] using toArray()
		 * method. Get the element at the specific index from this character array.
		 * Return the specific character.
		 */
		Character cc=(Character) s1.chars().mapToObj(c-> (char)c).toArray()[2];
		System.out.println("Character "+cc);

	}

}
