package linkedlist;

public class ReverseRecursive {

    public ListNode reverseLinkedList(ListNode head){
        // Base case
        if(head==null||head.next==null){
            return head;
        }

        //Recursion
        ListNode newHead = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ReverseRecursive reverseRecursive = new ReverseRecursive();
        ListNode reversedLinkedList = reverseRecursive.reverseLinkedList(head);

        while(reversedLinkedList!=null){
            System.out.println(reversedLinkedList.val);
            reversedLinkedList = reversedLinkedList.next;
        }
    }
}
