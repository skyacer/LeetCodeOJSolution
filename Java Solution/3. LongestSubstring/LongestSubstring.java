package LongestSubstring;

/**
 * Created by Administrator on 2016/1/9 0009.
 */
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2){
            return s.length();
        }
        char[] counters = new char[128];
        char[] stringArray = s.toCharArray();

        int max=0,count=0,tail=0;

        return max;
    }

}
