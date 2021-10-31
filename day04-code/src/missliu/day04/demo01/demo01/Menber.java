package missliu.day04.demo01.demo01;

import java.util.ArrayList;
import java.util.Random;

public class Menber extends User {
    public Menber()
    {

    }
    public Menber(String name,int money)
    {
        super(name,money);
    }

    //抢红包方法
    public void receiveRedBag(ArrayList<Integer> list)
    {
        if(list.size()<=0) {
            System.out.println("红包已抢完！");
            return;
        }
        //当前余额
        int leftMoney=super.getMoney();
        //随机取得一个红包
        int index=new Random().nextInt(list.size());
        //拿到的红包金额
        int redBagMoney=list.remove(index);
        //群员加金额
        super.setMoney(leftMoney+redBagMoney);
    }
}
