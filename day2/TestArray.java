public class TestArray{
    public static void main(String[] args){
        int size=10;
        double[] mylist= new double[size];
        double sum=0;
        mylist[0] =1.1 ;
        mylist[1] =2.2 ;
        mylist[2] =3.3 ;
        mylist[3] =4.4 ;
        mylist[4] =5.5 ;
        mylist[5] =6.6 ;
        mylist[6] = 7.7;
        mylist[7] = 8.8;
        mylist[8] = 9.9;
        mylist[9] = 10.0;
        for (int i=0;i<10;i++){
            sum+=mylist[i];
        }
        System.out.println("总和为: "+sum);
    }
}
