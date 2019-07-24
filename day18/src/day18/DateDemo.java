package day18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date now=new Date("2018-07-22");
		System.out.println(now.toString());
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String s=sdf.format(now);
		System.out.println(s);
	}
}
