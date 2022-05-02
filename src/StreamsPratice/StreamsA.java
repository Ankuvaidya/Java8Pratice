package StreamsPratice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsA {

	public static void main(String[] args) {
		
		/* are creating a stream of a fixed number of integers. */
		Stream<Integer> ref = Stream.of(1, 2, 3, 4, 5, 6);
		System.out.println("ref1= " + ref);
		ref.forEach(System.out::print);
		System.out.println("+++++++++++++++++++");
		
		/*are creating a stream from the array*/
		Stream<Integer> arr= Stream.of(new Integer [] {1,22,33,33,444});
		arr.forEach(s-> System.out.print(s));
		
		/*are creating a stream from the List.*/
		List<Integer> list = new ArrayList<Integer>();

		for(int i = 1; i< 10; i++){
		      list.add(i);
		}

		Stream<Integer> stream = list.stream();
		stream.forEach(p -> System.out.println(p));
	}

}
