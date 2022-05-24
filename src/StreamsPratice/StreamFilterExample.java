package StreamsPratice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List < Product > pp=	getProducts();
		 List < Float > r= pp.stream().map(s ->s.getPrice()).filter(s-> s>25000f).collect(Collectors.toList());
		 
r.forEach(System.out::println);
	}
	  private static List < Product > getProducts() {
	        List < Product > productsList = new ArrayList<Product>();
	        productsList.add(new Product(1, "HP Laptop", 25000f));
	        productsList.add(new Product(2, "Dell Laptop", 30000f));
	        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
	        productsList.add(new Product(4, "Sony Laptop", 28000f));
	        productsList.add(new Product(5, "Apple Laptop", 90000f));
	        return productsList;
	    }
}
