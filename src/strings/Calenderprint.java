package strings;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calenderprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sdf=new SimpleDateFormat("MM/d/YYYY hh:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.getFirstDayOfWeek());
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.ERA));
		System.out.println(cal.get(Calendar.DST_OFFSET));
		System.out.println(cal.get(Calendar.FRIDAY));
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println(cal.get(Calendar.YEAR));

	}

}
