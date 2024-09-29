package linkedlist;

public class ReverseIterative {

    public ListNode reverseLinkedList(ListNode head){

        ListNode prev = null;
        ListNode next;
        ListNode cur = head;

        while (cur !=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
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
