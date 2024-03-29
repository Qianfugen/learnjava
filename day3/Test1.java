public class Test1{
    public static void main(String[] args){
        show(new Cat());    //以cat对象调用show方法
        show(new Dog());    //以dog对象调用show方法

        Animal a = new Cat();   //向上转型
        a.eat();                //调用cat的eat
        Cat c = (Cat) a;        //向下转型
        c.work();               //调用cat的work
    }

    public static void show(Animal a){
        a.eat();
        //类型判断
        if (a instanceof Cat){      //猫做的事
            Cat c=(Cat) a;
            c.work();
        }else if (a instanceof Dog){    //狗做的事
            Dog c=(Dog) a;
            c.work();
        }
    }
}

abstract class Animal{
    abstract void eat();
}

class Cat extends Animal{
    public void eat(){
        System.out.println("吃鱼");
    }
    public void work(){
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("吃骨头");
    }
    public void work(){
        System.out.println("看家");
    }
}
