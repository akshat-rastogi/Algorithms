package algorithms;


public class QuickSort {
	int partition(int arr[], int low, int high){
		int pivot = arr[high];
		int i = low-1;
		for(int j=low; j<high;j++){
			
			if(arr[j]<pivot){
				i++;
				
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = pivot;
		arr[high] = temp;
		
		return i+1;
	}	
	public void qsort(int arr[], int low, int high){
		if(low<high){
			int pi = partition(arr, low, high);
			qsort(arr, low, pi-1);
			qsort(arr, pi+1, high);
			
		}
	}
}
