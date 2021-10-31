package missliu.day04.demo01;
//1-100所有偶数和
public class PrimeNumberSum {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
