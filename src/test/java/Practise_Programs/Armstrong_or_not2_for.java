package Practise_Programs;

import java.util.Scanner;

public class Armstrong_or_not2_for {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int number,sum=0,temp;
		number=num;
		for(;number!=0;number/=10)
		{
			temp=number%10;
			sum=sum+temp*temp*temp;
	}	
		
		if(sum==num)
		{
		System.out.println(num+"  is a Armstrong Number");	
		}
		
		else 
			System.out.println(num+" is not an Armstrong Number");	
	}
	
	
}
