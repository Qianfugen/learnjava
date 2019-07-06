public class TestArray2{
    public static void main(String[] args){
        int i =0;
        double[] myList={1.1,2.2,3.3,5.5,4.4};
        //打印列表元素
        System.out.println("列表元素:");
        for (i=0;i<myList.length;i++){
            System.out.println(myList[i]);
        }
        //打印列表总和
        double total = 0;
        System.out.println("列表总和：");
        for (i=0;i<myList.length;i++){
            total+=myList[i];
        }
        System.out.println("total: "+total);
        //打印列表最大值
        double max = 0;
        System.out.println("列表最大值：");
        for (i=0;i<myList.length;i++){
            if (myList[i]>max){
                max=myList[i];
            }
        }
        System.out.println("max: "+max);
    }
}
