package day10;
/**
 * 定义一个People类
 * @author root
 *
 */
public class People {
	String name;		//类的姓名
	String gender;		//类的性别
	int age;			//类的年龄
	
	//定义吃的方法
	public void eat() {
		System.out.println("肥胖的人类最会吃了！");
	}
	//定义睡觉的方法
	public void sleep() {
		System.out.println("懒惰的人类还在睡觉！");
	}
	//定义工作的方法
	public void work() {
		System.out.println("勤劳的人类还在为理想而奋斗！");
	}
}
