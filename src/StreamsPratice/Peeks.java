package StreamsPratice;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Peeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of("one", "teo","three","four").filter(s ->s.length()>2).
		peek(s -> System.out.println("value are "+s )).collect(Collectors.toList());
		
		
		// @formatter:on


	}

}
