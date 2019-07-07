public class VirtualDemo{
    public static void main(String[] args){
        Salary s = new Salary("张三","深圳",3,10000.00);
        Employee e = new Salary("李四","广州",1,18000.00);
        System.out.println("使用Salary的引用调用mailCheck--");
        s.mailCheck();
        System.out.println("\n使用Employee的引用调用mailCheck--");
        e.mailCheck();
    }
}
