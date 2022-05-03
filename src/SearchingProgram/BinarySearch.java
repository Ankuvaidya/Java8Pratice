package SearchingProgram;

import java.util.Arrays;

public class BinarySearch {

	public static int binarySearch(int arr[], int l, int r, int x) {
		int mid = l + (r - l) / 2;
		if (arr[mid] == x) {
			return mid;
		}
		if (arr[mid] > x) {
			return binarySearch(arr, l, mid - 1, x);

		}
		return binarySearch(arr, mid + 1, r, x);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 11, 1, 2, 3, 4, 555, 66, 77, 98, 88, 22, 33 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int x = 88;
		int l = 0;
		int r = arr.length - 1;
		int index = binarySearch(arr, l, r, x);
		if (index == -1) {
			System.out.println("element not found");

		}
		System.out.println("ELement found at index: " + index);

	}

}
