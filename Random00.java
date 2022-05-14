import java.util.Scanner;

public class Random00 {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter Number : ");
		int c = s.nextInt();

		System.out.print("Enter Number : ");
		int v = s.nextInt();

		System.out.print("\nSum: " + (c + v));
		System.out.print("\nDif: " + (c - v));
		System.out.print("\nMul: " + (c * v));
		System.out.print("\nDiv: " + (c / v));

	}
}