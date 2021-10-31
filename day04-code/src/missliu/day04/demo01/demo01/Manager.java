package missliu.day04.demo01.demo01;

import java.util.ArrayList;

//群主类
public class Manager extends User {
    //无参构造方法
    public Manager()
    {

    }
    //全参构造方法
    public Manager(String name,int money)
    {
        super(name,money);
    }
    //发红包的方法
    public ArrayList<Integer> sendRedBag(int totalMoney,int count)
    {
        //定义一个集合存放红包
        ArrayList<Integer> redBagList=new ArrayList<>();
        //当前可用余额
        int leftMoney=super.getMoney();
        //判断余额是否充足
        if(totalMoney>leftMoney)
        {
            System.out.println("当前余额不足！");
            return  redBagList;
        }
        //计算平均值
        int avg=totalMoney/count;
        int model=totalMoney%count;
        int last=avg+model;
        for (int i = 0; i < count; i++) {
            if(i==count-1)
            {
                redBagList.add(last);
            }
            else
            {
                redBagList.add(avg);
            }
        }
        //群主扣除红包金额
        super.setMoney(leftMoney-totalMoney);
        return  redBagList;
    }
}
