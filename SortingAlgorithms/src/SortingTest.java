import java.util.Scanner;

public class SortingTest {

	static int arr[];
	static int n;
	
	/***************** 
	 * Method to get array 
	 *****************/
	private static void getArray(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of array:");
		n = sc.nextInt();
		
		arr = new int[n];
		
		System.out.println("\nEnter array elements:");
		for (int i=0; i<n;i++){
			arr[i] = sc.nextInt();
		}
		
	}
	
	/***************** 
	 * Method to print array 
	 *****************/
	private static void printArray(){
		for (int i=0; i<n;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// Get User Input
		SortingTest.getArray();
		
		// 1. Bubble Sort		
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(arr);
		System.out.println("\n\n Bubble Sort Output (Sorted Array):");
		SortingTest.printArray();
		
	}

}
