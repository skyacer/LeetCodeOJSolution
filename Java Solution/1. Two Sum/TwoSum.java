package TwoSum;

import java.util.HashMap;

/**
 * Created by Vincent on 15/12/27.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> markMap = new HashMap<>();
        int[] notFoundResult = {0,0};
        for (int i=0;i<nums.length;i++){
            if (markMap.get(target-nums[i])!=null){
                int[] result = {markMap.get(target-nums[i])+1,i+1};
                return result;
            }
            markMap.put(nums[i],i);
        }

        return notFoundResult;
    }

}
