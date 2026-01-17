public class Solution {

    public boolean hasCycle(ListNode head) {
        /**
         * We will use fast and slow pointer approach in which:
         * - slow: +1 node
         * - fast: +2 node
         * we iterate through the list and terminate when fast=null or fast.next=null
         * At that moment, whatever the value of slow pointer is, will be the middle
         * value.
         * 
         * For detecting a cycle, we check if fast pointer and slow pointer are at the
         * same node. If yes, then the given linked list has a cycle.
         */

        /**
         * Checking edge case
         */
        if (head == null) {
            return false;
        }
        /**
         * initializing fast and slow pointers.
         */
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != null || fast != null) {
            if (fast == null || fast.next == null) {
                /**
                 * Why? Because if fast.next is null then the linked list has ended and non
                 * cycles are detected.
                 */
                return false;
            }
            if (fast.val == slow.val) {
                /**
                 * This can only happen if there is a cycle in the given linked list
                 */
                return true;
            }
            /**
             * update pointers to their new values
             */
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;

    }

}
