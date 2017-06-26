package longestcommonprefix;

/**
 * Created by Rocana on 2017/6/26.
 */
public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length <= 0) return "";
        String first = strs[0];
        for (int i = 1 ; i < strs.length; i++){
            if (strs[i].indexOf(first) != 0) {
                if (first.length() - 1 >=0) {
                    first = first.substring(0, first.length() - 1);
                    i--;
                }else {
                    first = "";
                    break;
                }
            }
        }
        return first;
    }

    public static void main(String[] args){
        String[] str = {"flow","flight","flq"};
        System.out.println(longestCommonPrefix(str));
    }

}
