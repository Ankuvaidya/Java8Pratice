
package com.string.pratice;

public class Demoaa {

	public static void main(String[] args) {
		 String inputString = "aaabbccccd";
		  String outputString = "";

		  int count = 1;
		  for (int i = 0; i < inputString.length(); i++) {

		   // resetting to 1 for every new character (counting current character).
		   count = 1;
		   while (i < inputString.length() - 1 && inputString.charAt(i) == inputString.charAt(i + 1)) {
		    count++;
		    i++;
		   }
		   outputString = outputString + inputString.charAt(i) + count;
		  }
		  System.out.println("Input data string : " + inputString);
		  System.out.println("Output data  " + outputString);
		  System.out.println("reverse string");
		  String s1="ankita is my name";
		  String rev="";
		  int len= s1.length();
		  for(int n=0;n<len;n++) {
			  rev=s1.charAt(n)+rev;
		  }
		  System.out.println("reverse string is:"+rev);
		  
		  System.out.println("reverse words of string");
		  String revWordsArray[]=s1.split(" ");
		  
		  String revWords="";
		  for(int a=0;a<revWordsArray.length;a++) {
			  revWords=revWordsArray[a]+" "+revWords;
		  }
		  System.out.println("revWOrds:"+revWords);
}
}
