package longestincreasingsubsequence;

import java.util.ArrayList;
import java.util.List;

/**
 * No.300. Longest Increasing Subsequence
 * Created by Rocana on 2017/7/31.
 */
public class Solution {
    /**
     * 1. use a assist array, loop to find element x compares to the last array's element(last).
     * 2. if x > last, put x to assist array's rear position.
     * 3. if x < last, binary research assist array to find out first number which greater or equals to x, and swap x with it.
     * @param nums
     * @return length of LIS
     */
    public static int lengthOfLIS(int[] nums) {
        if (nums.length <= 0){
            return 0;
        }
        List<Integer> results = new ArrayList<>();
        for (int i = 0 ; i < nums.length ; i++){
            int target = nums[i];
            int size = results.size();
            if (i == 0 || results.get(size - 1) < target){
                results.add(target);
            }else {
                //binary search results to insert the first number which greater or equals target number
                int low = 0;
                int high = results.size()-1;
                while (low < high){
                    int mid = (low + high) / 2;
                    if (results.get(mid) < target){
                        low = mid + 1;
                    }else {
                        high = mid - 1;
                    }
                }
                if (results.get(low)>=target) {
                    results.set(low, target);
                }else {
                    results.set(low+1,target);
                }
            }
        }
        return results.size();
    }

    public static void main(String[] args){
        int[] nums = new int[]{3,5,6,2,5,4,19,5,6,7,12};
        System.out.println(lengthOfLIS(nums));
    }
}