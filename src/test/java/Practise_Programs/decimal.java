package Practise_Programs;

import java.util.Scanner;

public class decimal {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		int[] rem=new int[20];
		int index=0;
		
		while(num>0)
		{
			rem[index]=num%2;
			index++;
			num=num/2;
		}
		
		
		for(int i=(index-1);i>0;i--)
		{
			System.out.println(rem[i]);
		}
		
		
		
		}
		
		
	}
	
	

