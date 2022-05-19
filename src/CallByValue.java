import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 5;
		demo(i);
		System.out.println(i);

		Student s = new Student(21);
		
		studentAge(s);
		System.out.println("Student age is:"+s.getAge());
		final List<Integer> li= new ArrayList<Integer>();
		 
		li.add(6);
		li.add(8);
		System.out.println(li);
		
	}

	public static int demo(int i) {
		i =  10;
		return i;

	}
	
	public static void studentAge(Student s) {
		 s.setAge(30);
	}

}
