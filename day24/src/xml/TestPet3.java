package xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class TestPet3 {

	public static void main(String[] args) {
		try {
			// 创建解析工厂
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			// 创建解析对象
			DocumentBuilder db = dbf.newDocumentBuilder();
			// 创建文档对象
			Document doc = db.parse("./src/xml/pets.xml");
			// 获取根节点下的集合
			NodeList dogs = doc.getElementsByTagName("dog");

			System.out.println("共" + dogs.getLength() + "只狗");
			//打印表头
			System.out.println("编号\t昵称\t健康值\t亲密度\t品种");
			// 循环遍历
			for (int i = 0; i < dogs.getLength(); i++) {
				// 获取节点
				Node dog = dogs.item(i);
				// 强转
				Element d = (Element) dog;
				// 获取属性
				System.out.print(d.getAttribute("id")+"\t");

				// 获取其他属性
				for (Node node = dog.getFirstChild(); node != null; node = node.getNextSibling()) {
					if (node.getNodeType() == node.ELEMENT_NODE) {
						String value = node.getFirstChild().getNodeValue();
						System.out.print( value+"\t");
					}
				}
				System.out.println();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
