package StringToInteger;


/**
 * Created by Vincent on 2016/12/20.
 */
public class StringToInteger {
    public static void main(String[] args){
        System.out.println(stringToInteger("2147483648"));
    }

    /**
     Input:
     "-2147483647"
     Output:
     -2147483648
     Expected:
     -2147483647
     */
    public static int stringToInteger(String str){
        if (str==null || str.length() == 0){
            return 0;
        }
        int num = 0;
        str = str.trim();
        boolean isPositive = true;

        int len = str.length();
        for (int i = 0; i < len; i++){
            char temp = str.charAt(i);

            //1.settle sign
            if (i==0) {
                if (temp == '-') {
                    isPositive = false;
                    continue;
                } else if (temp == '+') {
                    isPositive = true;
                    continue;
                }
            }
            //2.settle invalid char
            if (temp<48||temp>57){
                return isPositive ? num : -num;
            }

            //3.settle  MAX or MIN value
            if (Integer.MAX_VALUE / 10 < num | (Integer.MAX_VALUE / 10 == num & Integer.MAX_VALUE % 10 < (temp-'0'))) {
                return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }else {
                num = (num * 10 + (temp - '0'));
            }
        }
        return isPositive ? num : -num;
    }
}
