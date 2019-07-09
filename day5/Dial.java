package day5;
import java.util.Scanner;

public class Dial {
	public static void main(String[] args) {
		System.out.println("请输入你所要拨打的电话：1.爸爸 ；2.妈妈；3.爷爷；4.奶奶");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		switch(number) {
		case 1: System.out.println("拨打爸爸号");
		break;
		case 2: System.out.println("拨打妈妈的号");
		break;
		case 3: System.out.println("拨打爷爷的号");
		break;
		case 4: System.out.println("拨打奶奶的号");
		break;
		}
	}
}
