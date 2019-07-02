import java.io.*;
public class EmployeeTest {
    public static void main(String[] args) {
        Employee empOne = new Employee("RUNOOB1");
        Employee empTwo = new Employee("RUNOOB2");
        
        //调用这两个对象的成员方法
        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empOne.empAge(21);
        empOne.empDesignation("菜鸟程序员");
        empOne.empSalary(500);
        empOne.printEmployee();

    }
}
