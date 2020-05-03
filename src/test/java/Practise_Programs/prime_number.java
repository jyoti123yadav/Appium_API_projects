package Practise_Programs;

import java.util.Scanner;

public class prime_number {
	public static void main(String[] args) 
	{
		int i, number, count; 
		Scanner s=new Scanner(System.in);
		System.out.println(" enter Prime Numbers upto which u want  ");
		int y=s.nextInt();
		for(number = 1; number <= y; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    }  
		}
	}
}

