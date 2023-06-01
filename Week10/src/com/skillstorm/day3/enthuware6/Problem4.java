package com.skillstorm.day3.enthuware6;
import java.time.*;
public class Problem4 {
	
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		LocalDate ld2 = ld.plus(Period.of(0, 1, 1));
		LocalDate ld3 = ld.plus(Period.ofMonths(1).ofDays(1));
		System.out.println(ld2);
		System.out.println(ld3);
	}

}
