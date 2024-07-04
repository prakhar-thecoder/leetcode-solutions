class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    @Override
    public String toString() {
        return String.format("val: %d, next: %s", val, next);
    }
}

public class P21MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l13 = new ListNode(4);
        ListNode l12 = new ListNode(2, l13);
        ListNode l11 = new ListNode(1, l12);

        ListNode l23 = new ListNode(4);
        ListNode l22 = new ListNode(3, l23);
        ListNode l21 = new ListNode(1, l22);

        System.out.println(mergeTwoLists(l11, l21));
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode temp = result;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        return result.next;
    }
}