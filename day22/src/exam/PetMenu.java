package exam;

/**
 * 宠物菜单类
 */
import java.util.Scanner;

public class PetMenu {
	// 定义属性
	PetMgr pm;
	Pet pet;
	Scanner input = new Scanner(System.in);
	int select = 0;
	int flag;

	public PetMenu() {
		pm = new PetMgr();
	}

	/**
	 * 主菜单
	 */
	public void showMenu() {
		do {
			System.out.println("*************宠物管理系统******************");
			System.out.println("1.添加宠物\n2.宠物列表\n3.查询宠物\n0.退出");
			System.out.println("请选择（0-3）：");
			select = input.nextInt();

			switch (select) {
			case 1:
				addMenu();
				break;
			case 2:
				listMenu();
				break;
			case 3:
				searchMenu();
				break;
			case 0:
				System.out.println("谢谢使用！");
				break;
			default:
				System.out.println("错误选择，请输入正确选项！");
				break;
			}
		} while (select != 0);

	}

	/**
	 * 添加菜单
	 */
	public void addMenu() {
		System.out.println("1.添加宠物狗\n2.添加宠物企鹅");
		System.out.println("请选择（1-2）：");
		select = input.nextInt();

		if (select == 1) {
			pet = new Dog();
			System.out.print("请输入编号：");
			pet.setId(input.nextInt());
			System.out.print("请输入姓名：");
			pet.setName(input.next());
			System.out.print("请输入健康值：");
			pet.setHealth(input.nextInt());
			System.out.print("请输入亲密度：");
			pet.setLove(input.nextInt());
			System.out.print("请输入品种：");
			((Dog) pet).setStrain(input.next());
			flag = pm.addPet(pet);
		} else if (select == 2) {
			pet = new Penguin();
			System.out.print("请输入编号：");
			pet.setId(input.nextInt());
			System.out.print("请输入姓名：");
			pet.setName(input.next());
			System.out.print("请输入健康值：");
			pet.setHealth(input.nextInt());
			System.out.print("请输入亲密度：");
			pet.setLove(input.nextInt());
			System.out.print("请输入品种：");
			((Penguin) pet).setSex(input.next());
			flag = pm.addPet(pet);
		}

		if (flag == 1) {
			System.out.println("添加成功！");
		} else if (flag == 0) {
			System.out.println("数组满了！");
		} else {
			System.out.println("已存在，请勿反复添加！");
		}
	}

	/**
	 * 列出菜单
	 */
	public void listMenu() {
		pm.listPet();
	}

	/**
	 * 查询菜单
	 */
	public void searchMenu() {
		System.out.print("请输入您想要查询的宠物编号：");
		int id = input.nextInt();
		pm.searchPet(id);
	}
}
