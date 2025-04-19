package LeetCode.Abril.RemoveDuplicates_83;

public class RemoveDuplicates_83 {
    public ListNode deleteDuplicates(ListNode head){
        if (head == null){
            return null;
        }

        ListNode current = head;

        while (current != null && current.next != null){

            if (current.val == current.next.val){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        RemoveDuplicates_83 removeDuplicates83 = new RemoveDuplicates_83();

        ListNode input = new ListNode(1);
        input.next = new ListNode(1);
        input.next.next = new ListNode(2);

        System.out.println(removeDuplicates83.deleteDuplicates(input));
    }
}
