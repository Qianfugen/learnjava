package test;

public class MyException extends Exception{
	
	/**
	 * 缺省构造
	 */
	public MyException() {
		
	}
	
	
	
	public MyException(String message) {
		super(message);//调用父类方法
	}
}
