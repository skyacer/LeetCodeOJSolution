package MergeIntavals;

/**
 * Created by Rocana on 2017/6/30.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {

    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() <= 0){
            return new ArrayList<>();
        }

        List<Interval> resultIntervals = new ArrayList<>();
        //1.sort by intervals' start
       intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));


        //2.merge intervals
        Interval pre = intervals.get(0);
        for (int i = 1 ; i < intervals.size() ; i++){
            Interval next = intervals.get(i);
            if (pre.end >= next.start){
                //merge
                if (pre.end < next.end){
                    pre.end = next.end;
                }
            }else {
                resultIntervals.add(pre);
                pre = next;
                i--;
            }
        }
        resultIntervals.add(pre);
        return resultIntervals;
    }

    private List<Interval> result(){
        Interval i = new Interval(2,6);
        Interval j = new Interval(-1,5);
        Interval k = new Interval(3,4);
        Interval l = new Interval(8,10);
        List<Interval> input = new ArrayList<>();
        input.add(i);
        input.add(j);
        input.add(k);
        input.add(l);
        return merge(input);
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        List<Interval> intervals = solution.result();
    }

}
