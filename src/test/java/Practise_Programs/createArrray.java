package Practise_Programs;

import java.util.Scanner;

public class createArrray {
	
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	System.out.println("enter the numbers");
	int c=s.nextInt();	
	int[] a=new int[c];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	a[5]=60;
	
	for(int i=0;i<a.length;i++)
	{
	
	System.out.println(a[i]);
	}
	
	}

}
