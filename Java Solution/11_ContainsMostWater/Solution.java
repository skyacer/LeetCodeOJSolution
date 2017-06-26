package containsmostwater;

/**
 * Created by Rocana on 2017/3/27.
 */
public class ContainsMostWater {
    public static int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right){
            result = Math.max(result,
                    ((right - left) * Math.min(height[left], height[right])));
            if (height[left] > height[right]){
                right--;
            }else {
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(maxArea(new int[]{1,2,3,4,5,6}));
    }
}
