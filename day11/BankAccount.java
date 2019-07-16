package day11;

/**
 * 模拟银行账户功能的类
 * @author 钱富根
 * @version 1.0 2019-7-16
 */
public class BankAccount {	//1.定义类名BankAccount
	//2.定义类的属性
	String account;			//账户
	String username;		//姓名
	String address;			//地址
	double balance;			//余额
	double min_balance;		//最小余额
	
	//3.定义类的方法
	/**
	 * 存款
	 */
	public void deposit(double money) {
		if(money > 0) {
			System.out.println("账户原有余额："+balance+"元。");
			System.out.println("今日存款数额："+money+"元。");
			balance += money;
			System.out.println("最终存款余额："+balance+"元。");
		}
	}
	
	/**
	 * 取款
	 */
	public void withdraw(double money) {
		if(balance - money > min_balance) {		
			balance -= money;
			System.out.println("取钱完毕！您已取钱："+money+"元。");
		}else {		//如果小于最小余额，拒绝取钱
			System.out.println("您当前的余额为："+balance+"元");
			System.out.println("您的最小余额为："+min_balance+"元，无法取钱！");
		}
		
	}
	
	/**
	 * 查询
	 */
	public void inquire() {
		System.out.println("您当前的余额为："+balance+"元。");
	}
}
