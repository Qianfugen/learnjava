package dvd;

/**
 * 操作类
 * 
 * @author 钱富根
 * @version 1.0 2019-07-22
 */
public class DvdOperator {
	// 定义dvd数组大小为6
	DvdInfo[] dvdList = new DvdInfo[6];

	/**
	 * 添加DVD
	 * 
	 * @param name 名字
	 * @return 返回添加成功与否
	 */
	public boolean addDvd(String name) {
		boolean isAdd = false;
		int index = searchDvd(name);
		if (index == -1) {
			for (int i = 0; i < dvdList.length; i++) {
				if (dvdList[i] == null) {// 找到空位置
					dvdList[i] = new DvdInfo();
					dvdList[i].setName(name);// 设置名字
					dvdList[i].setState(1);// 在库为可借
					dvdList[i].setDate(0);// 借出时间为0，表示未借出
					dvdList[i].setCount(0);// 设置借出次数
					isAdd = true;// 设置添加状态为true,成功
					break;
				}
			}
			if (!isAdd) {// 数组已满
				System.out.println("DVD库存已满！");
			}
		} else {
			System.out.println(name + "已存在，请勿反复添加！");
		}
		return isAdd;
	}

	/**
	 * 寻找是否有重复DVD
	 * 
	 * @param name DVD名字
	 * @return -1,没重复，>=0，有重复
	 */
	private int searchDvd(String name) {
		int index = -1;
		for (int i = 0; i < dvdList.length; i++) {
			if (dvdList[i] == null) {// 判断是否已遍历完数组的有效内容
				break;
			} else if (dvdList[i].getName().equals(name)) {// 判断是否重复,重复返回下标
				index = i;
				break;
			}
		}
		return index;
	}

	/**
	 * 显示DVD信息
	 */
	public void showDvd() {
		for (int i = 0; i < dvdList.length; i++) {
			if (dvdList[0] == null) {
				System.out.println("暂无DVD信息!");
				break;
			} else {
				if (dvdList[i] == null) {
					break;
				} else {
					System.out.println(dvdList[i].getName() + "\t" + dvdList[i].getState() + "\t" + dvdList[i].getDate()
							+ "\t" + dvdList[i].getCount());
				}
			}
		}
	}

	/**
	 * 删除
	 * 
	 * @param name DVD名字
	 * @return 删除成功与否
	 */
	public boolean delDvd(String name) {
		boolean isDel = false;
		int index = searchDvd(name);
		if (index >= 0) {
			int i = index;

			if (i == dvdList.length - 1) {
				dvdList[i] = null;
			} else {
				for (; i < dvdList.length - 1; i++) {
					if (dvdList[i + 1] == null) {// 遍历到空值,跳出循环
						break;
					} else {
						dvdList[i].setName(dvdList[i + 1].getName());
						dvdList[i].setState(dvdList[i + 1].getState());
						dvdList[i].setDate(dvdList[i + 1].getDate());
						dvdList[i].setCount(dvdList[i + 1].getCount());
					}
				}
				dvdList[i] = null;// 把最后一位置空
			}

			isDel = true;
		} else {
			System.out.println("不存在" + name + "的有关信息！");
		}

		return isDel;
	}

	/**
	 * 租赁DVD
	 * 
	 * @param name DVD名称
	 * @param date 租赁时间
	 * @return 租赁是否成功
	 */
	public boolean lendDvd(String name, int lentdate) {
		boolean isLend = false;
		int index = searchDvd(name);
		if (index >= 0) {
			int state = dvdList[index].getState();
			if (state == 1) {
				int count = dvdList[index].getCount();
				dvdList[index].setCount(count + 1);// 借出次数+1
				dvdList[index].setState(0);// 设置为借出状态
				dvdList[index].setDate(lentdate);// 设置借出时间
				isLend = true;
			} else {// state==0,书已被借走
				System.out.println("很抱歉," + name + "这张DVD已被借出!");
			}

		} else {
			System.out.println("没有" + name + "这张DVD,请检查您的输入!");
		}
		return isLend;
	}

	/**
	 * 还DVD
	 * 
	 * @param name       还的DVD名字
	 * @param returndate 还DVD日期
	 * @return 还DVD是否成功
	 */
	public boolean returnDvd(String name, int returndate) {
		boolean isReturned = false;
		int index = searchDvd(name);
		if (index >= 0) {
			int lentdate = dvdList[index].getDate();// 获取借出时间
			int time = returndate - lentdate;// 计算借DVD时长
			dvdList[index].setState(1);// 设置为可借状态
			dvdList[index].setDate(0);// 借出时间清空
			System.out.println("借书时长：" + time + "天");
			isReturned = true;// 还DVD成功
		} else {
			System.out.println("没有" + name + "这张DVD,请检查您的输入!");
		}

		return isReturned;
	}

}
