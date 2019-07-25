package exam;

/**
 * 宠物管理类
 * 
 * @author 钱富根
 * @version 1.0 2019-07-25
 */

public class PetMgr {
	// 创建宠物类数组
	static Pet[] pets = new Pet[5];

	/**
	 * 添加宠物
	 * 
	 * @param pet
	 * @return -1,添加失败 0,添加狗成功 1,添加企鹅成功
	 */
	public boolean addPet(Pet pet) {
		boolean isAdd = false;
		int index = searchPet(pet.getId());
		if (index < 0) {
			for (int i = 0; i < pets.length; i++) {
				// 有空位
				if (pets[i] == null) {
					if (pet instanceof Dog) {// 判断为狗
						pets[i] = new Dog();
						pets[i].setId(pet.getId());
						pets[i].setName(pet.getName());
						pets[i].setHealth(pet.getHealth());
						pets[i].setLove(pet.getLove());
						((Dog) pets[i]).setStrain(((Dog) pet).getStrain());// 强制转换
						isAdd = true;
						break;
					}
					if (pet instanceof Penguin) {// 判断为企鹅
						pets[i] = new Penguin();
						pets[i].setId(pet.getId());
						pets[i].setName(pet.getName());
						pets[i].setHealth(pet.getHealth());
						pets[i].setLove(pet.getLove());
						((Penguin) pets[i]).setSex(((Penguin) pet).getSex());// 强制转换
						isAdd = true;
						break;
					}
				}
			}
		} else {
			System.out.println("已存在" + pet.getName());
			;
		}
		if (!isAdd) {
			System.out.println("宠物数组已满!");
		}

		return isAdd;
	}

	/**
	 * 显示宠物
	 */
	public void listPet() {
		// 打印标题栏
		System.out.println("编号\t昵称\t健康值\t亲密度\t特性");

		// 打印主体信息
		for (int i = 0; i < pets.length; i++) {
			if (pets[i] == null) {
				break;
			}

			// 打印共性
			System.out.print(
					pets[i].getId() + "\t" + pets[i].getName() + "\t" + pets[i].getHealth() + "\t" + pets[i].getLove());
			// 判断类型,强制转换
			if (pets[i] instanceof Dog) {// 宠物狗
				System.out.println("\t" + ((Dog) pets[i]).getStrain());
			} else if (pets[i] instanceof Penguin) {// 企鹅
				System.out.println("\t" + ((Penguin) pets[i]).getSex());
			}

		}
	}

	/**
	 * 查询宠物
	 * 
	 * @param id 编号
	 * @return -1没找到,>=0找到了,返回下标
	 */
	public int searchPet(int id) {
		int index = -1;
		for (int i = 0; i < pets.length; i++) {
			if (pets[i] == null) {
				break;
			}
			if (pets[i].getId() == id) {
				index = i;
				break;
			}
		}

		return index;
	}
}
