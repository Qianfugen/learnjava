package day17;

public class GenderException extends Exception{
	String sex;
	public void setSex(String sex) throws MyException {//声明异常
		if(sex.equals("男")||sex.equals("女")) {
			this.sex=sex;
		}else {
			throw new MyException("GG思密达");
		}
	}
}
