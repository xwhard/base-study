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
            ListNode listNode = new ListNode(0);//头结点
            ListNode firstNode = listNode;

            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    listNode.next = l1;
                    l1 = l1.next;
                } else {
                    listNode.next = l2;
                    l2 = l2.next;
                }
                listNode = listNode.next;
            }

            while (l1 != null) {
                listNode.next = l1;
                l1 = l1.next;
                listNode = listNode.next;
            }

            while (l2 != null) {
                listNode.next = l2;
                l2 = l2.next;
                listNode = listNode.next;
            }
            return firstNode.next;
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
