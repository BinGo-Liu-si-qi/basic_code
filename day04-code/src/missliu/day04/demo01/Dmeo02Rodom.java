package missliu.day04.demo01;

import java.util.Random;
import java.util.Scanner;

/*
生成随机数1-100，可以猜10次
*/
public class Dmeo02Rodom {
    public static void main(String[] args) {
        Random r=new Random();
        int num=r.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        for (int i = 1; i <=10 ; i++) {

            System.out.println("请输入你猜的数字：");
            int c=sc.nextInt();
            if(num>c)
            {
                System.out.println("你猜的次数太小了，请重试！");
            }
            else if(num<c)
            {
                System.out.println("你猜的数字太大了，请重试！");
            }
            else
            {
                System.out.println("恭喜你，猜对了！");
                break;
            }

            if(i==10)
            {
                System.out.println("次数已用完，欢迎你下次再来挑战！");
                break;
            }
        }
        System.out.println("游戏结束！");
    }
}
