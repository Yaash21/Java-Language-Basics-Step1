package org.stackroute2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {

	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		System.out.println(dateFormat.format(calendar.getTime()));
		for (int i = 0; i < 6; i++) {
			calendar.add(Calendar.DATE, 1);
		}
		System.out.println(dateFormat.format(calendar.getTime()));
	}
}