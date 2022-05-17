package com.string.pratice;

import java.util.Arrays;
import java.util.Random;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {7, 21, 45, 6, 3, 1, 9, 12, 22, 2};
	   
		int temp;
		
	    for(int i = 0; i < arr.length; i++){
	    	for(int j=i+1;j<arr.length;j++) {
	    		 if (arr[i] > arr[j])   
	                {  
	                    temp = arr[i];  
	                    arr[i] = arr[j];  
	                    arr[j] = temp;  
	                }  
	    	}
	    
	    }
	    for(int i = 0; i < arr.length; i++) {
	    	System.out.println(arr[i]);
	    }
	
	   // / creating an object of Random class   
	    Random random = new Random();   
	    // Generates random integers 0 to 49  
	    int x = random.nextInt(50); 
	    
	    System.out.println("random no are"+ x);
	  }
	 
	 
	 

}
