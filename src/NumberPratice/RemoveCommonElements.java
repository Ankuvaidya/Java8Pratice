package NumberPratice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveCommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {1, 2, 2, 3, 4, 4, 4};
		List<Integer> arr=Arrays.asList(1,2,2,3,4,4,4);
		
		HashSet <Integer> hs= new HashSet<Integer>();
		hs.addAll(arr);
		System.out.println(hs);
		
		List<Integer> r=arr.stream().distinct().collect(Collectors.toList());
		r.forEach(System.out::println);

	}

}
