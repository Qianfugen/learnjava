package practice;

public class Cat  implements Animals{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println(name+"在吃鱼");
	}

	@Override
	public void run() {
		System.out.println(name+"在捉老鼠");
	}

	@Override
	public void sleep() {
		System.out.println(name+"在打盹");
	}


}