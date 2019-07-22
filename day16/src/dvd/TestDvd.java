package dvd;

/**
 * 测试DVD信息管理系统
 * @author 钱富根
 * @version 1.0 2019-07-22
 */
import java.util.Scanner;

public class TestDvd {
	// 实例化对象
	Scanner input = new Scanner(System.in);// 扫描器
	DvdOperator op = new DvdOperator();// 操作类实例化

	// 定义属性
	String name;// 名称
	int date;// 日期
	boolean flag;// 判断是否操作成功

	public static void main(String[] args) {
		// 开始测试
		TestDvd ts = new TestDvd();
		do {
			ts.showMenu();
		} while (true);
	}

	/**
	 * 显示菜单
	 */
	public void showMenu() {
		// 打印菜单栏
		System.out.println("**********DVD信息管理系统******************");
		System.out.println("1.新增DVD\n2.查看DVD\n3.删除DVD\n4.借出DVD\n5.归还DVD\n0.退出");
		System.out.println("请输入您的选择（0/1/2/3/4/5）：");

		// 选择操作
		int select = input.nextInt();
		switch (select) {
		case 1:// 新增DVD
			System.out.println("新增DVD名字：");
			name = input.next();// 获取DVD名字
			flag = op.addDvd(name);// 添加功能
			System.out.println(flag ? "添加成功" : "添加失败");
			break;
		case 2:// 查看DVD
			System.out.println("**************DVD信息******************");
			System.out.println("名称\t" + "借出状态\t" + "借出日期\t" + "借出次数");
			op.showDvd();
			break;
		case 3:// 删除DVD
			System.out.println("删除DVD名字：");
			name = input.next();// 获取DVD名字
			flag = op.delDvd(name);
			System.out.println(flag ? "删除成功" : "删除失败");
			break;
		case 4:// 借出DVD
			System.out.println("请输入您要租赁的DVD名:");
			name = input.next();
			System.out.println("请输入租赁时间:");
			date = input.nextInt();
			flag = op.lendDvd(name, date);
			System.out.println(flag ? "租赁成功" : "租赁失败");
			break;
		case 5:// 归还DVD
			name = input.next();
			System.out.println("请输入归还时间:");
			date = input.nextInt();
			flag = op.returnDvd(name, date);
			System.out.println(flag ? "归还成功" : "归还失败");
			break;
		case 0:// 退出
			System.out.println("谢谢使用!");
			System.exit(0);
		default:
			System.out.println("请输入正确选项（0/1/2/3/4/5）！");
			break;
		}

	}

}
