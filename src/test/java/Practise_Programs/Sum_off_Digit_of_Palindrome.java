package Practise_Programs;

import java.util.Scanner;

public class Sum_off_Digit_of_Palindrome {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int number,sum=0,temp;
		number=num;
		for(;number!=0;number/=10)
		{
			temp=number%10;
			sum=sum*10+temp;
	}	
		
		if(sum==num)
		{
		System.out.println(num+"  is a palindrome Number");	
		}
		
		else 
			System.out.println(num+" is not an palindrome Number");	
	}
	
	
}
