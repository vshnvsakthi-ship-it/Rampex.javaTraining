package Day8.classtask;

import java.util.Arrays;
class ArrayReverseInplace {
    public static void main(String []args){
        int []nums={1,2,3,4};
        //int temp=nums[0];
        //nums[0]=nums[3];
        //nums[3]=temp//;

        //temp=nums[1];
        //nums[1]=nums[2];
        //nums[2]=temp;

        int temp=0;
        int n= nums.length;
        for(int i=0;i<nums.length/2;i++){
            temp=nums[i];
            nums[i]=nums[n-1-i];
            nums[n-1-i]=temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}