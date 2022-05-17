package NumberPratice;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12121;
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;

		}
		if (temp == sum) {
			System.out.println("its palindrom");
		} else {
			System.out.println("not a palindrom");
		}
		
	}
	}


