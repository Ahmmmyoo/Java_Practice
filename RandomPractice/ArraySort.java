import java.util.Random;
import java.util.Scanner;

public class ArraySort {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int arrSize = 0 ;

		System.out.print("Enter Array Size : ");
		arrSize = sc.nextInt(); sc.nextLine();

		int[] arr = new int[arrSize] ;

		for(int i=0 ; i<arr.length ; i++ ) {
			arr[i] = ran.nextInt(9) ;
		}



		System.out.println("") ;
		for(int i=0 ; i<arr.length ; i++ ) {
			System.out.print(" "+arr[i]) ;
		}
		System.out.print("\nArray Lenght : "+arr.length) ;

		int runSort = 1 ;
		int sortDone = 0 ;

		while(runSort == 1) {
			sortDone = 0 ;
			for(int i=0 ; i<(arr.length-1) ; i++ ) {
				if(arr[i] > arr[i+1]) {
					int s = arr[i+1] ;
					arr[i+1] = arr[i] ;
					arr[i] = s ;
					sortDone = 1 ;
				}
			}
			if(sortDone == 0)
			runSort = 0;
		}

		System.out.println("") ;
		for(int i=0 ; i<arr.length ; i++ ) {
			System.out.print(" "+arr[i]) ;
		}

	}
}