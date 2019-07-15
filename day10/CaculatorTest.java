package day10;

public class CaculatorTest {
	public static void main(String[] args) {
		Caculator cacu = new Caculator();			//创建实例
		cacu.num1 = 5;								//初始化num1
		cacu.num2 = 3;								//初始化num2
		System.out.println("两数之和："+cacu.add());		//调用add()
		System.out.println("两数之差："+cacu.jian());	//调用jian()
	}
}
