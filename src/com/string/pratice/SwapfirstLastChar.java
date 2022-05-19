package com.string.pratice;

public class SwapfirstLastChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeks for geeks";
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		char[] ch = s.toCharArray();
		System.out.println(ch);

		for (int i = 0; i < ch.length; i++) {
			int r = i;
			while (i < ch.length && ch[i] != ' ') {
				i++;
			}
			char temp = ch[r];
			ch[r] = ch[i - 1];
			ch[i - 1] = temp;
		}
		System.out.println(ch);
	}

}
