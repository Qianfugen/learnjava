package day5;
import java.util.Scanner;

public class Examination {
	public static void main(String[] args) {
		System.out.println("检查合格否（Y/N）:");
		Scanner input = new Scanner(System.in);
		char score = input.next().charAt(0);
		
		while (score != 'Y') {
			System.out.println("不合格，重新做！");
			score = input.next().charAt(0);
		}
		
		input.close();
		System.out.println("检查合格，你解放了！");
	}
}
