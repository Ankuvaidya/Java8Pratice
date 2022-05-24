package StreamsPratice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> i = Arrays.asList( 22, 3, 4, 5, 6, 7);
		Optional<Integer> r=i.stream().min((e1, e2) -> e1 - e2);
		if(r.isPresent()) {
			System.out.println(r);
		}
		
		Optional<Integer> min = i.stream().min((val1, val2) -> {
            return val1.compareTo(val2);
        });
		System.out.println("min :"+min);
		
		Integer max=i.stream().max(Comparator.comparing(Integer::valueOf)).get();
		
			System.out.println("max :" +max);
		
	}

}
