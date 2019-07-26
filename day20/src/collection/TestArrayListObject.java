package collection;

import java.util.ArrayList;

import pets.*;

public class TestArrayListObject {
	public static void main(String[] args) {
		ArrayList pets=new ArrayList();
		Dog d1= new Dog("旺旺",100,50,"哈士奇");
		Dog d2= new Dog("旺旺2",100,60,"哈士奇");
		
		Penguin pg=new Penguin("Q妹",50,100,"笨企鹅");
		Penguin pg2=new Penguin("Q妹2",50,100,"聪明企鹅");
		Penguin pg3=new Penguin("Q妹3",50,100,"聪明企鹅");
		
		//添加
		pets.add(d1);
		pets.add(d2);
		pets.add(pg);
		pets.add(pg2);
		
		//修改
		pets.set(2, pg3);
		
		//打印
		for(Object p:pets) {
			if(p instanceof Dog) {
				System.out.print(((Dog) p).getName()+"\t"+((Dog) p).getHealth()+"\t"+((Dog) p).getLove()+"\t"+((Dog) p).getStrain()+"\n");
			}else if(p instanceof Penguin){
				System.out.print(((Penguin) p).getName()+"\t"+((Penguin) p).getHealth()+"\t"+((Penguin) p).getLove()+"\t"+((Penguin) p).getSex()+"\n");
			}
		}
	}
}
