package Array;

import java.util.HashMap;
import java.util.HashSet;

public class Contains_Duplicate {
    public boolean hasDuplicate(int[] nums) {
        // first solution with hashmap
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean n = false;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                n = true;
            }
            map.put(nums[i], i);
            if(n) break;
        }
        if(n) return true;
        return false;
        //second solution with hashset
//        HashSet<Integer> set = new HashSet<>();
//        for(int i = 0; i < nums.length; i++){
//            if(!set.add(nums[i])) return true;
//        }
//        return false;
    }
}
