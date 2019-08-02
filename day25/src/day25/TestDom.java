package day25;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class TestDom {

	public static void main(String[] args) {
		try {
			// 得到DOM解析器的工厂实例
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			// 从DOM工厂获得DOM解析器
			DocumentBuilder db = dbf.newDocumentBuilder();
			// 解析XML文档,得到一个Document对象,即DOM树
			Document doc = db.parse("students.xml");

			// 创建学生节点
			Element stu = doc.createElement("Student");
			stu.setAttribute("Id", "1003");

			// 创建子节点
			Element nameElement = doc.createElement("Name");
			nameElement.setTextContent("钱富根");
			Element sexElement = doc.createElement("Sex");
			sexElement.setTextContent("true");
			Element scoreElement = doc.createElement("Score");
			scoreElement.setTextContent("99");
			Element ageElement = doc.createElement("Age");
			ageElement.setTextContent("23");

			// 添加父子关系
			stu.appendChild(nameElement);
			stu.appendChild(sexElement);
			stu.appendChild(scoreElement);
			stu.appendChild(ageElement);
			Element studentElement = (Element) doc.getElementsByTagName("Students").item(0);
			studentElement.appendChild(stu);

			// 保存XML文件
			TransformerFactory transformerfactory = TransformerFactory.newInstance();
			Transformer transformer = transformerfactory.newTransformer();
			DOMSource domSource = new DOMSource(doc);

			// 设置编码格式
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			StreamResult result = new StreamResult(new FileOutputStream("src/pipixia.xml"));

			// 把DOM树转换为XML文件
			transformer.transform(domSource, result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
