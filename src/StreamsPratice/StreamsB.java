package StreamsPratice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsB {
	public static void main(String args[]) {
//		List<Integer> list = new ArrayList<Integer>();
//		 
//		for(int i = 1; i< 10; i++){
//		      list.add(i);
//		}
//
//		Stream<Integer> stream = list.stream();
////		Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
//		Integer[] arr=stream.toArray(Integer[] :: new);
////		System.out.print(evenNumbersArr);
//		System.out.println(arr.toString());
		List<Integer> list = new ArrayList<Integer>();
		 
		for(int i = 1; i< 10; i++){
		      list.add(i);
		}

		Stream<Integer> stream = list.stream();
		Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
		System.out.print(evenNumbersArr);
		for (int i=0;i<evenNumbersArr.length;i++) {
			System.out.println(evenNumbersArr[i]);
			
		}
		
		
		IntStream streamint  = IntStream.of(1, 2, 3, 4, 5);
		LongStream streamLong = LongStream.of(1, 2, 3, 4, 5);
		DoubleStream streamDouble= DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0);
		 streamint.forEach(System.out::println);
		
	//	System.out.println("streamint:"+ streamint.forEach(System.out::println));
		System.out.println("streamLong:"+streamLong);
		System.out.println("streamDouble:"+streamDouble);
	}

}
