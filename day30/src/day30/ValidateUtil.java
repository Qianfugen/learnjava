package day30;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ValidateUtil {
	public static boolean init(Object obj) throws Exception {
		// 通过反射获取对象类
		Class objClass = obj.getClass();
		// 通过反射获取对象属性
		Field[] fs = objClass.getDeclaredFields();
		// 循环遍历有Validate注解的属性
		for (Field f : fs) {
			// 获取该字段的Validate注解
			if (f.getAnnotation(Validate.class) != null) {
				// 构造获取对象字段值的方法名
				String getName = "get" + (f.getName().charAt(0) + "").toUpperCase() + f.getName().substring(1);
				// 获取方法
				Method getNameMethod = objClass.getMethod(getName, null);
				// 通过方法获取字段值,强转
				int age = (int) getNameMethod.invoke(obj, null);
				// 根据直接指定的值进行对比
				Validate vd = f.getAnnotation(Validate.class);
				if (age < vd.min()) {
					System.out.println("小于指定年龄");
					return false;
				} else if (age > vd.max()) {
					System.out.println("大于指定年龄");
					return false;
				}else {
					System.out.println("年龄合法");
				}

			}
		}
		return true;
	}
}
