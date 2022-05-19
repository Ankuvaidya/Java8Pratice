package NumberPratice;

import java.util.HashMap;

public class FirstDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr= {1,22,3,4,5,6,7,8,22,3,45,2};
			
			int duplicate=firstDuplicate(arr);
			System.out.println("duplicate number: "+duplicate);
	}
	
	public static int firstDuplicate(int[] arr)
	{
	HashMap<Integer, Integer> hm = new HashMap<>();
	
	for (int i=0;i<arr.length;i++) {
		if(hm.containsKey(arr[i])) {
			 
			 return arr[i];
			
		}
		else {
			hm.put(arr[i], 1);
		}
		
		
	}
	return -1;
	}

}
