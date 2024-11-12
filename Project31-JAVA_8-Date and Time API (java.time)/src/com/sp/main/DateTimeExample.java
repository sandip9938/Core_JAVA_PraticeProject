package com.sp.main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.Period;
import java.time.Duration;

public class DateTimeExample {

	public static void main(String[] args) {
		// 1. LocalDate - represents a date without time
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(2001, 5, 28);
		LocalDate nextYear = today.plusYears(1);

		System.out.println("Today's Date: " + today);
		System.out.println("Birth Date: " + birthDate);
		System.out.println("One Year from Today: " + nextYear);

		// 2. LocalTime - represents a time without date
		LocalTime currentTime = LocalTime.now();
		LocalTime meetingTime = LocalTime.of(20, 30);
		LocalTime oneHourLater = currentTime.plusHours(1);

		System.out.println("Current Time: " + currentTime);
		System.out.println("Meeting Time: " + meetingTime);
		System.out.println("One Hour Later: " + oneHourLater);

		// 3. LocalDateTime - combines date and time without time-zone
		LocalDateTime currentDateTime = LocalDateTime.now();
		LocalDateTime flightTime = LocalDateTime.of(2024, 12, 15, 10, 45);

		System.out.println("Current Date and Time: " + currentDateTime);
		System.out.println("Scheduled Flight Time: " + flightTime);

		// 4. ZonedDateTime - combines date and time with a time-zone
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		ZonedDateTime specificZone = ZonedDateTime.of(2024, 12, 15, 10, 45, 0, 0, ZoneId.of("America/New_York"));

		System.out.println("Current Date and Time with Zone: " + zonedDateTime);
		System.out.println("Flight Time in New York Time Zone: " + specificZone);

		// 5. Period - represents a date-based amount of time (days, months, years)
		Period age = Period.between(birthDate, today);
		System.out.println(
				"Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days");

		// 6. Duration - represents a time-based amount of time (hours, minutes,
		// seconds)
		Duration meetingDuration = Duration.between(currentTime, meetingTime);
		System.out.println("Duration until meeting: " + meetingDuration.toHours() + " hours and "
				+ meetingDuration.toMinutesPart() + " minutes");

		// 7. DateTimeFormatter - format dates and times
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

		String formattedDate = today.format(dateFormatter);
		String formattedTime = currentTime.format(timeFormatter);

		System.out.println("Formatted Date: " + formattedDate);
		System.out.println("Formatted Time: " + formattedTime);
	}
}
