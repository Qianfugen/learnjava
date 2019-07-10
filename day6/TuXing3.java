package day6;
/**
 * 打等腰三角形
 * @author root
 *
 */
public class TuXing3 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			//打空格
			for(int k=0;k<5-i;k++) {
				System.out.print(" ");
			}
			//打星星
			for(int j=0;j<2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
