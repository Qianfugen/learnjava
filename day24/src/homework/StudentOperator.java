package homework;

import java.io.*;

import java.text.SimpleDateFormat;
import java.util.*;

import javax.xml.parsers.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;

import org.xml.sax.SAXException;

/**
 * 学生实体类
 * 
 * @author 钱富根
 * @version 1.0 2019-07-26
 */

public class StudentOperator {
	// 创建集合
	private Map<Integer, Student> stdMap = new HashMap<Integer, Student>();

	/**
	 * 添加学生
	 * 
	 * @param std 学生实例
	 * @return 添加是否成功
	 */
	public boolean addStudent(Student std) {
		boolean isAdd = false;
		if (searchStudent(std.getId()) == null) {// 不存在学生
			stdMap.put(std.getId(), std);
			isAdd = true;
		} else {
			System.out.println("该学生已存在!");
		}

		return isAdd;
	}

	/**
	 * 查找学生是否重复
	 * 
	 * @param id 学生学号
	 * @return 存在返回学生实体对象,没有返回Null
	 */
	public Student searchStudent(int id) {
		Student s = null;
		if (stdMap.containsKey(id)) {
			s = stdMap.get(id);
		}
		return s;
	}

	/**
	 * 显示列表
	 */
	public void showStudent() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if (stdMap.size() == 0) {
			System.out.println("学生列表暂无信息!");
		} else {
			System.out.println("学号" + "\t\t" + "姓名" + "\t" + "性别" + "\t" + "年龄" + "\t" + "成绩" + "\t\t" + "生日");
			for (Student s : stdMap.values()) {
				System.out.printf("%d\t%10s\t%s\t%d\t%.2f%20s\n", s.getId(), s.getName(), (s.isSex() ? "男" : "女"),
						s.getAge(), s.getScore(), sdf.format(s.getBirthday()));
			}
		}
	}

	/**
	 * 删除学生
	 * 
	 * @param id 学生学号
	 */
	public boolean deleteStudent(int id) {
		boolean isDel = false;
		if (searchStudent(id) != null) {
			stdMap.remove(id);
			isDel = true;
		} else {
			System.out.println("不存在该学生!");
		}

		return isDel;
	}

	/**
	 * 更新学生信息
	 * 
	 * @param std 学生对象
	 * @return 修改是否成功
	 */
	public boolean updateStudent(Student std) {
		boolean isUpdate = false;

		if (searchStudent(std.getId()) != null) {
			stdMap.put(std.getId(), std);
			isUpdate = true;
		}

		return isUpdate;
	}

	/**
	 * 查找学生
	 * 
	 * @param id 查找的学生学号
	 */
	public void findStudent(int id) {
		if (stdMap.containsKey(id)) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Student s = stdMap.get(id);
			System.out.println("学号:" + s.getId());
			System.out.println("姓名:" + s.getName());
			System.out.println("性别:" + (s.isSex() ? "男" : "女"));
			System.out.println("年龄:" + s.getAge());
			System.out.println("成绩:" + s.getScore());
			System.out.println("生日:" + sdf.format(s.getBirthday()));
		} else {
			System.out.println("没有该学生的信息!");
		}
	}

	/**
	 * 解析文档
	 * 
	 * @param file 文件路径
	 */
	public void readStudent(String file) {
		try {
			// 1.创建文档解析器工厂
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

			// 2.创建解析器对象
			DocumentBuilder db = dbf.newDocumentBuilder();

			// 3.创建文档对象DOM
			Document doc = db.parse(file);

			// 4.获取根节点下面所有子节点集合
			NodeList students = doc.getElementsByTagName("Student");
			System.out.println("有" + students.getLength() + "个学生");

			// 5.循环遍历节点集合
			for (int i = 0; i < students.getLength(); i++) {
				// 5.1获取集合成员
				Node stu = students.item(i);
				// 获取属性值
				Element s = (Element) stu;
				System.out.println("Id:" + s.getAttribute("Id"));

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

	/**
	 * 写入学生信息
	 * 
	 * @param file 写入文件名字
	 * @return 写入文件是否成功
	 */
	public boolean writeStudent(String sourceFile, String destFile) {
		boolean isSuccess = false;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			// 得到DOM解析器的工厂实例
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			// 从DOM工厂获得DOM解析器
			DocumentBuilder db = dbf.newDocumentBuilder();
			// 解析XML文档,得到一个Document对象,即DOM树
			Document doc = db.parse(sourceFile);

			for (Student std : stdMap.values()) {
				// 创建学生节点
				Element stu = doc.createElement("Student");
				stu.setAttribute("Id", "1003");

				// 创建子节点
				Element nameElement = doc.createElement("Name");
				nameElement.setTextContent(std.getName());
				Element sexElement = doc.createElement("Sex");
				sexElement.setTextContent(std.isSex() ? "男" : "女");
				Element scoreElement = doc.createElement("Score");
				scoreElement.setTextContent(String.valueOf(std.getScore()));
				Element ageElement = doc.createElement("Age");
				ageElement.setTextContent(String.valueOf(std.getAge()));
				Element birthdayElement = doc.createElement("Age");
				birthdayElement.setTextContent(sdf.format(std.getBirthday()));

				// 添加父子关系
				stu.appendChild(nameElement);
				stu.appendChild(sexElement);
				stu.appendChild(scoreElement);
				stu.appendChild(ageElement);
				stu.appendChild(birthdayElement);
			}

			// 保存XML文件
			TransformerFactory transformerfactory = TransformerFactory.newInstance();
			Transformer transformer = transformerfactory.newTransformer();
			DOMSource domSource = new DOMSource(doc);

			// 设置编码格式
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			StreamResult result = new StreamResult(new FileOutputStream(destFile));

			// 把DOM树转换为XML文件
			transformer.transform(domSource, result);
			isSuccess = true;

		} catch (IOException | ParserConfigurationException | SAXException | TransformerException e) {
			e.printStackTrace();
		}

		return isSuccess;
	}
}
