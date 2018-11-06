
import java.util.Scanner;
import algorithms.BinarySearch;
import algorithms.JumpSearch;
import algorithms.LinearSearch;

public class SearchingTest {
	static Scanner scan = new Scanner(System.in);
	/***************** 
	 * Method to get array 
	 *****************/
	private static int[] getArray(){
		int arr[],n;
		System.out.println("Enter length of array:");
		n = scan.nextInt();
		arr = new int[n];
		
		System.out.println("\nEnter array elements:");
		for (int i=0; i<n;i++){
			arr[i] = scan.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		try{
			int x = -1, arr[], n;
			
			System.out.println("Please choose an option:");
			System.out.println("1. Linear Search");
			System.out.println("2. Binary Search");
			System.out.println("3. Jump Search");
			System.out.println("Enter your choice:");
			int option = scan.nextInt();
			switch(option){
				case 1:
					// 1. Linear Search
					arr = SearchingTest.getArray();
					n = arr.length;
					    	
					System.out.println("\nEnter element to search:");
					x = scan.nextInt();
					
					LinearSearch ls = new LinearSearch();
					System.out.println("\n\n Element Found at index:"+ ls.search(arr,n,x)); 
					break;
					
				case 2:
					//2. Binary Search
					System.out.println("\nPlease enter sorted array for Binary search:");
					arr = SearchingTest.getArray();
					n = arr.length;
					
					System.out.println("\nEnter element to search:");
					x = scan.nextInt();
					
					BinarySearch bs = new BinarySearch();
					System.out.println("\n\n Element Found at index:"+ bs.search(arr,0,n-1,x)); 
					break;
				case 3:
						//3. Jump Search
						System.out.println("\nPlease enter sorted array for Jump search:");
						arr = SearchingTest.getArray();
						n = arr.length;
						
						System.out.println("\nEnter element to search:");
						x = scan.nextInt();
						
						JumpSearch js = new JumpSearch();
						System.out.println("\n\n Element Found at index:"+ js.search(arr,n,x)); 
						break;
					
				default:
					System.out.println("Invalid Option");
					break;
			}	
		}
		finally{
			if(scan!=null)
				scan.close();
		}
		
	}

}
