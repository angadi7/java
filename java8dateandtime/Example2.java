package com.java8dateandtime;

import java.time.LocalDateTime;
import java.time.Month;
 
public class Example2 {
	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.now();
		//System.out.println(dt);
		@SuppressWarnings("unused")
		int d=dt.getDayOfMonth();
		@SuppressWarnings("unused")
		int m=dt.getMonthValue();
		@SuppressWarnings("unused")
		int y=dt.getYear();
		//System.out.printf("%d-%d-%d",d,m,y);
		//System.out.println();
		@SuppressWarnings("unused")
		int h=dt.getHour();
		@SuppressWarnings("unused")
		int min=dt.getMinute();
		@SuppressWarnings("unused")
		int sec=dt.getSecond();
		@SuppressWarnings("unused")
		int nan=dt.getNano();
		//System.out.printf("%d:%d:%d:%d",h,mi,s,n);
		//LocalDateTime.of(yy,mm,dd,h,m,s,n);
		LocalDateTime dt1=LocalDateTime.of(1993,Month.JUNE,03,8,32);
		System.out.println("After 6 months "+dt1.plusMonths(5));
		System.out.println("After 6 months "+dt1.minusMonths(5));
}
}
