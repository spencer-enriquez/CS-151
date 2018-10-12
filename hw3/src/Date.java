import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.*;

public class Date {
	public static void main(String[] args) {
		
		Instant now = Instant.now();
		ZonedDateTime today = now.atZone(ZoneId.of("America/Los_Angeles"));		//works
		
		ZonedDateTime birthday = today.withDayOfMonth(2);
		birthday = birthday.withMonth(3);
		birthday = birthday.withYear(1999);		
		System.out.println("Number of days since birthday: " + birthday.until(today, ChronoUnit.DAYS));
	}
}
