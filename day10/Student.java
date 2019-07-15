package day10;
/**
 * 定义一个Studnet类
 * @author root
 *
 */
public class Student {
	String name;			//定义姓名
	String gender;			//定义性别
	int age;				//定义年龄
	int grade; 				//定义年级
	//定义study方法
	public void study() {
		System.out.println(name+"正在学习。。。");
	}
	//定义doHomework方法
	public void doHomework() {
		System.out.println(name+"正在做作业。。。");
	}
	//定义sleep方法
	public void sleep() {
		System.out.println(name+"正在睡觉。。。");
	}
	//定义自我介绍
	public void introduce() {
		System.out.println("大家好，我是王晗旭，"
		+ "小时候我家里特别困难...不好意思，串场了，我是"+name);
	}
}
