package day17;

public class TestException4 {
	public static void main(String[] args) {
		substring(2);//设置值-1,0,2
	}
	
	public static void substring(int beginIndex) {
		String [] value= {"hello"};
		if(beginIndex<0) {
			System.out.println("GG");
			throw new StringIndexOutOfBoundsException(beginIndex);
		}
		int subLen=value.length-beginIndex;
		if(subLen<0) {
			System.out.println("oo");
			throw new StringIndexOutOfBoundsException(subLen);
		}
		System.out.println("what i do");
	}
}
