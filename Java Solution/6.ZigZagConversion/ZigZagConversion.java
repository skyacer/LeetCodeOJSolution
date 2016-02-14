/**
 * Created by Vincent on 16/2/2.
 */
public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        char[] sArray = s.toCharArray();
        int length = s.length();
        StringBuffer[] record = new StringBuffer[numRows];

        for(int i=0;i<numRows;i++) record[i] = new StringBuffer();
        int cursor = 0;

        while(cursor<length){
            for(int i = 0;i<numRows && cursor<length;i++)
                record[i].append(sArray[cursor++]);      //down

            for(int i = numRows-2;i>0 && cursor<length;i--)
                record[i].append(sArray[cursor++]);       //up
        }

        for(int i=1;i<numRows;i++)
            record[0].append(record[i]);

        return record[0].toString();
    }


    public static void main(String[] agrs){
        String s = "abcdefghijk";
        int nRows = 3;
        System.out.println(convert(s,nRows));

    }
}