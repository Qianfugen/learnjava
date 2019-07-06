public class TestArray4{
    public static void printArray(int[] numbers){
        for (int element:numbers){
            System.out.println(element);
        }
    }
    public static void main(String[] args){
        //创建数组方法1
        int[] pipixia = new int[5];
        pipixia[0]=1;
        pipixia[1]=2;
        pipixia[2]=3;
        pipixia[3]=4;
        pipixia[4]=5;
        //方法2 int[] pipixia={1,2,3,4,5} 
        printArray(pipixia);
    }
}
