package day10;
/**
 * 测试Student类和Teacher类
 * @author root
 *
 */
public class Test {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "pipixia";
		stu.gender = "男";
		stu.age = 22;
		stu.grade = 6;
		stu.study();
		stu.doHomework();
		stu.sleep();
		
		Teacher tea = new Teacher();
		tea.name = "xuyuanfu";
		tea.gender = "女";
		tea.teach_age = 10;
		tea.course = "Java";
		tea.teach();
		tea.gaiZuoYe();
	}
}
