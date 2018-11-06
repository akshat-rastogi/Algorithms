package algorithms;

public class JumpSearch {
	public int search(int arr[], int n, int x){
		
		int step = (int)Math.floor(Math.sqrt(n));
		int prev = 0;
		
		// Block Search
		while(arr[Math.min(step, n)-1] <x){
			
			//Storing previous state
			prev = step;
			
			step += (int)Math.floor(Math.sqrt(n));
			if(prev >=n)
				return -1;
		}
		
		//Linear Search within a block
		while(arr[prev] < x){
			prev++;
			if(prev == Math.min(step, n))
				return -1;
		}
		
		if(arr[prev] == x){
			return prev;
		}
		
		return -1;
	}
}
