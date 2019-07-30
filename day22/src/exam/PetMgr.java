package exam;

/**
 * 宠物管理类
 * 
 * @author 钱富根
 * @version 1.0 2019年7月30日
 */

public class PetMgr {
	// 定义数属性
	Pet[] pets;

	public PetMgr() {
		pets = new Pet[2];
	}

	public PetMgr(int count) {
		pets = new Pet[count];
	}

	/**
	 * 添加宠物
	 * 
	 * @param pet 宠物对象
	 * @return 返回是否添加成功的状态：1成功；0满了；-1不成功,有重复
	 */
	public int addPet(Pet pet) {
		int isAdd = 0;

		// 判断是否重复
		if (findPet(pet.getId()) == -1) {
			for (int i = 0; i < pets.length; i++) {
				if (pets[i] == null) {
					if (pet instanceof Dog) {// 判断类型
						pets[i] = new Dog();
						// 强制转换
						((Dog) pets[i]).setStrain(((Dog) pet).getStrain());
					} else if (pet instanceof Penguin) {
						pets[i] = new Penguin();
						// 强制转换
						((Penguin) pets[i]).setSex(((Penguin) pet).getSex());
					}
					pets[i].setId(pet.getId());
					pets[i].setName(pet.getName());
					pets[i].setHealth(pet.getHealth());
					pets[i].setLove(pet.getLove());
					isAdd = 1;
					break;
				}
			}
		} else {
			isAdd = -1;
		}

		return isAdd;
	}

	/**
	 * 列出宠物信息
	 */
	public void listPet() {
		if (pets[0] == null) {
			System.out.println("暂无宠物信息！");
		} else {
			System.out.println("编号\t昵称\t健康值\t亲密度\t特性");
			for (int i = 0; i < pets.length; i++) {
				if (pets[i] == null) {
					break;
				}

				// 输出共性
				System.out.print(pets[i].getId() + "\t" + pets[i].getName() + "\t" + pets[i].getHealth() + "\t"
						+ pets[i].getLove() + "\t");

				// 输出特性
				if (pets[i] instanceof Dog) {
					System.out.println(((Dog) pets[i]).getStrain());
				} else if (pets[i] instanceof Penguin) {
					System.out.println(((Penguin) pets[i]).getSex());
				}
			}
		}
	}

	/**
	 * 寻找宠物
	 * @param id 编号
	 */
	public void searchPet(int id) {
		int index;
		// 获取宠物所在位置
		index = findPet(id);

		// 判断
		if (index == -1) {
			System.out.println("该宠物不存在！");
		} else {
			System.out.println("宠物编号    ：" + pets[index].getId());
			System.out.println("宠物姓名    ：" + pets[index].getName());
			System.out.println("宠物健康值：" + pets[index].getHealth());
			System.out.println("宠物亲密度：" + pets[index].getLove());

			// 输出特性
			if (pets[index] instanceof Dog) {
				System.out.println("宠物品种     ：" + ((Dog) pets[index]).getStrain());
			} else if (pets[index] instanceof Penguin) {
				System.out.println("宠物性别     ：" + ((Penguin) pets[index]).getSex());
			}
		}

	}

	/**
	 * 获取宠物所在的数组下标
	 * 
	 * @param id 编号
	 * @return 下标
	 */
	private int findPet(int id) {
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
