public class BubbleSort {
	void sort(int arr[], int n){
		for (int i=0; i<n;i++){
			for(int j=0; j<n-i-1;j++){
				// If element is greater than the element 
				// just after it then swap it 
				if(arr[j]>arr[j+1]){			
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
