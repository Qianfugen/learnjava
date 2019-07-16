package day11;

/**
 * 测试调用BankAccount类
 * @author 钱富根
 * @version 1.0 2019-7-16 
 */
public class BankAccountTest {
	/**
	 * 程序接口
	 * @param args
	 */
	public static void main(String[] args) {
		//1.定义对象
		BankAccount onePerson = new BankAccount();
		
		//2.给对象属性赋值
		onePerson.account = "12345678";
		onePerson.username = "qianfg";
		onePerson.address = "ShenZhen";
		onePerson.balance = 300.0;
		onePerson.min_balance = 20.0;
		
		//3.调用对象的方法
		//存钱
		onePerson.deposit(500.0);
		//取钱
		onePerson.withdraw(1000.0);
		//存钱
		onePerson.deposit(600.0);
		//取钱
		onePerson.withdraw(200.0);
		//查询
		onePerson.inquire();
	}
}
