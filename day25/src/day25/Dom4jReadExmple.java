package day25;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

import org.dom4j.*;
import org.dom4j.io.SAXReader;

/**
 * 遍历整个XML文件,获取所有节点的值与其属性的值,并放入HashMap中
 * 
 * @param filename String待遍历的XML文件(相对路径或绝对路径)
 * @param hm       HashMap存放遍历结果
 * @author 钱富根
 * @version 1.0 2019年8月2日
 */
public class Dom4jReadExmple {
	public void iterateWholeXML(String filename, HashMap<String, String> hm) {
		SAXReader saxReader = new SAXReader();
		try {
			Document document = saxReader.read(new File(filename));
			Element root = document.getRootElement();
			int num = -1;// 用于记录学生编号的变量
			// 遍历根元素(student)的所有子节点(肯定是student节点)
			for (Iterator<Element> iter = root.elementIterator(); iter.hasNext();) {
				Element element = (Element) iter.next();
				num++;
				// 获取person节点的age属性的值
				Attribute ageAttr = element.attribute("age");
				if (ageAttr != null) {
					String age = ageAttr.getValue();
					if (age != null && age.equals("")) {
						hm.put(element.getName() + "-" + ageAttr.getName() + num, age);
					} else {
						hm.put(element.getName() + "-" + ageAttr.getName() + num, 20 + "");
					}
				} else {
					hm.put(element.getName() + "-age" + num, "20");
				}
				// 遍历student节点的所有子节点(即name,college,telphone和notes),并处理
				for (Iterator iterInner = element.elementIterator(); iterInner.hasNext();) {
					Element elementInner = (Element) iterInner.next();
					if (elementInner.getName().equals("college")) {
						hm.put(elementInner.getName() + num, elementInner.getText());
						// 获取college节点的Leader属性的值
						Attribute leaderAttr = elementInner.attribute("leader");
						if (leaderAttr != null) {
							String leader = leaderAttr.getValue();
							if (leader != null && !leader.equals(" ")) {
								hm.put(elementInner.getName() + "-" + leaderAttr.getName() + num, leader);
							} else {
								hm.put(elementInner.getName() + "-" + leaderAttr.getName() + num, "leader");
							}
						} else {
							hm.put(elementInner.getName() + "-leader" + num, "leader");
						}
					} else {
						hm.put(elementInner.getName() + num, elementInner.getText());
					}
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

}
