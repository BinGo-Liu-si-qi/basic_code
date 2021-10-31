package missliu.day04.demo01;
//冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums=new int[]{100,1,56,73,12,55,4,9};
        for (int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length-1-i;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int max=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=max;
                }
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
    }
}
