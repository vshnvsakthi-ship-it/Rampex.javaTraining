package day7.classtask;

public class minnegative {

    public static void main(String[] args){
        int[] nums={-3,-1,-2,4,3,1,5,2};
        int min=nums[0];
        for(int i=0;i<nums.length;i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("minimum number is "+min);
    }


}