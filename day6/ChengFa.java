package day6;
/**
 * 乘法表
 * @author root
 *
 */
public class ChengFa {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.printf("%d * %d = %d\t", i, j, i*j);
			}
			System.out.println();
		}
	}
}
