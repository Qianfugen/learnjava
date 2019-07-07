class Animal{
    public void move(){
        System.out.println("动物可以移动");
    }
}

class Cat extends Animal{
    public void move(){
        super.move();
        System.out.println("猫可以跑和走");
    }
}

public class TestCat1{
    public static void main(String[] args){
        Animal a = new Cat();
        a.move();
    }
}
