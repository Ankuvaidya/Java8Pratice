package com.string.pratice;

public class SplitString {
	public static void main(String[] args) {
		String ss="The Cat";
		String r1="";
		for(int i=0;i<ss.length();i++) {
			String r="";
			for(int j=i;j<ss.length();j++) {
				System.out.println(r=r+ss.charAt(j));
			}
		}

}
}
