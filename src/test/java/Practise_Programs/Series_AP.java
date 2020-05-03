package Practise_Programs;
import java.util.Scanner;

public class Series_AP {

	public static void main(String[] args) {

		/*
		 * Program for AP Series in java
		 * 
		 */

		int n = 1, p;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first integer");
		int a = s.nextInt();

		System.out.println("enter the difference");
		int d = s.nextInt();

		System.out.println("Enter the number of terms for you want A.P");
		int noOfTerms = s.nextInt();

		while (noOfTerms != n - 1) {
			p = a + (n - 1) * d;
			n++;
			System.out.println(p);
		}

		
	}

}
