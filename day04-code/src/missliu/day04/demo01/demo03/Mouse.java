package missliu.day04.demo01.demo03;
//USB实现鼠标类
public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("连接鼠标");
    }

    @Override
    public void close() {
        System.out.println("断开鼠标");
    }

    public void click()
    {
        System.out.println("鼠标点击");
    }
}
