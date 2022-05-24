package NumberPratice;

public class FindMissingInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3,4, 6, 7, 8 };
		int res=sum(arr);
		System.out.println(res);

	}

	public static int sum(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			{
				if (!(arr[i + 1] == arr[i] + 1)) {
					return arr[i] + 1;
				}
			}

		}
		return -1;
	}
}
