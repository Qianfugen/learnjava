package homework;

import java.util.Scanner;

/**
 * 输入任意字符串，比如“23589456228854”，从最右端开始，每3位加一节号，变成“23,589,456,228,854”
 * 
 * @author 钱富根
 * @version 1.0 2019年7月30日
 */
public class stringDemo {
	public static void main(String[] args) {
		// 扫描器
		Scanner input = new Scanner(System.in);
		System.out.print("请输入字符串:");
		String str = input.next();
		// 使用StringBuffer类
		StringBuffer sBuffer = new StringBuffer(str);

		for (int i = str.length() - 3; i > 0; i -= 3) {
			sBuffer.insert(i, ',');
		}
		System.out.println(sBuffer);

	}

}
