package AlgorithmicpProblems;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode golova = head;
        while (golova != null && golova.next != null) {
            if (golova.next.val == golova.val) {
                golova.next = golova.next.next;
            } else {
                golova = golova.next;
            }
        }
        return head;
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
