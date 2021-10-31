package missliu.day04.demo01.demo02;

public class MyInterfaceMain {
    public static void main(String[] args) {
        MyInterfaceAbsImplA a=new MyInterfaceAbsImplA();
        a.MethodA();
        a.MethodB();
        System.out.println("=========================");
        MyInterfaceAbsImplB b=new MyInterfaceAbsImplB();
        b.MethodA();
        b.MethodB();
    }
}
