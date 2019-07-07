public class Salary extends Employee{
    private double salary;
    public Salary(String name,String address,int number,double salary){
        super(name,address,number);
        setSalary(salary);
    }

    public void setSalary(double newSalary){
        if (newSalary>=0.0){
            salary=newSalary;
        }
    }
    
    public void mailCheck(){
        System.out.println("Salary类的mailCheck方法");
        System.out.println("邮寄支票给："+getName()+" ，工资为："+salary);
    }

    public double getSalary(){
        return salary;
    }
     
    public double computePay(){
        System.out.println("支付工资给： "+getName());
        return salary/52;
    }
}
