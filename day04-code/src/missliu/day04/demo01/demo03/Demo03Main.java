package missliu.day04.demo01.demo03;

public class Demo03Main {
    public static void main(String[] args) {
        Computer com=new Computer();
        com.PowerOn();
        com.UsbDevice(new Mouse());
        com.UsbDevice(new Keyborad());
        com.PowerOff();
    }
}
