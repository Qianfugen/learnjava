import java.util.Date;

public class DateDemo2{
    public static void main(String[] args){
        Date date = new Date();

        System.out.printf("全部日期和时间信息：%tc%n",date);
        System.out.printf("年月日格式：%tF%n",date);
        System.out.printf("月日年格式：%tD%n",date);
        System.out.printf("HH:MM:SS PM格式（12小时制）:%tr%n",date);
        System.out.printf("HH:MM:SS格式(24小时制)：%tT%n",date);
        System.out.printf("HH:MM格式（24小时制）：%tR%n",date);
    }
}
