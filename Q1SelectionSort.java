
public class Q1SelectionSort {

	void selection(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			int minimum = arr[i];
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (minimum > arr[j]) {
					minimum = arr[j];
					index = j;
				}
			}
			if (index != i) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
			
		}
	}

	static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 40, 20, 30, 50, 10 };
		new Q1SelectionSort().selection(arr);
		display(arr);
	}

}
