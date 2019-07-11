package day7;
import java.util.Arrays;
/**
 * copy数组
 * 修改数组元素
 * 删除数组元素
 * @author root
 *
 */
public class Copy {
	public static void main(String[] args) {
		//copy数组
		double[] bank = {1.1, 3.2, 5.20, 3.6, 9.7, 6.8};
		double[] bankcopy = Arrays.copyOf(bank, bank.length);
		System.out.println("bank:");
		for(int i=0;i<bank.length;i++) {
			System.out.print(bank[i]+" ");
		}
		System.out.println();
		System.out.println("bankcopy:");
		for(int i=0;i<bank.length;i++) {
			System.out.print(bankcopy[i]+" ");
		}
		//修改数组元素
		System.out.println("\n修改数组元素");
		bank[1] = 0.0;
		for(int i=0;i<bank.length;i++) {
			System.out.print(bank[i]+" ");
		}
		//删除数组元素
		System.out.println("\n删除数组元素");
		System.out.println("删除数组元素1");
		double[] bank2 = Arrays.copyOfRange(bank, 1, bank.length);
		for(int i=0;i<bank2.length;i++) {
			System.out.print(bank2[i]+" ");
		}
		
	}
}
