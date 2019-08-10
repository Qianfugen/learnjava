package day30;

/**
 * 反射练习
 */
import java.lang.reflect.Field;

public class TestStudent {

	public static void main(String[] args) throws Exception {
		Student stu = new Student();
		stu.setAge(10);
		stu.setId(3);
		stu.setName("皮皮虾");
		System.out.println(ValidateUtil.init(stu));
	}

}
