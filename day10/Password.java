package day10;
import java.util.Scanner;
/**
 * 定义一个更改密码的类
 * @author root
 *
 */
public class Password {
	Scanner PWD = new Scanner(System.in);
	//创建属性
	String name;
	long oldPwd = 111111;
	long inputPwd;
	long newPwd;
	//构建方法
	public void changPwd() {
		if(oldPwd != inputPwd) {
			System.out.println("用户名和密码不匹配！您没有权限更改管理员信息！");
		}else {
			System.out.println("请输入新密码：");
			newPwd = PWD.nextLong();
			System.out.println("密码修改成功，您的新密码为："+newPwd);
		}
	}
}
