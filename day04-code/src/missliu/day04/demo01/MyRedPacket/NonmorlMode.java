package missliu.day04.demo01.MyRedPacket;

import missliu.day04.demo01.red.OpenMode;

import java.util.ArrayList;

public class NonmorlMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney,final int totalCount) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        int avg=totalMoney/totalCount;
        int mode=totalMoney%totalCount;
        for (int i = 0; i < totalCount-1; i++) {
            list.add(avg);
        }
        list.add(avg+mode);
        return list;
    }
}
