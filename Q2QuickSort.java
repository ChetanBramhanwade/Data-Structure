
public class Q2QuickSort {
	
	public static void quickSort(int arr[], int start , int end) {
		 if(start>= end) {
			 return;
		 }
		 int pidx = partition(arr,start,end);
		 quickSort(arr,start,pidx-1);
		 quickSort(arr,pidx+1,end);
 
	 }
	 
	 public static int partition(int arr[],int start, int end) {
		 int pivot = arr[end];
		 int i = start-1;
		 
		 for(int j=start; j<end ; j++ ) {
			 if(arr[j]<=pivot) {
				 i++;
				 int temp =arr[j];
				 arr[j] = arr[i];
				 arr[i] = temp;
			 }
		 }
		 i++;
		 int temp=pivot;
		 arr[end] = arr[i];
		 arr[i]= temp;
		 return i;
	 }
	 
	static void display(int arr[]) {
		for(int i=0; i< arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {40,20,30,50,10};
		quickSort(arr,0,arr.length-1);
		display(arr);
	}

}
