
public class OutOfMemoryExDemo {
	 public void createArray(int size) {
	        try {
	            Integer[] myArray = new Integer[size];
	        }
	        catch( Error e) {
	        	System.out.println(e);
	        }
	        
	        
//	        catch 
//	        
//	        (OutOfMemoryError oome) {
//	            //Log the info
//	            System.err.println("Array size too large");
//	            System.out.println(oome);
//	            System.err.println("Max JVM memory: " + Runtime.getRuntime().maxMemory());
//	        }
	    }
	public static void main(String[] args) {
		OutOfMemoryExDemo d= new OutOfMemoryExDemo();
		d.createArray(1000*1000*1000);
}
}
