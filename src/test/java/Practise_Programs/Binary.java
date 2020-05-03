package Practise_Programs;

public class Binary {

	public static void main(String[] args) {
		
		String binarystring="10101";	
		int temp=Integer.parseInt(binarystring);
		System.out.println(temp);
		
		int power=0;
		int decimalNo=0;
		while(temp!=0)
		{
			int rem=temp%10;
			decimalNo=decimalNo+(int)(rem*Math.pow(2, power));
			power++;
			temp=temp/10;
		}
		
		System.out.println(decimalNo);
		
	}
	
	
	
}
