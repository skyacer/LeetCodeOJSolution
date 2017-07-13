/**
 * Created by Rocana on 2017/7/13.
 * No.263 Ugly Number
 */
public class Solution {
    public static boolean isUgly(int num) {
        if (num <= 0){
            return false;
        }
        while (num % 2 == 0) num = num >> 1;
        while (num % 3 == 0) num = num / 3;
        while (num % 5 == 0) num = num / 5;
        return num == 1;
    }

    public static void main(String[] args){
        System.out.println(isUgly(0));
    }
}