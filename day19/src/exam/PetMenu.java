package exam;

import java.util.Scanner;

/**
 * 宠物菜单类
 * 
 * @author 钱富根
 * @version 1.0 2019-07-25
 */
public class PetMenu {
	// 扫描器
	Scanner input = new Scanner(System.in);
	PetMgr mg = new PetMgr();
	boolean flag;

	public void listMenu() {
		// 打印菜单
		System.out.println("**********宠物管理系统*************************");
		System.out.println("1.添加宠物\n2.宠物列表\n3.查询宠物\n0.退出\n");
		System.out.println("请选择(0-3):");
		int select = input.nextInt();

		// 选择
		switch (select) {
		case 1:// 添加宠物
			System.out.println("1.添加宠物狗");
			System.out.println("2.添加宠物企鹅\n");
			System.out.println("请选择(0-3):");
			int choice = input.nextInt();

			// 选择1添加宠物下的选择
			switch (choice) {
			case 1:// 添加宠物狗
				Dog dog = new Dog();
				System.out.println("请输入编号:");
				dog.setId(input.nextInt());
				System.out.println("请输入昵称:");
				dog.setName(input.next());
				System.out.println("请输入健康值:");
				dog.setHealth(input.nextInt());
				System.out.println("请输入亲密度:");
				dog.setLove(input.nextInt());
				System.out.println("请输入品种:");
				dog.setStrain(input.next());
				flag = mg.addPet(dog);
				if (flag) {
					System.out.println("添加宠物狗成功!");
				} else {
					System.out.println("添加宠物狗失败!");
				}
				break;

			case 2:// 添加企鹅
				Penguin pg = new Penguin();
				System.out.println("请输入编号:");
				pg.setId(input.nextInt());
				System.out.println("请输入昵称:");
				pg.setName(input.next());
				System.out.println("请输入健康值:");
				pg.setHealth(input.nextInt());
				System.out.println("请输入亲密度:");
				pg.setLove(input.nextInt());
				System.out.println("请输入性别:");
				pg.setSex(input.next());
				flag = mg.addPet(pg);
				if (flag) {
					System.out.println("添加企鹅成功!");
				} else {
					System.out.println("添加企鹅失败!");
				}
				break;
			default:
				System.out.println("请输入正确选项(1/2)");
				break;
			}
			break;

		case 2:// 宠物列表
			mg.listPet();
			break;

		case 3:// 查询宠物
			System.out.println("请输入您所要查询的宠物编号:");
			int id = input.nextInt();// 宠物编号
			int index = mg.searchPet(id);// 方法返回值
			if (index >= 0) {
				System.out.println("编号:" + PetMgr.pets[index].getId());
				System.out.println("昵称:" + PetMgr.pets[index].getName());
				System.out.println("健康值:" + PetMgr.pets[index].getHealth());
				System.out.println("亲密度:" + PetMgr.pets[index].getLove());
				if (PetMgr.pets[index] instanceof Dog) {
					System.out.println("特性:" + ((Dog) PetMgr.pets[index]).getStrain());
				} else if (PetMgr.pets[index] instanceof Penguin) {
					System.out.println("特性:" + ((Penguin) PetMgr.pets[index]).getSex());
				}
			} else {
				System.out.println("未找到编号为" + id + "的宠物！");
			}
			break;

		case 0:// 退出
			System.out.println("谢谢使用!");
			System.exit(0);

		default:
			System.out.println("请输入正确选项(0/1/2/3)");
			break;
		}
	}
}
