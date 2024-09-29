package linkedlist;

public class ReverseIterative {

    public ListNode reverseLinkedList(ListNode head){

        // Pointers
        ListNode prev = null;
        ListNode next;
        ListNode cur = head;

        // Traverse the head list
        while (cur !=null){
            next = cur.next; // Adjusting next pointer
            cur.next = prev; // Reversing the next LinkNode
            prev = cur; // Adjusting prev pointer
            cur = next; // Adjusting cur pointer
        }

        return prev;
    }

    public static void main(String[] args){

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ReverseIterative reverseIterative = new ReverseIterative();
        ListNode reversedLinkedList = reverseIterative.reverseLinkedList(head);

        while (reversedLinkedList!=null){
            System.out.println(reversedLinkedList.val);
            reversedLinkedList = reversedLinkedList.next;
        }

    }


}
