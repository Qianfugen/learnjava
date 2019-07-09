package day5;
import java.util.Scanner;
/**
 1.星期一特价菜：水煮鱼
  星期二特价菜：烧排骨
  星期三，四特价菜：宫爆鸡丁
  星期五，六特价菜：清蒸鲈鱼
  其它：干锅肥肠
用if-else if
 */

public class EatLunch {
	public static void main(String[] args) {
		System.out.println("请问想查看星期几(数字)的食谱：");
		Scanner input = new Scanner(System.in);
		int day = input.nextInt();
		if (day == 1) {
			System.out.println("星期一特价菜：水煮鱼");
		}else if (day == 2) {
			System.out.println("星期二特价菜：烧排骨");
		}else if (day == 3 || day == 4) {
			System.out.println("星期三，四特价菜：宫爆鸡丁");
		}else if (day == 5 || day == 6) {
			System.out.println("星期五，六特价菜：清蒸鲈鱼");
		}else {
			System.out.println("干锅肥肠");
		}
		input.close();
	}
}
