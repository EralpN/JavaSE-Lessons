package com.bilgeadam.lesson027;

import java.time.Instant;
//import java.time.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeTester
{

	public static void main(String[] args)
	{
		System.out.println(LocalTime.now());
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		System.out.println(ZonedDateTime.now(ZoneId.of("America/New_York")));
		System.out.println(OffsetTime.now());
		System.out.println(OffsetDateTime.now());
		System.out.println(MonthDay.now());
		System.out.println(YearMonth.now());
		System.out.println(Instant.now());
		
		LocalDate time1 = LocalDate.of(2022, 12, 19);
		System.out.println(time1);
		time1 = LocalDate.parse("2021-11-20");
		System.out.println(time1);
		
		LocalDateTime time2 = LocalDateTime.parse("2011-05-25T15:45");
		System.out.println(time2);
				
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM YYYY");
		System.out.println(time1.format(formatter));
		System.out.println(time1.format(DateTimeFormatter.ofPattern("dd MMM YYYY")));
		System.out.println(time1.format(DateTimeFormatter.ofPattern("dd MMMM YYYY")));
		System.out.println(time1.format(DateTimeFormatter.ofPattern("dd MMMM YY")));
		System.out.println(time1.format(DateTimeFormatter.ofPattern("dd MMMMM YYYY")));
		System.out.println(time1.format(DateTimeFormatter.ofPattern("d M Y")));
	}

}
