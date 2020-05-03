package Practise_Programs;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int y=s.nextInt();
		int fact=1;
		for(int i=1;i<=y;i++)
		{
			fact=fact*i;
		}
		
		System.out.println(fact);
		
	}
	
	
	
	
}
