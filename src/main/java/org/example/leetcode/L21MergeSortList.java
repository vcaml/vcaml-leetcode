package org.example.leetcode;

/**
 *  合并两个有序的链表 变成一个新的有序链表
 * */
public class L21MergeSortList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode pre = new ListNode(-1);
        ListNode list0 = pre;
        while (list1!=null && list2!=null) {
            if (list1.val <= list2.val) {
             list0.next = list1;
             list0 = list0.next;
             list1=list1.next;
            }else {
             list0.next = list2;
             list0 = list0.next;
             list2 =list2.next;
            }
        }
        if(list1==null){
            list0.next = list2;
        }
        if (list2==null){
            list0.next=list1;
        }
      return pre.next;
    }

    public static void main(String[] args) {
        ListNode pre = new ListNode(1);

        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        ListNode p5 = new ListNode(5);

        ListNode l0 = pre;
        l0.next = p2;
        l0 = l0.next;
        l0.next = p3;
        l0= l0.next;
        l0.next =p4;


        ListNode current = pre;

        // 遍历链表并输出每个节点的val值
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

        System.out.println();  // 换行
    }
}
