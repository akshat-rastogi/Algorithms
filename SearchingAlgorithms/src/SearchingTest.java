import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import algorithms.LinearSearch;

public class SearchingTest {
	
	static int arr[];
	static int n;
	static Scanner scan = new Scanner(System.in);
	/***************** 
	 * Method to get array 
	 *****************/
	private static void getArray(){
		
		System.out.println("Enter length of array:");
		n = scan.nextInt();
		arr = new int[n];
		
		System.out.println("\nEnter array elements:");
		for (int i=0; i<n;i++){
			arr[i] = scan.nextInt();
		}
	}
	
	public static void main(String[] args) {
		try{
			int index = -1;
			SearchingTest.getArray();
			
			    	
			System.out.println("\nEnter element to search:");
			index = scan.nextInt();
			
			System.out.println(index);
			
			LinearSearch ls = new LinearSearch();
			System.out.println("\n\n Element Found at index:"+ ls.linearSearch(arr,n,index)); 
		}
		finally{
			if(scan!=null)
				scan.close();
		}
		
	}

}
