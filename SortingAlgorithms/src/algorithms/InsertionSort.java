package algorithms;

public class InsertionSort {
	public void isort(int arr[], int n){
		int key, j, i;
		for(i=1; i<n;i++){
			
			j=i-1;
			key = arr[i];
			
			while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
}
