package Practise_Programs;

import java.util.Scanner;

public class leap_yearr {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int y=s.nextInt();
		
		if((y%4==0) && (y%100!=0) || (y%400==0) )
		{
			System.out.println("leap year");
		}
		
		else
			System.out.println("not a leap year");
	
	
	}
}
