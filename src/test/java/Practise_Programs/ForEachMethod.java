//package Practise_Programs;
//
//import java.util.ArrayList;
//
//public class ForEachMethod {
//
//	public static void main(String[] args) {
//		
//		ArrayList<Integer> a=new ArrayList<Integer>();
//		
//		a.add(1);
//		a.add(2);
//		a.add(4);
//		a.add(5);
//		
//	
//	/*
//	 * 
//	 * for external loops before java 1.8 	
//	 */
//	for(int i=0;i<a.size();i++)	
//	{
//		System.out.println(a.get(i));
//	}
//		
//	/*
//	 * 
//	 * for external loops before java 1.8 	
//	 */
//		for(int  i:a)
//		{
//			System.out.println(i);
//		}
//		
//		
//		/*
//		 * 
//		 * for internal  loops in  java 1.8 present inside  the collection
//		 */
//		a.forEach(i -> System.out.println(i));
//		
//	}
//	
//	
//	
//}
