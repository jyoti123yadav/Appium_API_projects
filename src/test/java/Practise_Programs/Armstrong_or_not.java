package Practise_Programs;

import java.util.Scanner;

public class Armstrong_or_not {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int number,sum=0,temp;
		number=num;
		while(number!=0)
		{
			temp=number%10;
			sum=sum+temp*temp*temp;
			number=number/10;
		}
		
		if(sum==num)
		{
		System.out.println(num+"  is a Armstrong Number");	
		}
		
		else 
			System.out.println(num+" is not an Armstrong Number");	
	}
	
	
}
