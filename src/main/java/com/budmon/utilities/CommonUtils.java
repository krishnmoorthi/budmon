/**
 * 
 */
package com.budmon.utilities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author kthangav
 *
 */
public class CommonUtils {

	public static long convertDateToLong(String date) {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date afterFmtDate;
		long dateInLong = 0;
		try {
			afterFmtDate = formatter.parse(date);
			dateInLong = afterFmtDate.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dateInLong;
	}
	
	public static int getCurrentYear() {
		return LocalDate.now().getYear();
	}

}
