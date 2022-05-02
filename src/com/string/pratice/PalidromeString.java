package com.string.pratice;

public class PalidromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* How to check Palindrome String in java? */
		String s1 = "nitina";
		String s2 = "nitae";
		StringBuilder sb = new StringBuilder(s1);
		boolean ans = sb.reverse().toString().equals(s1);
		System.out.println(ans);
		
		if (isPalindrome(s1)) {
			System.out.println("it is palidrome");
		} else {
			System.out.println("not palindrome");
		}

	}

	static boolean isPalindrome(String s1) {
		System.out.println("second method");

		int i = 0;
		int j = s1.length() - 1;
		while (i < j) {
			if (s1.charAt(i) != s1.charAt(j)) {
				return false;
			} else {
				i++;
				j--;
			}
		}

		return true;
	}
}
