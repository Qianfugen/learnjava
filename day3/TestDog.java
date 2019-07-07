class Animal{
    void go(){
        System.out.println("animal go!");
    }
}

class Dog extends Animal{
    void go(){
        super.go();
    } 
}

public class TestDog{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.go();
    }
}
