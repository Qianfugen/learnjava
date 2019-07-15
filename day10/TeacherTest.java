package day10;

public class TeacherTest {
	public static void main(String[] args) {
		//创建实例
		Teacher tea = new Teacher();
		//设置属性
		tea.name = "pipixia";
		tea.gender = "girl";
		tea.teach_age = 30;
		tea.course = "Math";
		
		System.out.println("******教师信息表*********");
		System.out.println("姓名："+tea.name);
		System.out.println("教龄："+tea.teach_age);
		System.out.println("性别："+tea.gender);
		System.out.println("所授课程："+tea.course);
		//调用方法
		tea.teach();
		tea.gaiZuoYe();
	}
}
