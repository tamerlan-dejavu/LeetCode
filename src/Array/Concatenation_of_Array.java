package Array;

public class Concatenation_of_Array {
    public int[] getConcatenation(int[] nums) {
        //first solution
//        int[] arr = new int[nums.length*2];
//        for(int i = 0; i < nums.length; i++){
//            arr[i] = nums[i];
//            arr[i+nums.length] = nums[i];
//        }
//        return arr;
        //second solution /
        int[] arr = new int[nums.length*2];
        System.arraycopy(nums, 0, arr, 0, nums.length);
        System.arraycopy(nums, 0, arr, nums.length, nums.length);
        return arr;
    }

}
