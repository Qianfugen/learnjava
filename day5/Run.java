package day5;

public class Run {
	public static void main(String[] args) {
		double score = 9.9;
		char gender = '男';
		if (score <10) {
			if (gender == '男') {
				System.out.println("进男子组");
			}else {
				System.out.println("进女子组");
			}
		}
	}
}
