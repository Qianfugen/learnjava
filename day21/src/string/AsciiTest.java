package string;

/**
 * 打印Ascii码
 */
import java.util.Scanner;

public class AsciiTest {
	public static void main(String[] args) {
		for(int i=0;i<128;i++) {
			System.out.println(i+" "+(char)i);
		}
	}
}
