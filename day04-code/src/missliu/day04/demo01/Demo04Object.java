package missliu.day04.demo01;

public class Demo04Object {
    public static void main(String[] args) {
        Student t1=new Student("林俊杰",28);
        Student t2=new Student("林俊杰",28);

        System.out.println(t1);

        System.out.println(t1.equals(t2));
    }
}
