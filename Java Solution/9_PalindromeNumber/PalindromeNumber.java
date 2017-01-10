package PalindromeNumber;

/**
 * Created by Rocana on 2017/1/10.
 */
public class PalindromeNumber {
    public static void main(String[] args){
        System.out.println(isPalindrome(-2212));
    }

    public static boolean isPalindrome(int x){
        if (x<0) return false;
        int num = x;
        int reverse = 0;
        while(num != 0){
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        return x == reverse;
    }
}
