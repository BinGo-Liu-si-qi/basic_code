package missliu.day04.demo01;

import java.util.Calendar;

public class Demo06Calendar {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.get(Calendar.YEAR)+"年"+c.get(Calendar.MONTH)+"月"+c.get(Calendar.DATE)+"日");
    }
}
