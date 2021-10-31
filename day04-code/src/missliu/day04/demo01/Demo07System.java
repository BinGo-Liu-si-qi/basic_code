package missliu.day04.demo01;

import java.util.Arrays;

public class Demo07System {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        int[] a= new int[]{1,2,3,4,5};
        int[] b= new int[]{6,7,8,9,10};
        System.arraycopy(a,0,b,0,3);
        System.out.println(Arrays.toString(b));
    }
}
