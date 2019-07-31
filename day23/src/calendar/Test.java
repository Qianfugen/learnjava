package calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) throws ParseException {
//		String str="2019-08-01";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//		Date date=sdf.parse(str);//字符串转日期
//		System.out.println(date);
		Date date=new Date();
		System.out.println(sdf.format(date));//日期转字符串
	}
}
