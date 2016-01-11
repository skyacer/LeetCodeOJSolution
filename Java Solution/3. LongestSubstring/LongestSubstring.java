package LongestSubstring;

/**
 * Created by Administrator on 2016/1/9 0009.
 */
public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()<2){
            return s.length();
        }
        char[] counters = new char[128];
        char[] stringArray = s.toCharArray();

        int max=0,count=0,tail=0;
        for(int i = 0;i<stringArray.length;i++){
            if(counters[stringArray[i]]==0){
                counters[stringArray[i]]++;
                if(++count>max){
                    max = count;
                }

            }else{
                while(stringArray[i]!=stringArray[tail]&&tail<i){
                    count--;
                    counters[stringArray[tail++]]--;
                }
                tail++;
            }
        }
        return max;
    }

    public static void main(String[] args){
        String s = "pwwkew";
        int out = lengthOfLongestSubstring(s);
        System.out.println(out);
    }

}
