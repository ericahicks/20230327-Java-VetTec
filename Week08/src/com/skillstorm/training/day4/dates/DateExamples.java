package com.skillstorm.training.day4.dates;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateExamples {
	
	public static void main(String[] args) {
		// LocalDate
		System.out.println(LocalDate.now());
		// LocalTime
		System.out.println(LocalTime.now());

		// LocalDateTime
		System.out.println(LocalDateTime.now());

		// ZonedDateTime
		System.out.println(ZonedDateTime.now());
		
		System.out.println(LocalDate.now().minusDays(90));
		
//		System.out.println(LocalDate.of(2023, 2, 29)); // cannot hand invalid day of month
		System.out.println(LocalDate.of(2024, 2, 29)); // leap year so 2 29 is valid
		
//		System.out.println(LocalTime.of(24, 0)); // valid range 0-23
//		System.out.println(LocalTime.of(14, 60)); // valid range 0-59
		
		System.out.println(LocalTime.now().plusMinutes(5));
		System.out.println(LocalTime.now().plusNanos(5));
		
		// Time till graduation
		System.out.println(Period.between(LocalDate.now(), LocalDate.of(2023, 7, 14)));
		// hours till Friday
		System.out.println(ChronoUnit.HOURS.between(LocalDateTime.now(), LocalDateTime.of(2023, 5, 19, 18, 0)));

		// Seconds till lunch
		System.out.println(ChronoUnit.SECONDS.between(LocalTime.now(), LocalTime.NOON));
		
//		for (Month m : Month.values()) {
//			System.out.println(m + " is month " + (m.ordinal() + 1));
//		}
		
//		ZoneId.getAvailableZoneIds().stream().filter(x->x.contains("US") || x.contains("America")).forEach(System.out::println);

	}

}
