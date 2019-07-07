package plants;

public class Flower implements Plant{
    public void grow(){
        System.out.println("Flower grow up!");
    }

    public void irrigate(){
        System.out.println("Flower needs irrigation!");
    }

    public int noOfLegs(){
        return 0;
    }

    public static void main(String[] args){
        Flower f=new Flower();
        f.grow();
        f.irrigate();
    }
}
