package homework;

public class TestStudent {

	public static void main(String[] args) {
		StudentDao sd = new StudentDao();
		sd.addStudent();
		System.out.println(sd.queryAllStudent());
	}

}
