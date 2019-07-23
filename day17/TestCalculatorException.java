package day17;

public class TestCalculatorException {
	public static void main(String[] args) {
		CalculatorException ce=new CalculatorException();
		
		try {
			ce.divide();
		}catch(Exception e) {
			System.out.println("出现异常!");
		}finally {
			System.out.println("谢谢使用!");
		}
	}
}
