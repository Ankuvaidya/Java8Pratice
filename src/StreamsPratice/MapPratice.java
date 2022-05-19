package StreamsPratice;

import java.util.Collections;

public class MapPratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		int l = arr.length;
//		for(int i=0;i<l/2;i++)
		int i = 0;
		int temp = 0;

		while (i < l/2) {
			temp = arr[i];
			arr[i] = arr[l - i - 1];
			arr[l - i - 1] = temp;
			i++;
		}
		
		

		for (int j = 0; j <l; j++) {
			System.out.println(arr[j]);
		}
		String  s="ankita";
		 s= "ankita vaidya";
		 System.out.println(s);


	}

}
