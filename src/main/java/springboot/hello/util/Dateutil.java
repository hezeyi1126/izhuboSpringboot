package springboot.hello.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateutil {
	public static SimpleDateFormat sdf = new SimpleDateFormat("YYYY-DD-MM hh:dd:mm");
	public static  String parseDateToString(Date date) {
		return sdf.format(date);
	}
	
	public static Date parseStrToDate(String dateStr) {
		try {
			return sdf.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static Date reget(Date date){
		return parseStrToDate(parseDateToString(date));
	}
}
