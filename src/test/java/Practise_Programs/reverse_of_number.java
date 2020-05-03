package Practise_Programs;

import java.util.Scanner;

public class reverse_of_number {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int reversed=0,n2;
		n2=num;
		while(num!=0)
		{
			 int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num /= 10;
		}
		
		System.out.println("Reverse of the number is " + reversed);
		
	}
	
	
}
