package missliu.day04.demo01;

import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        System.out.println("请输入第一个数字:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入第二个数字:");
        int b = new Scanner(System.in).nextInt();
        System.out.println("请输入第三个数字:");
        int c = new Scanner(System.in).nextInt();
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("最大值是：" + max);
    }
}
