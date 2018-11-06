package algorithms;

public class InterpolationSearch {
	
	//Very same as binary search except the mid position calculation
	public int search(int arr[], int l, int h, int x){
		if(l<=h && x >= arr[l] && x <= arr[h]){
			
			//formula for position
			// pos = lo + [ (x-arr[lo])*(hi-lo) / (arr[hi]-arr[Lo]) ]
			
			int pos = l + (((h-l) / (arr[h]-arr[l]))*(x - arr[l]));
			
			if(arr[pos] == x)
				return pos;
			if(arr[pos]>x)
				return search(arr,l, pos-1, x);
			return search(arr,pos+1, h, x);	
		}
		return -1;
	}
}
