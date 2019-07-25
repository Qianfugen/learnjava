package day19;

public class TestChild {
	public static void main(String[] args) {
//		Child c=new Child();
//		int a=2;
//		int b=3;
//		c.sum(a, b);
		
		Base b=new Child();
		if(b instanceof Child) {
			Child c=(Child) b;
			System.out.println("是他是他就是他,我们的英雄小哪吒");
		}else {
			System.out.println("非也");
		}
	}
}	
