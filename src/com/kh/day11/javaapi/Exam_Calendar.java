package com.kh.day11.javaapi;

import java.util.Calendar;

public class Exam_Calendar {
	public static void main(String[] args) {
		Exam_Calendar exCal = new Exam_Calendar();
		Calendar today = Calendar.getInstance();
		exCal.printCalendar("현재", today);
		// 현재 2022/12/7/수요일(11시) 오전 11시 42분 33초 234밀리초

		Calendar someDate = Calendar.getInstance();
		someDate.clear();
		someDate.set(2022, 11, 23);
		someDate.set(Calendar.HOUR_OF_DAY, 9);
		someDate.set(Calendar.MINUTE, 0);
		exCal.printCalendar("개강일", someDate);
//		System.out.println();

		Calendar endDay = Calendar.getInstance();
		endDay.clear();
		endDay.set(2023, 4, 2);
		endDay.set(Calendar.HOUR_OF_DAY, 17); // 24시간 표시
		endDay.set(Calendar.MINUTE, 50);
		exCal.printCalendar("종강일", endDay);
		System.out.println();

	}

	public void printCalendar(String msg, Calendar cal) {
//	Calendar today = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfweek = cal.get(Calendar.DAY_OF_WEEK); // 요일 표시
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY); // 24시간 표시
		int ampm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);

		System.out.print(msg + " : " + year + "/" + month + "/" + day + "/");
		switch (dayOfweek) {
		case Calendar.SUNDAY:
			System.out.print("일요일");
			break;
		case Calendar.MONDAY:
			System.out.print("월요일");
			break;
		case Calendar.TUESDAY:
			System.out.print("화요일");
			break;
		case Calendar.WEDNESDAY:
			System.out.print("수요일");
			break;
		case Calendar.THURSDAY:
			System.out.print("목요일");
			break;
		case Calendar.FRIDAY:
			System.out.print("금요일");
			break;
		case Calendar.SATURDAY:
			System.out.print("토요일");
			break;

		}
		System.out.print("(" + hourOfDay + "시)");
		if (ampm == Calendar.AM)
			System.out.print(" 오전 ");
		else
			System.out.print(" 오후 ");
		System.out.println(hour + "시 " + minute + "분 " + second + "초 " + millisecond + "밀리초");
	}
}
