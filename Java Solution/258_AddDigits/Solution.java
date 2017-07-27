package adddigits;

/**
 * No.258 Add Digits
 * Created by Rocana on 2017/7/27.
 */
public class Solution {
    public static int addDigits(int num) {
        if (num == 0){
            return 0;
        }
        if (num % 9 == 0){
            return 9;
        }else {
            return num % 9;
        }
    }

    public static void main(String[] args){
        System.out.println(addDigits(38));
    }
}
