package src.solution;// Solve 136. Single Number

import java.util.HashMap;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> dict = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++) {
            if(!dict.containsKey(nums[i])) dict.put(nums[i], 1);
            else dict.put(nums[i], dict.get(nums[i]) + 1);
        }
        
        for (int i : dict.keySet()) {
            if (dict.get(i) == 1) result = i;
        }
        return result;
    }
}
