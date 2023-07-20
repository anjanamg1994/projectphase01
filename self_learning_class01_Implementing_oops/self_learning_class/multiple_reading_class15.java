package self_learning_class;
import java.util.*;

public class multiple_reading_class15 {

	public static void main(String[] args) {
		Calendar objCalendar = Calendar.getInstance();
		//display date and time components
		System.out.println("\nDate and Time Components");
		System.out.println("year:" + objCalendar.get(Calendar.YEAR));
		System.out.println("Month:" + objCalendar.get(Calendar.MONTH));
		System.out.println("Date:" + objCalendar.get(Calendar.DATE));
		System.out.println("Hours:" + objCalendar.get(Calendar.HOUR));
		System.out.println("Mintes:" + objCalendar.get(Calendar.MINUTE));
		System.out.println("Seconds:" + objCalendar.get(Calendar.SECOND));
		//LET US ADD 30 MIN TO THE CURRENT TIME
		objCalendar.add(Calendar.MINUTE, 30);
		Date objDate=objCalendar.getTime();
		System.out.println("\ndate and Time");
		System.out.println(objDate);
		
	}

}
