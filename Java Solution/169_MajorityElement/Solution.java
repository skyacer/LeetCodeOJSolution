package majorityelement;


/**
 * 169. Majority Element
 * Created by Rocana on 2017/7/26.
 */
public class Solution {
    public static int majorityElement(int[] num) {
        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;

        }
        return major;
    }

    public static void main(String[] args){
        int[] nums = {3,2,3,2,2,2,1};
        System.out.println(majorityElement(nums));
    }
}
