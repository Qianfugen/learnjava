package printer;

/**
 * 测试打印机接口
 * 
 * @author 钱富根
 * @version 1.0 2019-07-22
 */
public class TestPrinter {
	// 创建打印机类的实例对象
	Printer printer = new Printer();

	public static void main(String[] args) {
		// 创建测试的实例对象
		TestPrinter ts = new TestPrinter();
		// 测试打印
		ts.showPrint();
	}

	public void showPrint() {
		// 测试颜色黑白，纸张A4
		printer.setColor("黑白");
		printer.setPaper("A4");
		// 打印
		System.out.println("打印机正在打印" + printer.getColor() + "的" + printer.getPaper());

		// 测试颜色彩色,纸张A3
		printer.setColor("彩色");
		printer.setPaper("A3");
		// 打印
		System.out.println("打印机正在打印" + printer.getColor() + "的" + printer.getPaper());
	}
}
