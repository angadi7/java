package com.java8dateandtime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
 
public class Example4 {
public static void main(String[] args) {
	ZoneId zone=ZoneId.systemDefault();
	System.out.println(zone);
	ZoneId ame =ZoneId.of("Europe/Berlin");
	ZonedDateTime ztamer=ZonedDateTime.now(ame);
	System.out.println(ztamer);
}
}
/*
LocalDate
LocalTime
LocalDateTime
Period
Year
TemporalAdjusters / TemporalAdjuster
ZoneId
ZonedDateTime
*/
 