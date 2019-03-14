package standard.leetcode.easy;

/**
 * @author:xwh
 * @date 2019/3/14 10:22
 */
//merge 2 short list
public class P021_Easy007 {
    /**
     * Input: 1->2->4, 1->3->4
     * Output: 1->1->2->3->4->4
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return null;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(3);
        listNode1.next.next.next = new ListNode(4);
        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(5);
        listNode2.next.next.next = new ListNode(7);
        ListNode result = new P021_Easy007().mergeTwoLists(listNode1, listNode2);
        System.out.println(result);
    }
}
