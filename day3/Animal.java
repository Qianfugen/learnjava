public class Animal{
    //定义父类
    private String name;
    private int id;
    public Animal(String myName,int myId){
        this.name=myName;
        this.id=myId;
    }

    public void eat(){
        System.out.println("正在吃...");
    }
    public void sleep(){
        System.out.println("正在睡...");
    }
    public void introduction(){
        System.out.println("大家好！我是"+id+"号"+name+".");
    }

    //子类继承父类
    public class Penguin extends Animal{
        public Penguin(String myName, int myId){
            super(myName,myId);
        }
    }

    public class Mouse extends Animal{
        public Mouse(String myName, int myId){
            super(myName,myId);
        }
    }

}
