package day10;
/**
 * 编写游客类
 * @author root
 *
 */
public class Tourist {
	//创建属性
	String name;
	int age;
	//创建方法
	public void getTicket() {
		if (age>10) {
			System.out.println(name+"年龄为："+age+"，门票价格为：20");
		}else {
			System.out.println(name+"年龄为："+age+"，门票价格为：5");
		}
	}
}
