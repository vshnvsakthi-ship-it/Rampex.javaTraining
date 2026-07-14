package day7.classtask;

public class min {
    public static void main(String[] args){
        int[] nums={4,3,1,5,2};
        int min=10000;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("minimum number is "+min);
    }
}