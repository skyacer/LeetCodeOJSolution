package MultiplyStrings;

/**
 * No.43 Multiply Strings
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2.

 Note:

 The length of both num1 and num2 is < 110.
 Both num1 and num2 contains only digits 0-9.
 Both num1 and num2 does not contain any leading zero.
 You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class Solution {
    public static String multiply(String num1, String num2) {
        if (num1 ==null || num1.equals("") || num2 == null || num2.equals("")){
            return "";
        }

        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m+n];

        for (int i = m - 1; i >= 0 ; i--){
            for (int j = n - 1; j >= 0; j--){
                int mul = ((num1.charAt(i) - '0') * (num2.charAt(j) - '0')) + result[i+j+1] + result[i+j] * 10;
                int l = mul / 10;
                int r = mul % 10;
                result[i+j+1] = r;
                result[i+j] = l;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : result){
            if (!(sb.length() == 0 && i == 0)){
                sb.append(i);
            }
        }
        if (sb.length() == 0){
            return "0";
        }else {
            return sb.toString();
        }
    }

    public static void main(String[] args){
        String num1 = "123";
        String num2 = "456";

        System.out.println(multiply(num1, num2));

    }
}
