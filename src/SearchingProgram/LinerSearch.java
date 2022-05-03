package SearchingProgram;

public class LinerSearch {

	public static int search(int arr[], int l, int x) {
		for (int i = 0; i < l; i++) {
			if (arr[i] == x) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int l = arr.length;
		int searchElement = 6;
		int index = search(arr, l, searchElement);
		if (index == -1) {
			System.out.println("Element is not present in the array");
		} else {
			System.out.println(" searchElement : " + searchElement + " is at index : " + index);
		}

	}

}
