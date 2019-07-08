package cn.zlxy;

public class CalDay {
	public static void main(String[] args) {
		final int DAYS_PER_WEEK = 7;
		int days = 86;
		int weeks = days/DAYS_PER_WEEK;
		int leftDay = days%DAYS_PER_WEEK;
		System.out.printf("%dÌì¿ç%dÖÜ£¬Óà%dÌì\n", days, weeks, leftDay);
	}
}
