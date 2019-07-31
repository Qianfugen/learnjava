package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class TestCalendar {
	public static void main(String[] args) {
		//测试Date
		Date now =new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String str=sdf.format(now);
		System.out.println("当前时间: "+str);
		
		//测试Calendar
		Calendar cal=Calendar.getInstance();
		cal.set(2015, 4, 7);
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		
		
	}
}
