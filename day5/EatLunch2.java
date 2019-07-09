package day5;
import java.util.Scanner;
/**
 1.星期一特价菜：水煮鱼
  星期二特价菜：烧排骨
  星期三，四特价菜：宫爆鸡丁
  星期五，六特价菜：清蒸鲈鱼
  其它：干锅肥肠
用switch-case
 */

public class EatLunch2 {
	public static void main(String[] args) {
		System.out.println("请问想查看星期几的食谱(请输入数字)：");
		Scanner input = new Scanner(System.in);
		int day = input.nextInt();
		
		switch(day) {
		case 1: System.out.println("星期一特价菜：水煮鱼");
				break;
		case 2: System.out.println("星期二特价菜：烧排骨");
				break;
		case 3:case 4: System.out.println("星期三，四特价菜：宫爆鸡丁");
				break;
		case 5:case 6: System.out.println("星期五，六特价菜：清蒸鲈鱼");
				break;
		default: System.out.println("干锅肥肠");
		}
		input.close();
	}
}
