package string;

import java.util.Scanner;

public class Register {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String username=new String();
		String password=new String();
		System.out.println("输入用户名：");
		username=input.next();
		System.out.println("输入密码：");
		password=input.next();
		
		//判断用户名只能是英文，不能是其他符号
		if(isValidEnglishName(username)) {
			System.out.println("用户名有效");
		}else {
			System.out.println("输入字符为非法字符！");
		}
		
		if(password.length()>=6) {
			System.out.println("注册成功！");
		}else {
			System.out.println("注册失败！");
			System.out.println("密码长度至少6位");
		}
	}
	
	/**
	 * 判断输入字符是否有效
	 * @param name
	 * @return
	 */
	public static boolean isValidEnglishName(String name) {
		boolean isValid=true;
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			if(!((c>=65&&c<=90)||(c>=97&&c<=122))) {
				isValid=false;
			}
		}
		return isValid;
	}
}
