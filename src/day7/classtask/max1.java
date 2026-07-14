package day7.classtask;

public class max1 {

    public static void main(String[] args){
        int[] nums={4,3,1,5,2};
        int max=0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("maximum number is "+max);
    }

}