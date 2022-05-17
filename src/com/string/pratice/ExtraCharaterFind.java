package com.string.pratice;

import java.util.HashMap;

public class ExtraCharaterFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "asdf";
		String b = "asdfg";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < a.length(); i++) {
			if (hm.containsKey(a.charAt(i))) {
				hm.put(a.charAt(i), hm.get(a.charAt(i) + 1));

			} else {
				hm.put(a.charAt(i), 1);
			}

		}
		System.out.println("hm :" + hm);

		HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();
		for (int i = 0; i < b.length(); i++) {
			if(!hm.containsKey(b.charAt(i))) {
				System.out.println("character is  not present :"+b.charAt(i));
			}
		}
	
	
	}

}
