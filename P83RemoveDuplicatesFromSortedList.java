class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        if (temp == null) {
            return temp;
        }

        do {
            if (temp.next == null) {
                break;
            }
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }

        } while (temp != null);

        return head;
    }
}