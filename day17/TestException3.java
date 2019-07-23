package day17;

/**
 * finally内的return的值会覆盖try和catch的返回值，还会掩盖异常
 * @author root
 *
 */
public class TestException3 {
	public static void main(String[] args) {
		int a = test();
		System.out.println("a = "+a);
	}

	public static int test() {
		int ret = 0;
		try {
			int a = 5 / 0;
			return ret;
		} finally {
			return 2;
		}
	}
}
