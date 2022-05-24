
public class Student {
	
	
	private int age ;
	private String name;
	private String dept;
	public Student(int age, String name, String dept) {
		super();
		this.age = age;
		this.name = name;
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [age=" + age+"saurabh" + ", name=" + name+"saurabh" + ", dept=" + dept+"saurabh" + "]";
	}
	
	public static void main(String[] args) {
	Student s=new Student(1, "ram", "IT");
	System.out.println(s);

	
	
	
	}

	}
