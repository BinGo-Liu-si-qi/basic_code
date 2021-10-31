package missliu.day04.demo01.demo03;
//笔记本类
public class Computer {
    public void PowerOn()
    {
        System.out.println("笔记本开机");
    }

    public void PowerOff()
    {
        System.out.println("笔记本关机");
    }

    public void UsbDevice(USB usb)
    {
        usb.open();
        if(usb instanceof Mouse)
        {
           Mouse m= (Mouse)usb;
           m.click();
        }
        else if(usb instanceof Keyborad)
        {
            Keyborad k=(Keyborad)usb;
            k.print();
        }
        usb.close();
    }
}
