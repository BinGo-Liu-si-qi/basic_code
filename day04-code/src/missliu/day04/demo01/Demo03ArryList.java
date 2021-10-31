package missliu.day04.demo01;

import javax.swing.text.StyleContext;
import java.util.ArrayList;
import java.util.Random;

public class Demo03ArryList {
    public static void main(String[] args) {
        ArrayList<Integer> rlist=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 20; i++) {
            rlist.add(r.nextInt(100)+1);
        }
        ArrayList templist= samllArryList(rlist);
        System.out.println("返回有："+templist.size()+"个");
        for (int i = 0; i < templist.size(); i++) {
            System.out.println(templist.get(i));
        }
    }

    public static ArrayList<Integer> samllArryList(ArrayList<Integer> rlist)
    {
        ArrayList<Integer> slist=new ArrayList<>();
        for (int i = 0; i < rlist.size(); i++) {
            if(rlist.get(i)%2==0)
            {
                slist.add(rlist.get(i));
            }
        }
        return slist;
    }
}
