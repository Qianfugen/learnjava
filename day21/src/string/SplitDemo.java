package string;

public class SplitDemo {
	public static void main(String[] args) {
		String s="中华人民共和国 中国 美国 俄罗斯";
		
		String[] ss=s.split(" ",8);//拆分成几个，长度小于元素个数，则最后一个元素包含后面所有的
		
		System.out.println(ss.length);
		
		for(String sss:ss) {
			System.out.print(sss);
		}
	}
}
