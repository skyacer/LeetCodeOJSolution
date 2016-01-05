package AddTwoNumbers;
/**
 * Definition for singly-linked list.
 * public class Util.ListNode {
 *     int val;
 *     Util.ListNode next;
 *     Util.ListNode(int x) { val = x; }
 * }
 */


import Util.ListNode;

/**
 * Created by Wayne on 15/12/29.
 */
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return count(l1,l2,0);
    }


   public static ListNode count(ListNode l1,ListNode l2,int isCarry){
       if (l1==null && l2==null && isCarry==0){
           return null;
       }
       int sum = 0;
       sum = isCarry + (l1==null?0:l1.val) +  (l2==null?0:l2.val);

       if (sum >= 10){
           isCarry = 1;
           sum = sum - 10;
       }else {
           isCarry = 0;
       }

       ListNode tmp = new ListNode(sum);
       tmp.next = count(l1==null?null:l1.next,l2==null?null:l2.next,isCarry);

       return tmp;
   }

    public static void main(String[] args){
        ListNode a = new ListNode(8);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);

        ListNode d = new ListNode(5);
        ListNode e = new ListNode(6);
        ListNode f = new ListNode(7);

        a.next = b;
        b.next = c;

        d.next = e;
        e.next = f;

        ListNode out = addTwoNumbers(a,d);


        while (out!=null){
            System.out.println(out.val);
            out = out.next;
        }

    }


}
