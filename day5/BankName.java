package day5;
/**
 2.通过switch-case输出银行的简称
  中国银行 : BOC
  中国农业银行：ABC
  中国工商银行：ICBC
 */

public class BankName {
	public static void main(String[] args) {
		String bankName = "中国农业银行";
		switch(bankName) {
			case "中国银行": System.out.println("BOC");
							break;
			case "中国农业银行": System.out.println("ABC");
								break;
			default: System.out.println("ICBC");
		}
	}
}
