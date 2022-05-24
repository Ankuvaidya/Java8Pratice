package StreamsPratice;

import java.util.HashMap;
import java.util.Map;

public class IterateMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer, String> hm=new HashMap<>();
		hm.put(1, "India");
		hm.put(2, "Pak");
		hm.put(3, "russia");
		hm.put(4, "spain");
		
		hm.entrySet().forEach(each ->{
			System.out.println(each.getValue());
		});
		hm.entrySet().forEach(s->{
			System.out.println(s.getKey());
		});
		
		hm.get(1)
;		
		System.out.println("using iterator");
		
		for (Integer key:hm.keySet()) {
			System.out.println(key+"="+hm.get(key));
			
		}
		
		for(Map.Entry<Integer, String> r: hm.entrySet()){
			System.out.println(r.getKey()+":"+r.getValue());
		}
		
		
		

	}

}
