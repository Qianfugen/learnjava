package review;

public class HexToInt {
	public static void main(String[] args) {
		// 十六进制转文本
		String str = "68 65 6C 6F 2C 20 77 6F 72 6C 64 21";
		String[] s = str.split(" ");
		for (String a : s) {
			System.out.print((char) Integer.parseInt(a, 16));
		}
		System.out.println();
		// 文本转十六进制
		String str2 = "hello, world!";
		char[] s2 = str2.toCharArray();
		for (char c : s2) {
			System.out.print(Integer.toHexString(c) + " ");
		}
		System.out.println();

	}
}
