package missliu.day04.demo01;
//水仙花数
public class DaffodilNumber {
    public static void main(String[] args) {
        for(int i=100;i<=999;i++)
        {
            //获取个位数
            int a=i%10;
            //获取十位数
            int b=i/10%10;
            //获取百位数
            int c=i/100;
            if(a*a*a+b*b*b+c*c*c==i)
            {
                System.out.println(i);
            }
        }
    }
}
