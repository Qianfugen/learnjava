package day6;

/**
 * 打平行四边形
 * @author root
 *
 */
public class TuXing2 {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			//打印空格
			for(int k=i;k<4;k++) {
				System.out.print(" ");
			}	
			//打印星星
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
