package NumberPratice;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateInArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4,5,6,7,8,2,3,45,2};
//		HashSet<Integer> hs= new HashSet<>();
//		for (int i=0;i<arr.length;i++) {
//			if(!hs.add(arr[i])) {
//				System.out.println(arr[i]);
//			}
//			hs.add(arr[i]);
//		}
		int f=firstDuplicate(arr);
		System.out.println(f);
	}
	static int firstDuplicate(int[] a) 
	{
	    Set<Integer> set = new HashSet<>();
	    for(int i=0;i<a.length;i++){
	        if(!set.add(a[i])) {
	            return a[i];
	        }
	        else {
	        	
	        set.add(a[i]);
	        }
	    }
	    return -1; // no duplicates found 
	}

}
