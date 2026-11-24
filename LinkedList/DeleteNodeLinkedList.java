package LinkedList;

/**
 * LeetCode 237: Delete Node in a Linked List
 * URL: https://leetcode.com/problems/delete-node-in-a-linked-list/
 * Difficulty: Medium
 * 
 * Approach: Copy value of next node and bypass next node
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class DeleteNodeLinkedList {

    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        DeleteNodeLinkedList solver = new DeleteNodeLinkedList();
        ListNode head = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))));
        solver.deleteNode(head.next); // Delete node 5

        System.out.print("After deletion (Expected 4->1->9): ");
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + (curr.next != null ? "->" : ""));
            curr = curr.next;
        }
        System.out.println();
    }
}
