package algorithms;

public class BinarySearch {
	public int search(int arr[], int l, int r, int x){
		if(l<=r){
			
			int mid = (r+l)/2;
			if(arr[mid] == x)
				return mid;
			if(arr[mid]>x)
				return search(arr,l, mid-1, x);
			return search(arr,mid+1, r, x);	
		}
		return -1;
	}
}
