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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return null;
    }
    public static ListNode reverseList(ListNode head){
        if(head == null || head.next==null){
            return head;
        }

        ListNode cur = head;
        ListNode reverse = null;

        while(cur!= null){
            ListNode next = cur.next;
            cur.next = reverse;
            reverse = cur;
            cur = next;
        }
        return reverse;
    }

    public static void main(String[] args){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);


        a.next = b;
        b.next = c;


        ListNode cur = a;

        while (cur!=null){
            System.out.println(cur.val);
            cur = cur.next;
        }

        ListNode reverse = reverseList(a);

        ListNode reverseCur = reverse;

        while(reverseCur!= null){
            System.out.println(reverseCur.val);
            reverseCur = reverseCur.next;
        }

    }


}
