import java.util.Scanner;

public class SearchingTest {
	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
