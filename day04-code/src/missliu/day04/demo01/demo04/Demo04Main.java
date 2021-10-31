package missliu.day04.demo01.demo04;

public class Demo04Main {
    public static void main(String[] args) {
        AbstrFly fly=new AbstrFly() {
            @Override
            public void fly() {
                System.out.println("起飞啦。。。。");
            }
        };
        fly.fly();
    }
}
