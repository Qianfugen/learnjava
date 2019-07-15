package day10;
import java.util.Scanner;

public class TouristTest {
	public static void main(String[] args) {
		//创建游客
		Tourist tour = new Tourist();
		Scanner input = new Scanner(System.in);
		do {
			//输入姓名
			System.out.println("请输入姓名：");
			tour.name = input.next();
			if(tour.name.equalsIgnoreCase("n")) {
				break;
			}
			//输入年龄
			System.out.println("请输入年龄：");
			tour.age = input.nextInt();
			//打印门票
			tour.getTicket();
			System.out.println();
		}while(true);
		System.out.println("退出程序");
	}
}
