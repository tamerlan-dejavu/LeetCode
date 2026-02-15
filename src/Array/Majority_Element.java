package Array;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element {
    public int majorityElement(int[] nums) {
        // first solution with hashmap
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < nums.length; i++) {
//            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//        }
//        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if(entry.getValue() > nums.length/2) return entry.getKey();
//        }
//        return -1;
        // second solution with Boyer-Moore Voting Algorithm
        int candidate = 0;
        int count = 0;
        for(int num : nums){
            if(count == 0) candidate = num;
            count+= (num==candidate) ? 1 : -1;
        }
        return candidate;
    }
}
