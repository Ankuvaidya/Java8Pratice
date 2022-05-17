package NumberPratice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalDateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();

		ZoneId zoneId = ZoneId.of("Europe/Paris");
		LocalDateTime dateZone = LocalDateTime.now(zoneId);
		ZoneId zoneIdIndia = ZoneId.of("Russia");
		LocalDateTime zoneIndia = LocalDateTime.now(zoneIdIndia);
		
		System.out.println("dateZone"+dateZone);
		
		System.out.println("zoneIndia"+zoneIndia);
		System.out.println("date" + date);
		LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
		System.out.println("beginningOfDay" + beginningOfDay);

	}

}
