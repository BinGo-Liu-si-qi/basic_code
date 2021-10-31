package missliu.day04.demo01.demo07;


import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class demo02DoudizYouXu {
    public static void main(String[] args) {
        //准备牌
        //定义map集合存储扑克索引和组合牌
        HashMap<Integer,String> poker=new HashMap<>();
        //定义集合存储牌索引
        ArrayList<Integer> pokerIndex=new ArrayList<>();
        //定义数组存储花色
        String[] huase=new String[]{"♠","♥","♣","♦"};
        //定义扑克序号
        String[] xuhao=new String[]{"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        int index=0;
        //添加大王
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        //添加小王
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        for (String s : huase) {
            for (String x : xuhao) {
                poker.put(index,s+x);
                pokerIndex.add(index);
                index++;
            }
        }
        //System.out.println(poker);
        //System.out.println(pokerIndex);
        //洗牌
        Collections.shuffle(pokerIndex);
        //发牌
        //定义4个集合接收牌
        ArrayList<Integer> p1=new ArrayList<>();
        ArrayList<Integer> p2=new ArrayList<>();
        ArrayList<Integer> p3=new ArrayList<>();
        ArrayList<Integer> dipai=new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            if(i>=51)
            {
                dipai.add(pokerIndex.get(i));
            }
            else if(i%3==0)
            {
                p1.add(pokerIndex.get(i));
            }
            else if(i%3==1)
            {
                p2.add(pokerIndex.get(i));
            }
            else if(i%3==2)
            {
                p3.add(pokerIndex.get(i));
            }
        }
        //排序
        Collections.sort(dipai);
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        //看牌
        lookPoker("刘德华",poker,p1);
        lookPoker("郭富城",poker,p2);
        lookPoker("张学友",poker,p3);
        lookPoker("底牌",poker,dipai);
    }

    public static void lookPoker(String username,HashMap<Integer,String> poker,ArrayList<Integer> pokerIndex)
    {
        System.out.print(username+"：");
        for (Integer index : pokerIndex) {
            System.out.print(poker.get(index));
            System.out.print(" ");
        }
        System.out.println();
    }
}
