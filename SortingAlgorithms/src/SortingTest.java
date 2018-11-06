

import java.util.Scanner;

import algorithms.BubbleSort;
import algorithms.InsertionSort;
import algorithms.MergeSort;
import algorithms.QuickSort;
import algorithms.SelectionSort;

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
		bs.bsort(arr,n);
		System.out.println("\n\n Bubble Sort Output (Sorted Array):");
		SortingTest.printArray();

		
		
		
		// 2. Selection Sort		
		SelectionSort ss = new SelectionSort();
		ss.ssort(arr,n);
		System.out.println("\n\n Selection Sort Output (Sorted Array):");
		SortingTest.printArray();

		// 3. Insertion Sort		
		InsertionSort is = new InsertionSort();
		is.isort(arr,n);
		System.out.println("\n\n Insertion Sort Output (Sorted Array):");
		SortingTest.printArray();
		
		// 4. Merge Sort		
		MergeSort ms = new MergeSort();
		ms.msort(arr,0,n-1);
		System.out.println("\n\n Merge Sort Output (Sorted Array):");
		SortingTest.printArray();
		
		// 4. Quick Sort		
		QuickSort qs = new QuickSort();
		qs.qsort(arr,0,n-1);
		System.out.println("\n\n Quick Sort Output (Sorted Array):");
		SortingTest.printArray();
				
				
		
	}

}
