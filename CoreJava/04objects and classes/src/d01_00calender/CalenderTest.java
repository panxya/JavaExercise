package d01_00calender;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @versionV1.0
 * 
 * @author 小杨
 *
 */
public class CalenderTest {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		int today = date.getDayOfMonth();
		int month = date.getMonthValue();
//讲今天前的today-1（1号）天设置为第一天
		date = date.minusDays(today - 1);// set to start of month
		DayOfWeek weekday = date.getDayOfWeek();
		int value = weekday.getValue();
//缩进打印
		System.out.println("Mon Tue Wed Thu Fre Sat Sun");
		for (int i = 1; i < value; i++) {
			System.out.print("    ");
		}
		while (date.getMonthValue() == month) {
			System.out.printf("%3d", date.getDayOfMonth());
			if (date.getDayOfMonth() == today) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
			date = date.plusDays(1);
			if (date.getDayOfWeek().getValue() == 1) {
				System.out.println();
			}

		}
		if (date.getDayOfWeek().getValue() != 1) {
			System.out.println();
		}
	}
}