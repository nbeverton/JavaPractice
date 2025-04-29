package LeetCode.Abril.MergeTwoSortedLists_21;

public class MergeTwoSortedLists_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(); // Nó fictício inicial
        ListNode current = dummy; // Ponteiro para o último nó adicionado


        while(list1 != null && list2 != null){

            if (list1.val <= list2.val){
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists_21 mergeTwoSortedLists21 = new MergeTwoSortedLists_21();

        ListNode input1 = new ListNode(1);
        input1.next = new ListNode(2);
        input1.next.next = new ListNode(4);

        ListNode input2 = new ListNode(1);
        input2.next = new ListNode(3);
        input2.next.next = new ListNode(4);


        System.out.println("Resposta: " + mergeTwoSortedLists21.mergeTwoLists(input1, input2));
    }
}
