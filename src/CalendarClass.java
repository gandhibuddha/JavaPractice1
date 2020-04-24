import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class CalendarClass {
    public static void main(String[] args) {
  // To store dates like a birthday or anniversary, visiting a place, or starting a job, school, or college, you don’t need to store the time.
        // LocalDate will work perfectly in this case.
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalDate ld1 = LocalDate.parse("1995-12-26"); //Parses the input string to produce an instance of the target class.
        System.out.println(ld1);
        System.out.println(ld1.getDayOfWeek());
        System.out.println(ld1.minusDays(30)); //LocalDate is immutable. All the methods that seem to manipulate its value return a copy of the LocalDate instance on which it’s called.
        LocalTime time = LocalTime.parse("15:08:23");
        System.out.println(time.getHour());
        LocalTime raceStartTime = LocalTime.of(8, 10, 55);
        LocalTime raceEndTime = LocalTime.of(8, 11, 11);
        // If you want to store both date and time (without the time zone), use the class LocalDateTime. It stores a value like 2050-06-18T14:20:30:908765 (year-month-dayThours:minutes:seconds:nanoseconds).
        Period p = Period.of(0,0,2);
        System.out.println(p.getMonths());
    }
}
