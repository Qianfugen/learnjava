package day7;
/**
 * 求素数
 * @author root
 *
 */
public class Sushu {
	public static void main(String[] args) {
		int j;
		for(int i=101;i<=200;i++) {
			for(j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					break;
					}
				}
			if(j>Math.sqrt(i)) {			//j>Math.sqrt(i),说明遍历整个循环没中断，以此判定i是质数
				System.out.println(i+"是素数！");
			}
		}
	}
}
