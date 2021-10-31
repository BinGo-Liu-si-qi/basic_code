package missliu.day04.demo01.demo07;

import java.util.ArrayList;
import java.util.Collections;

public class demo01Doudiz {
    public static void main(String[] args) {
        //准备牌
        //定义集合存储扑克
        ArrayList<String> poker=new ArrayList<>();
        //定义花色数字
        String[] huaseArry=new String[]{"♠","♥","♣","♦"};
        //定义序号
        String[] nums=new String[]{"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //组合牌
        poker.add("大王");
        poker.add("小王");
        for (String s : huaseArry) {
            for (String num : nums) {
                poker.add(s+num);
            }
        }
        //System.out.println(poker);
        //洗牌
        Collections.shuffle(poker);
        //System.out.println(poker);
        //发牌
        //定义4个集合接收
        ArrayList<String> p1=new ArrayList<>();
        ArrayList<String> p2=new ArrayList<>();
        ArrayList<String> p3=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            if (i >= 51) {
                dipai.add(poker.get(i));
            } else if (i % 3 == 0) {
                p1.add(poker.get(i));
            } else if (i % 3 == 1) {
                p2.add(poker.get(i));
            } else if (i % 3 == 2) {
                p3.add(poker.get(i));
            }
        }
        //看牌
        System.out.println("刘德华的牌："+p1);
        System.out.println("周润发的牌："+p2);
        System.out.println("周星驰的牌："+p3);
        System.out.println("底牌："+dipai);
    }
}
