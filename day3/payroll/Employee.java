package payroll;

public class Employee{
    private String name;
    private int number;
    private String address;

    public Employee(String name,String address,int number){
        System.out.println("Employee 构造函数");
        this.name=name;
        this.address=address;
        this.number=number;
    }

    public void mailCheck(){
        System.out.println("邮寄支票给："+this.name+" "+this.address);
    }

    public String toString(){
        return name+" "+address+" "+number;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public int getNumber(){
        return number;
    }

    public void setAddress(String newAddress){
        address=newAddress;
    }
}