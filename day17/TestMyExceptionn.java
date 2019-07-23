package day17;

public class TestMyExceptionn {
	public static void main(String[] args) {
		GenderException person=new GenderException();
		try {
			person.setSex("人妖");
		}catch(MyException e) {
			e.printStackTrace();
		}
	}
	
}	
