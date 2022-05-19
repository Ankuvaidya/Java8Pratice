package NumberPratice;

//Java program to convert
//Set of Strings to Array of Strings

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

class GFG {

	// Function to convert Set<String> to String[]
	public static String[] convert(Set<String> setOfString)
	{

		// Create String[] from setOfString
		String[] arrayOfString = setOfString

									// Convert Set of String
									// to Stream<String>
									.stream()

									// Convert Stream<String>
									// to String[]
									.toArray(String[] ::new);

		// return the formed String[]
		return arrayOfString;
	}

	public static void main(String[] args)
	{

		// Get the Set of String
		Set<String>
			setOfString = new HashSet<>(
				Arrays.asList("Geeks",
							"ForGeeks",
							"A Computer Portal"));

		// Print the setOfString
		System.out.println("Set of String: "
						+ setOfString);

		// Convert Set to String array
		String[] arrayOfString = convert(setOfString);

		// Print the arrayOfString
		System.out.println("Array of String: "
						+ Arrays.toString(arrayOfString));
	}
}
