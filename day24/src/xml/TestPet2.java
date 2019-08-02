package xml;

import java.io.*;

import javax.xml.parsers.*;

import org.w3c.dom.*;

public class TestPet2 {
	public static void main(String[] args) {
		try {
			// 创建文档解析器工厂
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			// 创建解析器对象
			DocumentBuilder db = dbf.newDocumentBuilder();
			// 创建文档对象
			Document doc = db.parse("./src/xml/pets.xml");
			// 获取根节点下面所有子节点集合
			NodeList dogs = doc.getElementsByTagName("dog");
			System.out.println("共" + dogs.getLength() + "只狗");
			// 循环遍历
			for (int i = 0; i < dogs.getLength(); i++) {
				// 获取集合成员
				Node dog = dogs.item(i);
				// 获取属性
				Element d = (Element) dog;
				System.out.println("Id:" + d.getAttribute("id"));

				for (Node node = dog.getFirstChild(); node != null; node = node.getNextSibling()) {
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						String name = node.getNodeName();
						String value = node.getFirstChild().getNodeValue();
						System.out.println(name + ":" + value);
					}
				}
				System.out.println();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
