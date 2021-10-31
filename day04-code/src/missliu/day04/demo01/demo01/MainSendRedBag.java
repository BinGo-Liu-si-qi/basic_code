package missliu.day04.demo01.demo01;

import java.util.ArrayList;

public class MainSendRedBag {
    public static void main(String[] args) {
        //创建群主
        Manager manager=new Manager("群主",100);
        //创建群员
        Menber menberA=new Menber("群员A",0);
        Menber menberB=new Menber("群员B",0);
        Menber menberC=new Menber("群员C",0);

        manager.show();
        menberA.show();
        menberB.show();
        menberC.show();
        System.out.println("==============================");

        //群主发红包
        ArrayList<Integer> redBagList= manager.sendRedBag(10,2);
        //群员抢红包
        menberA.receiveRedBag(redBagList);
        menberB.receiveRedBag(redBagList);
        menberC.receiveRedBag(redBagList);
        manager.show();
        menberA.show();
        menberB.show();
        menberC.show();
        System.out.println("==============================");

        //群主再次发红包
        redBagList= manager.sendRedBag(20,3);
        //群员抢红包
        menberA.receiveRedBag(redBagList);
        menberB.receiveRedBag(redBagList);
        menberC.receiveRedBag(redBagList);
        manager.show();
        menberA.show();
        menberB.show();
        menberC.show();
        System.out.println("==============================");
    }
}
