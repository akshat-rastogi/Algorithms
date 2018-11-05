

public class MergeSort {

	void merge(int arr[], int left, int mid, int right){
		
		int n1 = mid - left + 1;   //Upper limit - lower limit #mid included
		int n2 = right - mid;      //Upper limit - lower limit #mid not included 
		
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];
		
		for(int i=0;i<n1;i++){
			leftArr[i] = arr[i+left];
		}
		for(int j=0;j<n2;j++){
			rightArr[j] = arr[j+mid+1]; //copy elements after mid
		}
		
		int k=left;
		int i = 0, j = 0;
		while (i<n1 && j<n2){
			if(leftArr[i]<rightArr[j]){
				arr[k] = leftArr[i];
				i++;
			}
			else{
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		
		while (i<n1){
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		
		while (j<n2){
			arr[k] = rightArr[j];
			j++;
			k++;
		}
		
	}
	void sort(int[] arr, int left, int right) {
		if(left<right){
			int mid = (left+right) /2;
			
			sort(arr, left, mid);
			sort(arr, mid+1, right);
			
			merge(arr, left, mid, right);
		}
	}
	
	

}
