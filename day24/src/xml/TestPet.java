package xml;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TestPet {

	public static void main(String[] args) {
		try {
			// 1.创建文档解析器工厂
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

			// 2.创建解析器对象
			DocumentBuilder db = dbf.newDocumentBuilder();

			// 3.创建文档对象DOM
			Document doc = db.parse("./src/xml/pets.xml");

			// 4.获取根节点下面所有子节点集合
			NodeList pets = doc.getElementsByTagName("dog");
			System.out.println("有" + pets.getLength() + "个宠物");

			// 5.循环遍历节点集合
			for (int i = 0; i < pets.getLength(); i++) {
				// 5.1获取集合成员
				Node stu = pets.item(i);
				// 获取属性值
				Element s = (Element) stu;
				System.out.println("Id:" + s.getAttribute("id"));

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

}
