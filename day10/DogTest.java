package day10;

public class DogTest {
	public static void main(String[] args) {
		Dog dog = new Dog();		//创建实例对象
		//设置属性
		dog.name = "旺财";			
		dog.color = "黑色";
		//各种方法的调用
		dog.eat();
		dog.bark();
		dog.run();
		dog.start();
		dog.stop();
		dog.speedup();
	}
}
