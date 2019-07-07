public class ExcepTest2{
    public static void main(String[] args){
        int a[] = new int[3];
        try{
            System.out.println(a[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown :"+e);
        }
        finally{
            a[0]=6;
            System.out.println("First element value:"+a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
