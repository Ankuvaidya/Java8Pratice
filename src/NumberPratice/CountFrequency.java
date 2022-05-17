package NumberPratice;

import java.util.HashMap;

public class CountFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
		HashMap <Integer , Integer> hm = new HashMap<>();
		for (int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else {
				hm.put(arr[i], 1);
			}
		}
		System.out.println("hm :"+hm);

	}

}
