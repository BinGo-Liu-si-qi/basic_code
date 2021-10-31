package missliu.day04.demo01.MyRedPacket;

import missliu.day04.demo01.red.OpenMode;


public class DemoRedPacketMain {
    public static void main(String[] args) {
        MyRed red=new MyRed("Java学习");
        red.setOwnerName("刘斯琦");
        //按平均
        OpenMode om=new NonmorlMode();
        red.setOpenWay(om);
    }
}
