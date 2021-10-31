package missliu.day04.demo01.demo03;
//USB实现监盘类
public class Keyborad implements USB {
    @Override
    public void open() {
        System.out.println("连接键盘");
    }

    @Override
    public void close() {
        System.out.println("断开键盘");
    }

    public void print()
    {
        System.out.println("键盘输入");
    }
}
