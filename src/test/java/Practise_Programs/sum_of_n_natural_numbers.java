package Practise_Programs;

import java.util.Scanner;

public class sum_of_n_natural_numbers {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int y=s.nextInt();
		int sum=0;
		for(int i=0;i<=y;i++)
		{
			sum+=i;
		}
		
		System.out.println(sum);
		
		
		
	}
	
	
	
}
