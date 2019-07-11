public class Test2{
    public static void main(String[] main){
        int max = 0;
        int[] scores = {5,7,4,3,6};
        for(int i=0;i<5;i++){
            if(scores[i]>max){
                max=scores[i];
            } 
        }
        System.out.println("Max value:"+max);
        }
}
