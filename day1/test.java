//定义
public  class Dog {
    String breed;
    int age;
    String color;
    void barking() {
    }
    void hungry() {
    }
    void sleeping() {
    }
}

//构造方法
public class Puppy {
    public Puppy(String name) {
        //构造仅一个参数name
        System.out.println("小狗的名字是："+name);
    }
    public static void main(String[] args) {
        //创建一个Puppy对象
        Puppy myPuppy = new Puppy("tommy");
    }
}
