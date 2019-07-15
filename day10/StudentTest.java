package day10;

public class StudentTest {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "pipixia";
		stu.gender = "男";
		stu.age = 22;
		stu.grade = 6;
		stu.study();
		stu.doHomework();
		stu.sleep();
	}
}
