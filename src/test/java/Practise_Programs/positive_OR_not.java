package Practise_Programs;

import java.util.Scanner;

public class positive_OR_not {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int y=s.nextInt();
		
		if(y>0)
		{
			System.out.println("positive number");
		}
		
		
		else if(y==0)
			System.out.println("zero number");
		
		else
			
			System.out.println("negative number");
		
	}
	
	
	
}
