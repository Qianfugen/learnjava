//构造方法
public class Puppy {
    int puppyAge;
    public Puppy(String name) {
        //构造仅一个参数name
        System.out.println("小狗的名字是："+name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("小狗的年龄为："+puppyAge);
        return puppyAge;
    }
    public static void main(String[] args) {
        //创建一个Puppy对象
        Puppy myPuppy = new Puppy("tommy");
        //通过方法来设定age
        myPuppy.setAge(2);
        //调用另一个方法获取age
        myPuppy.getAge();
        System.out.println("变量值："+myPuppy.puppyAge);
    }
}
