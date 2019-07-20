package petmulti;

public class TestPet {
	public static void main(String[] args) {
		//继承测试
		//测试带参和不带参
		System.out.println("*************继承测试****************************");
		System.out.println("***********测试带参和不带参************************");
		Dog dog=new Dog();
		dog.print();
		dog=new Dog("旺财",80,60,"哈士奇");
		dog.print();
		//方法改写
		System.out.println(dog.toString());//方法改写
		
		Penguin pg=new Penguin();
		pg.print();
		pg=new Penguin("Q妹",30,20,"雌");
		pg.print();
		//方法没改写
		System.out.println(pg.toString());
		
		//多态测试
		System.out.println("************多态测试*********************");
		Pet pet;
		pet=new Dog("旺财",80,60,"哈士奇");
		pet.toHospital();
		
		pet=new Penguin("Q妹",90,20,"雌");
		pet.toHospital();

		Dog d1=new Dog("旺财",30,60,"哈士奇");
		Dog d2=new Dog("旺旺",50,60,"哈士奇");
		if(d1.equals(d2)) {
			System.out.println("两只狗一样");
		}else {
			System.out.println("两只狗不一样");
		}
		
		System.out.println("*******************给宠物看病******************");
		Master mas = new Master();
		mas.cure(d1);
		System.out.println(d1.getHealth());
		mas.cure(pg);
		System.out.println(pg.getHealth());
		
		
		
		System.out.println("****************独有方法测试******************");
		Pet pet2;
		pet2=new Dog("旺财",30,60,"哈士奇");
		mas.play(pet2);
		pet2=new Penguin("Q妹",90,20,"雌");
		mas.play(pet2);
		
		
	}
}
