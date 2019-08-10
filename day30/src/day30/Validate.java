package day30;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * 表单验证的自定义注解
 * 
 * @author 钱富根
 * @version 1.0 2019年8月9日
 */

//注解会在class字节码文件中存在，在运行时可以通过反射获取到
@Retention(RetentionPolicy.RUNTIME)
//字段、枚举的常量
@Target(ElementType.FIELD)
public @interface Validate {
	// 可以理解为注解中的一个属性
	public int max() default 100;

	public int min() default 0;
}
