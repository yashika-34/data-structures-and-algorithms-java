package LinkedList;

/**
 * LeetCode 61: Rotate List
 * URL: https://leetcode.com/problems/rotate-list/
 * Difficulty: Medium
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Compute the length of the list and find the tail
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Connect tail to head to make it circular
        tail.next = head;

        // Effective rotations needed
        k = k % length;
        int stepsToNewHead = length - k;

        ListNode newTail = tail;
        while (stepsToNewHead-- > 0) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null; // Break the cycle

        return newHead;
    }

    public static void main(String[] args) {
        RotateList solver = new RotateList();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode rotated = solver.rotateRight(head, 2);

        System.out.print("Rotated list (Expected 4->5->1->2->3): ");
        while (rotated != null) {
            System.out.print(rotated.val + (rotated.next != null ? "->" : ""));
            rotated = rotated.next;
        }
        System.out.println();
    }
}
