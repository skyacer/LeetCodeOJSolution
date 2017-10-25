package maximumswap;

import java.util.Map;

/**
 * Given a non-negative integer, you could swap two digits at most once to get the maximum valued number.
 * Return the maximum valued number you could get.
 * Example 1:
 * Input: 2736
 * Output: 7236
 * Explanation: Swap the number 2 and the number 7.
 * Example 2:
 * Input: 9973
 * Output: 9973
 * Explanation: No swap.
 *
 * Created by Rocana on 2017/10/12.
 */
public class Solution {
    public static int maximumSwap(int num) {
        int[] lastPost = new int[10];

        String s = String.valueOf(num);
        char[] sArray = s.toCharArray();
        int length = sArray.length;

        for (int i = 0 ; i < length; i++){
            //update number last position
            lastPost[sArray[i] - '0'] = i;
        }

        for (int i = 0; i < length; i++){
            for (int j = 9; j > sArray[i] - '0'; j--){
                if (lastPost[j] > i){
                    char temp = sArray[i];
                    sArray[i] = sArray[lastPost[j]];
                    sArray[lastPost[j]] = temp;
                    int result;
                    try {
                       result = Integer.valueOf(String.valueOf(sArray));
                    }catch (NumberFormatException e){
                        result = 0;
                        e.printStackTrace();
                    }
                    return result;
                }
            }
        }
        return num;
    }

    public static void main(String[] args){
        int num = 9937;
        System.out.println(maximumSwap(num));
    }

}
