package xml;

import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

public class TestStudent {
	public static void main(String[] args) {
		try {
			// 1.创建文档解析器工厂
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

			// 2.创建解析器对象
			DocumentBuilder db = dbf.newDocumentBuilder();

			// 3.创建文档对象DOM
			Document doc = db.parse("Students.xml");

			// 4.获取根节点下面所有子节点集合
			NodeList students = doc.getElementsByTagName("Student");
			System.out.println("有：" + students.getLength() + "个学生");

			// 5.循环遍历节点集合
			for (int i = 0; i < students.getLength(); i++) {
				// 5.1获取集合成员
				Node stu = students.item(i);
				// 获取属性值
				Element s = (Element) stu;
				System.out.println("Id属性：" + s.getAttribute("Id"));

				// 5.2遍历子元素集合
				for (Node node = stu.getFirstChild(); node != null; node = node.getNextSibling()) {
					// 获取元素名称及值
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						String name = node.getNodeName();
						String value = node.getFirstChild().getNodeValue();
						System.out.println(name + ":" + value);
					}
				}
				System.out.println();
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}

	}
	
	public boolean writeFile(String file,String content){
		boolean isSuccess=false;

		try {
		// 1.定义输出流对象
		Writer fw = new FileWriter(file);

		// 2.将文件内容写入到文件中
		fw.write(content);

		// 3.关闭文件流
		fw.close();

		isSuccess=true;
		} catch (IOException e) {
		e.printStackTrace();
		}

		return isSuccess;
		}

	
}
