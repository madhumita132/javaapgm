package java8test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class  test1  {

 public static void main(String[] args) throws ParseException {
	 
	 //date-time classes provide the static method now() which fetches the date(for LocalDate), time(for LocalTime)
	 //and date-time(for LocalDateTime) from the system clock of the machine on which the JVM is running. 
	 
	 LocalDate localDate = LocalDate.now();
	 System.out.println("localDate: "+localDate);
	  
	 LocalTime localTime =LocalTime.now();
	 System.out.println("localTime: "+localTime);
	  
	 LocalDateTime localDateTime =LocalDateTime.now();
	 System.out.println("localDateTime: "+localDateTime);
	 
	 //of() method takes as input the individual values constituting date-time as int parameters.
	 //These are values corresponding to date, month, year, hours, minutes, seconds and seconds in int format
	 LocalDate localDate1 = LocalDate.of(2016,12,01);
	 System.out.println("localDate: "+localDate1);
	 
	  
	 LocalTime localTime1 =LocalTime.of(23,12,56,234);
	 System.out.println("localTime: "+localTime1);
	  
	 LocalDateTime localDateTime1 =LocalDateTime.of(2016,12,01,23,12,56,234);
	 System.out.println("localDateTime: "+localDateTime1);
	  
	 LocalDate localDateNov = LocalDate.of(2016, Month.NOVEMBER,01);
	 System.out.println("localDateNov: "+localDateNov);
	 
	 // The plus/minus methods work by adding or subtracting the required number of days, months, years, hours, minutes, seconds and nanoseconds
	 //to objects. Each of the classes provide methods for plus/minus for each field of date and time they store.
	 //So, LocalDate has plusDays() and minusDays() methods, while LocalTime has a plusMinutes() and minusMinutes() methods, 
	 System.out.println("Today: "+LocalDate.now());
	 LocalDate todayPlus10Days=LocalDate.now().plusDays(10);
	 System.out.println("localDatePlus10: "+todayPlus10Days);
	  
	 System.out.println("Time Now: "+LocalTime.now());
	 LocalTime nowMinus20Minutes=LocalTime.now().minusMinutes(20);
	 System.out.println("nowMinus20Minutes: "+nowMinus20Minutes);
	  
	 System.out.println("Date-Time Now: "+LocalDateTime.now());
	 LocalDateTime nowPlus2Years =LocalDateTime.now().plusYears(2);
	 System.out.println("todayPlus2Years: "+nowPlus2Years);
	 
	 // LocalDate has a withDaysOfMonth() method, while LocalTime has a withMinute() method, and so on. 
	 
	 System.out.println("Today: "+LocalDate.now());
	 LocalDate dayOfMonth20=LocalDate.now().withDayOfMonth(20);
	 System.out.println("Day of month set as 20: "+dayOfMonth20);
	  
	 System.out.println("Time Now: "+LocalTime.now());
	 LocalTime minute0=LocalTime.now().withMinute(0);
	 System.out.println("Minutes set to 0: "+minute0);
	  
	 System.out.println("Date-Time Now: "+LocalDateTime.now());
	 LocalDateTime month10 =LocalDateTime.now().withMonth(10);
	 System.out.println("Month set to 10: "+month10);
	 
// LocalDate has getDayofMonth(), getMonth(), getDays() methods, while LocalTime has getHour(), getMinute(), getSecond(), getNano() methods. 
//Similarly there are get() methods for LocalDateTime.
	 
	    System.out.println("Today: "+LocalDate.now());
	    int dayOfMonth=LocalDate.now().getDayOfMonth();
	    System.out.println("Day of month is: "+dayOfMonth);
	     
	    System.out.println("Time Now: "+LocalTime.now());
	    int minute=LocalTime.now().getMinute();
	    System.out.println("Minutes value is: "+minute);
	     
	    System.out.println("Date-Time Now: "+LocalDateTime.now());
	    Month month = LocalDateTime.now().getMonth();
	    System.out.println("Month value is: "+month.getValue());

	//The getActualMaximum() method of java.util.Calendar class returns an integer value which is the Maximum possible value of the calendar field passed as parameter to getActualMaximum() method. 
	    //For example Maximum value for DATE field is 31, and similarly Maximum value for MONTH field is 11 . 
     LocalDate now = LocalDate.now(); 
     LocalDate lastDayOfYear = now.with(TemporalAdjusters.lastDayOfYear());
     Period p = now.until(lastDayOfYear);
     Calendar c1 = Calendar.getInstance();
    System.out.println("Months remaining in the year: "+p.getMonths());	
		
	int MaxYear = c1.getActualMaximum(Calendar.YEAR);
	int MaxMonth = c1.getActualMaximum(Calendar.MONTH);
	int MaxWeek = c1.getActualMaximum(Calendar.WEEK_OF_YEAR);
	int MaxDate = c1.getActualMaximum(Calendar.DATE);
	
	System.out.println("1..Maximum Year: "+MaxYear);
	System.out.println("Maximum Month: "+MaxMonth);
	System.out.println("Maximum Week of Year: "+MaxWeek);
	System.out.println("Maximum Date: "+MaxDate+"\n");
	//using Calendar Object to find the age 
  String s = "2000/02/13";
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
  Date d = sdf.parse(s);
  Calendar c = Calendar.getInstance();
  c.setTime(d);
  int year = c.get(Calendar.YEAR);
  int month1 = c.get(Calendar.MONTH) + 1;
  int date = c.get(Calendar.DATE);
  LocalDate l1 = LocalDate.of(year, month1, date);
  LocalDate now1 = LocalDate.now();
  int maxDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
  
  System.out.println("Number of Day in a month: " + maxDay);
  Period diff1 = Period.between(l1, now1);
  System.out.println("calculate age:" + diff1.getYears() + "years");
  
		
 
 }
}
