package StreamsPratice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctPratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= Arrays.asList(1,2,2,1,3,3,4,5,6,7,9,11,12);
		
		System.out.println(list.stream().distinct().collect(Collectors.toList()));
		
		/*display duplicate integers*/
		Set<Integer> ss= new HashSet<>();
		System.out.println(list.stream().filter(s-> !ss.add(s)).collect(Collectors.toSet()));
		
	}

}
