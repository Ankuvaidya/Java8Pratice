class A{
	public  static int  a=10;
	A(){
		
	}
	public static void add() {
		System.out.println("in class A");
	}
}
class B extends A{
	public static void add1() {
		System.out.println("in class B");
	}
	
}
public class InheritDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A z= new B();
		z.add();
		A.add();
		int ansd=A.a;
		int ans=z.a;
		System.out.println(ans +"ans");

	}

}
