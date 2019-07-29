package homework;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 使用正则验证邮箱
 * 1、通过控制台输入注册的邮箱，判断邮箱是否有效
a)要求：合法有效邮箱的条件：
i.必须包含@和.
ii.@只有一个
iii..可以是一个或者是两个
iv.@不能在第一个位置
v..不能在最后一个位置
vi.@必须在.的前面
vii.@与.不能紧挨着
viii.如果有两个.，两个.不能紧挨着
b)邮箱示例
i.admin@sycoding.com
ii.sycdoing@yahoo.com.cn
 * @author 钱富根
 * @version 1.0 2019-07-29
 */

public class Mail2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入邮箱地址：");
		String mailAddress=input.next();
		
		String pattern="^[a-z|A-Z|0-9]+@+[^.]+.*?(\\.)+[^.]+[a-z|A-Z|0-9]+";
		
		boolean isMatch=Pattern.matches(pattern, mailAddress);
		if(isMatch) {
			System.out.println("邮箱通过！");
		}else {
			System.out.println("邮箱地址不合格！");
		}
	}
}
