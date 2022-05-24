package StreamsPratice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5);
		List<String> lsString=ls.stream().map(each->each%2==0?each+"e":each+"o").collect(Collectors.toList());
		lsString.forEach(System.out::println);
		
		
	}

}
