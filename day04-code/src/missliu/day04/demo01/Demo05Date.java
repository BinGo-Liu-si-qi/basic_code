package missliu.day04.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class Demo05Date {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入出生日期，格式（yyyy-MM-dd）");
        String brithdayStr= sc.next();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date brithdayDate=sdf.parse(brithdayStr);
        long brithdatTime=brithdayDate.getTime();
        long todayTime=new Date().getTime();
        System.out.println("你已经活了："+((todayTime-brithdatTime)/1000/60/60/24)+"天");
    }
}
