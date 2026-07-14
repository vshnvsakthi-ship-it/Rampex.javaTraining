package Day8.classtask;

import java.util.Arrays;

class ArrayReversalTwoPointer {
    public static void main(String[] args){
        int []nums={1,2,3,4};
        int n=nums.length;
        int left=0;
        int right=n-1;


        int temp;

        for(int i=0;i<=n/2;i++) {

            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(nums));
    }


}