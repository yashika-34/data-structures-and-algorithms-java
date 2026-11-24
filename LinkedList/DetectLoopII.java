package LinkedList;

/**
 * LeetCode 142: Linked List Cycle II
 * URL: https://leetcode.com/problems/linked-list-cycle-ii/
 * Difficulty: Medium
 * 
 * Approach: Floyd's Tortoise and Hare
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class DetectLoopII {

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Step 2: Find cycle entry
                ListNode entry = head;
                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        DetectLoopII solver = new DetectLoopII();
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // cycle at node 2

        ListNode cycleStart = solver.detectCycle(node1);
        System.out.println("Cycle start value (Expected: 2): " + (cycleStart != null ? cycleStart.val : "null"));
    }
}
