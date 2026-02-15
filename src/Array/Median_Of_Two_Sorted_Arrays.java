package Array;

import java.util.Arrays;

public class Median_Of_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //first solution
//        int[] arr = new int[nums1.length + nums2.length];
//        for (int i = 0; i < nums1.length; i++) {
//            arr[i] = nums1[i];
//        }
//        for (int i = 0; i < nums2.length; i++) {
//            arr[i + nums1.length] = nums2[i];
//        }
//        Arrays.sort(arr);
//        double ans = 0.0;
//        if(arr.length % 2 != 0){
//            ans = arr[arr.length/2];
//        }
//        else{
//            ans = (arr[arr.length/2] + arr[arr.length/2-1])/2.0;
//        }
//        return ans;
        //second solution
        int[] arr = new int[nums1.length + nums2.length];
        int first = 0;
        int second = 0;
        int v = 0;
        while(first < nums1.length && second < nums2.length) {
            if(nums1[first] <= nums2[second]) arr[v++] = nums1[first++];
            else arr[v++] = nums2[second++];
        }
        while(first < nums1.length) arr[v++] = nums1[first++];
        while(second < nums2.length) arr[v++] = nums2[second++];
        double ans = 0.0;
        if(arr.length % 2 != 0){
            ans = arr[arr.length/2];
        }
        else{
            ans = (arr[arr.length/2] + arr[arr.length/2-1])/2.0;
        }
        return ans;
    }
}
