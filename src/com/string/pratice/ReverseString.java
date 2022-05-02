package com.string.pratice;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Ankita";
		int len=str.length();
		 String revStr="";
		 
		 for (int i=0;i<len; i++){
		 revStr=str.charAt(i)+revStr;
		 
	}
		 /*Print result using JAva* functionality*/
		 Stream.of(revStr).forEach(System.out::println);
		 Stream.of(revStr).forEach(s-> System.out.println(s));
		 
		 System.out.println("reverse string is:"+revStr);
	}

}
