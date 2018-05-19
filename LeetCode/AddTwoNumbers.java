/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author mac
 */
public class AddTwoNumbers {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        int sum = (l1.val + l2.val) % 10;
        int carry = (l1.val + l2.val) / 10;
        ListNode result = new ListNode(sum);
        ListNode head = result;
        if (l1.next == null & carry > 0) {
            ListNode carryNode = new ListNode(carry);
            result.next = carryNode;
        }
        while (l1.next != null || l2.next != null) {
            l1 = l1.next;
            l2 = l2.next;
            if (l1 == null) l1 = new ListNode(0);
            if (l2 == null) l2 = new ListNode(0);
            sum = carry + (l1.val + l2.val);
            ListNode newNode = new ListNode(sum % 10);
            result.next = newNode;
            result = newNode;
            carry = sum / 10;
        }
        if (carry > 0) {
        ListNode carryNode = new ListNode(carry);
            result.next = carryNode;
        }
        return head;
    }
    
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}

