/**
 * Created by Vincent on 16/2/1.
 */
public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        if(s==null||s.length()==0){
            return "";
        }

        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int left = 0;
        int right = 0;
        int max = 0;

        for(int i = 0;i<len;i++)
            for(int j = 0;j<=i;j++){
                if(s.charAt(i)==s.charAt(j) && (i-j<=2||dp[i-1][j+1]))
                    dp[i][j] = true;

                if(dp[i][j] && max<i-j+1){
                    max = i-j+1;
                    left = j;
                    right = i + 1;
                }
            }

        return s.substring(left,right);
    }

    public static void main(String[] args){
        String s = "abcddcbaefg";
        System.out.println(longestPalindrome(s));
    }
}
