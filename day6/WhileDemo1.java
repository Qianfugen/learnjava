package day6;

public class WhileDemo1 {
	public static void main(String[] args) {
		int i=0;
		long time1=System.currentTimeMillis();
		while (i<10000) {
			System.out.println("第"+i+"遍： 好好学习，天天向上");
			i++;
		}
		long time2 = System.currentTimeMillis();
		System.out.println("总计用时："+(time2-time1)+"毫秒");
	}
}
