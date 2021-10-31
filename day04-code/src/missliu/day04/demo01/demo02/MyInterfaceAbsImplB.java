package missliu.day04.demo01.demo02;

public class MyInterfaceAbsImplB implements MyInterfaceAbs {
    @Override
    public void MethodA() {
        System.out.println("实现了抽象方法B");
    }

    @Override
    public void MethodB() {
        System.out.println("实现了默认方法B");
    }
}
