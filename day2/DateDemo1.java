import java.util.*;
import java.text.*;

public class DateDemo1{
    public static void main(String[] args){
        Date dNow=new Date();
        SimpleDateFormat ft=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        System.out.println("current time: " + ft.format(dNow));
    }
}
