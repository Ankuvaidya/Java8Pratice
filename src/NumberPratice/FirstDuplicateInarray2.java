package NumberPratice;

public class FirstDuplicateInarray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,2,3,45,2};
		
		int[] arr2=arr;
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr2[j]) {
					System.out.println(arr[i]);
					return;
				}
			}
		}
	}

}
