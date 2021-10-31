package missliu.day04.demo01.demo02;

import org.omg.CORBA.PUBLIC_MEMBER;

public interface MyInterfaceAbs {

    public abstract void MethodA();

    public default void MethodB()
    {
        System.out.println("默认方法");
    }
}
