package LeetCode.Junho.ReverseLinkedList_206;

public class ReverseLinkedList_206 {
    public ListNode reverseList (ListNode head){
        ListNode current = head;


        return current;
    }

    public static void main(String[] args) {
        ReverseLinkedList_206 reverseLinkedList206 = new ReverseLinkedList_206();

        ListNode input = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(reverseLinkedList206.reverseList(input));
    }

}
