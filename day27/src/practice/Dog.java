package practice;

public class Dog  implements Animals{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println(name+"吃骨头");
	}

	@Override
	public void run() {
		System.out.println(name+"在奔跑");
	}

	@Override
	public void sleep() {
		System.out.println(name+"在睡觉");
	}


}
