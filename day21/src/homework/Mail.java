package homework;

/**
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
*@author 钱富根
*@version 1.0 2019-07-29
 */

import java.util.Scanner;

public class Mail {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int atCounts = 0;// @个数
		int atIndex = 0;// @下标
		int pointCounts = 0;// '.'个数
		int pointIndex = 0;// '.'下标

		// 输入邮箱
		System.out.println("请输入邮箱地址：");
		String mailAddress = input.next();

		// '@'不能置于首位或末尾！
		if (mailAddress.charAt(0) == 64) {
			System.out.println("'@'不能置于首位！");
			return;
		}

		// '.'不能置于末尾
		if (mailAddress.charAt(mailAddress.length() - 1) == 46) {
			System.out.println("'.'不能置于末尾");
			return;
		}

		for (int i = 0; i < mailAddress.length(); i++) {
			char c = mailAddress.charAt(i);

			// 计算'@'个数
			if (c == 64) {
				atCounts++;
				atIndex = i;
			}

			// 计算'.'个数
			if (c == 46) {
				pointCounts++;
				pointIndex = i;
			}

			// '@'必须在'.'之前
			if (pointIndex - atIndex < 0 && pointCounts > 0) {
				System.out.println("'@'必须在'.'之前");
				return;
			}
		}

		// '@'与'.'不能紧挨着
		if (pointCounts > 0 && mailAddress.charAt(atIndex + 1) == 46) {
			System.out.println("'@'与'.'不能紧挨着");
		}
		// 两个'.'之间不能紧挨
		else if (pointCounts == 2 && mailAddress.charAt(pointIndex - 1) == 46) {
			System.out.println("两个'.'之间不能紧挨着！");
		}
		// '@'只能有一个
		else if (atCounts != 1) {
			System.out.println("'@'必须得一个！");
		}
		// '.'需要1-2个！
		else if (pointCounts != 1 && pointCounts != 2) {
			System.out.println("'.'需要1-2个！");
		} else {
			System.out.println("邮箱通过！");
		}

	}
}
