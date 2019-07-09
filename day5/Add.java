public class Add{
    public static void main(String[] args){
        int d = 5;
        long l = 99;
        double a = d + l;              //自动类型转换
        System.out.println(a);

        byte b = (byte)(d+l);     //强制类型转换
        System.out.println(b);
    }
}
