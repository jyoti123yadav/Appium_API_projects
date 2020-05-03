package Practise_Programs;

import java.time.LocalDate;
import java.time.Period;

public class period {

	
	public static void main(String[] args) {
		
		
		LocalDate Birthday =LocalDate.now();
		LocalDate today=LocalDate.now();
		Period p=Period.between(Birthday, today);
//		System.out.println(p.getYears(),p.getMonths(),p.getDays());
		
		
		
	}
	
	
	
}
