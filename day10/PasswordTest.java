package day10;
import java.util.Scanner;
/**
 * 调用Password类
 * @author root
 *
 */

public class PasswordTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Password pwd = new Password();
		System.out.println("请输入用户名：");
		pwd.name = input.next();
		System.out.println("请输入密码");
		pwd.inputPwd = input.nextLong();
		
		//调用修改密码的方法
		pwd.changPwd();
	}
}
