package day23;

import java.util.Scanner;

public class StringBufferDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入字符串:");
		String str = input.next();
		StringBuffer s = new StringBuffer(str);

		for(int i=3;i<s.length();i+=4) {
			s.insert(i,',');
		}
		System.out.println(s);

	}
}
