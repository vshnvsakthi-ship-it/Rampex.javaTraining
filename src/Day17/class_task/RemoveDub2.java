package Day17.class_task;

import java.util.Arrays;
import java.util.HashSet;

class RemoveDup2 {
    public static void main(String[] args) {
        int []arr={1,2,2,3,4};

        removeDup(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void removeDup(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        for(Integer i: nums){
            hs.add(i);
        }
        int index=0;
        for(Integer i:hs){
            nums[index++]=i;
        }

    }

}