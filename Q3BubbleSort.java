import java.util.Scanner;

public class Q3BubbleSort {
	static int count=0;
	
	void bubbleSort(int arr[]) {
		for(int i=0; i< arr.length-1 ; i++) {
			for(int j=1 ; j<arr.length ; j++) {
				if(arr[j-1] > arr[j]) {
					int temp= arr[j-1];
					arr[j-1]=arr[j];
					arr[j]= temp;
				}
			}
		}
	}
	
	int binarySort(int arr[], int key) {
		int start=0;
		int end=arr.length;
		int mid=0;
		while(start < end) {
			count++;
			mid=(start+end)/2;
			if(key > arr[mid]) {
				start=mid+1;
			}else {
				end=mid;
			}
		}
		return start;
	}
	
	static void display(int arr[]) {
		for(int i=0 ; i< arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Array Size: ");
		int N = in.nextInt();
		int arr[]=new int[N];
		
		for(int i=0 ; i<N ;i++) {
			int A=in.nextInt();
			arr[i]=A;
		}
		int key=in.nextInt();
		new Q3BubbleSort().bubbleSort(arr);
		display(arr);
		System.out.println(new Q3BubbleSort().binarySort(arr, key));
		System.out.println("No Of Comparism: "+count);
	}

}
