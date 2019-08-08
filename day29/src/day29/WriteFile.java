package day29;

import java.io.*;

public class WriteFile {

	public static void main(String[] args) {
		Writer fw = null;
		try {
			fw = new FileWriter("src/test.txt");
			String content = "1）换javafx，swing用得越来越少，官方不推荐你用swing了，"
					+ "swing和swt都属于上个世纪2）图标的部分是操作系统相关的，mac和win要分别写不同的代码，"
					+ "不过javafx可以直接通过设置stage的icon修改图标，mac下其实你可以直接右键选择get info，"
					+ "然后把图标拖到icon位置直接替换就可以了，这样在dock上显示的就是你拖入的图标mac下app有特殊格式，"
					+ "你可以用mac自带的工具打包mac和win以及其他操作操作系统，每个都有自定义的app打包格式，"
					+ "这一块没办法跨平台，只能自己根据不同操作系统自己做网络上有自动制作图标的网站mac下打包可以用platypus来做，"
					+ "win下打包自己写一个bat，启动javaw命令，然后用battoexe转换成exe双击启动这些东西其实跟java没啥关系，"
					+ "更多的是操作系统工具3）this表示当前对象的引用，这个跟gui没啥关系，" + "理解java的类和对象关系就能明白this的意思了return this表示返回当前对象引用，"
					+ "fluent api中经常这么干，可以写出这种链式表达obj.methodA().methodB()";
			fw.write(content);
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
