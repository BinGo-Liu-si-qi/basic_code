package missliu.day04.demo01.demo06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01ArryList {
    public static void main(String[] args) {
        Collection<String> col=new ArrayList<>();
        col.add("你好");
        col.add("刘姝曼");
        col.add("爸爸");
        col.add("爱你");

        //迭代器遍历
        Iterator<String> it = col.iterator();
        while (it.hasNext())
        {
            String str = it.next();
            System.out.println(str);
        }
        System.out.println("=====================");
        //增强for循环
        for(String str:col)
        {
            System.out.println(str);
        }
    }
}
