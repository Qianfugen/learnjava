package day17;

/**
 * 自定义异常
 * @author root
 *
 */
public class MyException extends Exception{
	public MyException() {
		
	}
	
	public MyException(String message) {
		super(message);
	}
}
