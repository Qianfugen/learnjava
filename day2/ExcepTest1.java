import java.io.*;

public class ExcepTest1{
    public static void main(String[] args){
        try{
            file = new FileInputStream(filename);
            x=(byte) file.read();
        }catch (FileNotFoundException f){
            f.printStackTrace();
            return -1;
        }catch (IOException i){
            i.printStackTrace();
            return -1;
        }
    }
}
