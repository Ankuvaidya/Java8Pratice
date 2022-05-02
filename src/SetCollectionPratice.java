import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetCollectionPratice {
	public static void main(String args[]) {
		System.out.println("a");
		Set<String> distinctWords = Arrays.asList(args).stream().collect(Collectors.toSet());
		System.out.println(distinctWords.size() + " distinct words: " + distinctWords);
		
		
		List<Integer> s1= Arrays.asList(1,2,3,4);
		List<Integer> s2= Arrays.asList(11,22,33,44,1,2,5,6);
		Set<Integer> unionall = new HashSet<Integer>(s1);
		unionall.addAll(s2);
		System.out.println("union of set="+unionall);

		Set<Integer> intersection = new HashSet<Integer>(s1);
		intersection.retainAll(s2);
		System.out.println("intersection of set="+intersection);

		Set<Integer> difference = new HashSet<Integer>(s1);
		difference.removeAll(s2);
		System.out.println("difference of set="+difference);
	}
}
