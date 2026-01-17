public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Given head, the head of a linked list, determine if the linked list has a
         * cycle in it.
         * 
         * There is a cycle in a linked list if there is some node in the list that can
         * be reached again by continuously following the next pointer. Internally, pos
         * is used to denote the index of the node that tail's next pointer is connected
         * to. Note that pos is not passed as a parameter.
         * 
         * Return true if there is a cycle in the linked list. Otherwise, return false.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: head = [3,2,0,-4], pos = 1
         * Output: true
         * Explanation: There is a cycle in the linked list, where the tail connects to
         * the 1st node (0-indexed).
         * 
         * Example 2:
         * 
         * Input: head = [1,2], pos = 0
         * Output: true
         * Explanation: There is a cycle in the linked list, where the tail connects to
         * the 0th node.
         * 
         * Example 3:
         * 
         * Input: head = [1], pos = -1
         * Output: false
         * Explanation: There is no cycle in the linked list.
         * 
         * 
         */
        System.out.println("Hello, World!");
        // Create the nodes
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        // Link the nodes to form the linked list
        head.next = node2; // 3 -> 2
        node2.next = node3; // 2 -> 0
        node3.next = node4; // 0 -> -4
        node4.next = node2; // -4 -> 2 (cycle back to the second node)

        /*
         * System.out.println("The original given linked list is: ");
         * printList(head);
         */

        Solution solution = new Solution();
        boolean result = solution.hasCycle(head);
        System.out.println("Does the given linked list has cycles-->" + result);

    }

    /**
     * Cannot use it if the linked list has cycles as the data will go on to be
     * prnted indefinitely.
     * 
     * @param head
     */
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
