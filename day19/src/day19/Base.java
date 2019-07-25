package day19;

public class Base {
	protected int currentStep;
	protected void step1() {
	}
	protected static void step2() {
		System.out.println("我是谁");
//		step2();
	}
	public static void main(String[] args) {
		step2();
	}
}
