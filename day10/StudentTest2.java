package day10;
/**
 * 调用Student类
 * @author root
 *
 */
public class StudentTest2 {
	public static void main(String[] args) {
		Student stu = new Student();		//创建Studnet实例
		stu.name = "pipixia";				//设置姓名
		stu.gender = "boy";					//设置性别
		stu.age = 22;						//设置年龄
		stu.grade = 6;						//设置年级
		
		stu.study();						//调用study方法
		stu.introduce();					//调用introduce方法
	}
}

