import java.io.*;

public class ExcepTest{
    public static void main(String[] args){
        int a[]={1,2,3};
        try{
            System.out.println("The three element: "+a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown :"+e);
        }
        System.out.println("Out of the block");
    }
}
