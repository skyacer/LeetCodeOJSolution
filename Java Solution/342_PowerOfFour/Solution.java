public class Solution {
    public static boolean isPowerOfFour(int num) {
        //1.first the num should > 0
        //2.then num & num - 1 is judge whether the num is power of 2
        //3.0x55555555 is judge whether the number's 1 position is followed by even number's zero. like 100(4),10000(16)
        return num > 0 && (num & (num - 1)) == 0 && (num & 0x55555555) == num;
    }

    public static void main(String[] args){
        System.out.println(isPowerOfFour(0));
    }
}