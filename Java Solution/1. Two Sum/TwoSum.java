package TwoSum;

/**
 * Created by Vincent on 15/12/27.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length <=1 || nums[0]+nums[1] > target || nums[nums.length-2]+nums[nums.length-1]<target){
            return null;
        }

        int[] sum = new int[2];
        int low = 0;
        int high = nums.length -1;
        int middle = (low+high)/2;
        while(low<high){
            if((nums[low]+nums[high])>target){
                high = middle;
                middle = (low+high)/2;
            }else if((nums[low]+nums[high])<target){
                low = middle;
                middle = (low+high)/2;
            }else{
                sum[0] = low+1;
                sum[1] = high+1;
                return sum;
            }

        }
        //if not found
        return null;
    }


}
