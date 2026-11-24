package LinkedList;

/**
 * LeetCode 876: Middle of the Linked List
 * URL: https://leetcode.com/problems/middle-of-the-linked-list/
 * Difficulty: Easy
 * 
 * Approach: Fast and Slow Pointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class MiddleNode {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        MiddleNode solver = new MiddleNode();
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println("Middle node value (Expected: 3): " + solver.middleNode(head1).val);

        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        System.out.println("Middle node value (Expected: 4): " + solver.middleNode(head2).val);
    }
}
