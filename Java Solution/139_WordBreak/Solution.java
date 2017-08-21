package wordbreak;

import java.util.ArrayList;
import java.util.List;

/**
 * 139. Word Break
 * Created by Rocana on 2017/8/17.
 */
public class Solution {
    public static boolean wordBreak(String s, List<String> wordDict) {
        if (s==null || s.length() <= 0 || wordDict == null || wordDict.size() <= 0){
            return false;
        }
        int length = s.length();
        boolean[] isBreak = new boolean[length + 1];
        isBreak[0] = true;
        for (int i = 1 ; i <= length ; i++){
            for (int j = 0 ; j < i ; j++){
                if (isBreak[j] && wordDict.contains(s.substring(j, i))){
                    isBreak[i] = true;
                }
            }
        }
        return isBreak[length];
    }

    public static void main(String[] args){
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        System.out.println(wordBreak(s, wordDict));
    }

}