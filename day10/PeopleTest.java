package day10;
/**
 * 调用People类
 * @author root
 *
 */
public class PeopleTest {
	public static void main(String[] args) {
		People human = new People();		//创建一个human实例
		human.age=22;						//初始化实例年龄
		human.name = "pipixia";				//初始化实例姓名
		human.gender = "boy";				//初始化实例性别
		
		human.eat();						//调用吃的方法
		human.sleep();						//调用睡觉的方法
		human.work();						//调用工作的方法
	}
}
