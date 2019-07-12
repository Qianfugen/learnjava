import java.util.Arrays;

public class ArrayTest{
    public static void main(String[] args){
       int[] num = {10,20,50,30,40};
       System.out.println("原数组："); 
       for(int a:num){
           System.out.print(a+" ");
         }
       //使用sort方法排序
       System.out.println("\n排序后(num)：");
       Arrays.sort(num);
       for(int a:num){
           System.out.print(a+" ");
         }

       //填充数组
       System.out.println("\n填充数组(newNum)");
       int[] newNum = {1,2,3,4,5};
       Arrays.fill(newNum,5);
       for(int a:newNum){
           System.out.print(a+" ");
         }

        
       //复制数组
       System.out.println("\n复制数组(newNum2)");
       int[] newNum2 = Arrays.copyOf(num,num.length);
       for(int a:newNum2){
           System.out.print(a+" ");
         }
       
       //复制数组的一部分
       System.out.println("\n复制数组的一部分(newNum3)");
       int[] newNum3 = Arrays.copyOfRange(num,1,3);
       for(int a:newNum3){
           System.out.print(a+" ");
         }
       //
       //查询数组
       System.out.println("\n查询数组");
       int index = Arrays.binarySearch(num,30);
       System.out.println("30在数组的下标是："+index);
    }
}
