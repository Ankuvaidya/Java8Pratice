import java.util.HashSet;

public class Customer {

	private String name;
	private int age;

	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("anku", 20);
		Customer c2 = new Customer("anku", 20);
		System.out.println("c1 : " + c1.hashCode());
		System.out.println("c2 : " + c2.hashCode());
		HashSet<Customer> cs = new HashSet<Customer>();
		cs.add(c1);
		cs.add(c2);
		System.out.println("size of hashSet " + cs.size());

		String s1 = "ankita";
		String s2 = "ankit";
		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
