package Practise_Programs;

import java.util.Scanner;

public class perfect_number {
	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int y=s.nextInt();
		int sum=0;
		for(int i=1;i<y;i++)
		{
			if(y%i==0)
			{
				sum+=i;
				
			}
		}
		
		if(sum==y)
		{
			System.out.println("perfect numberr");
		}
		
		else
			System.out.println("not perfect numberr");
		
	}

}
