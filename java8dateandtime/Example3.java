package com.java8dateandtime;

import java.time.LocalDate;
import java.time.Period;
 
public class Example3 {
 
	public static void main(String[] args) {
		LocalDate birthday=LocalDate.of(2003, 01, 17);
		LocalDate currentdate=LocalDate.now();
	Period p=Period.between(birthday, currentdate);
System.out.printf("Your age is %d years %d months and %d days",p.getYears(),p.getMonths(),p.getDays());
	}
 
}
 