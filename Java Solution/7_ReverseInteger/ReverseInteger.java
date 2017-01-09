package ReverseInteger;

/**
 * Created by Vincent on 16/3/24.
 */
public class ReverseInteger {
    public static int reverseInteger(int x){
        long res = 0;
        for (; x != 0; x /= 10)
            res = res * 10 + x % 10;
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0: (int) res;
    }

    public static void main(String[] args){
        reverseInteger(9876);
    }
}
