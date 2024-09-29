package linkedlist;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class RecursiveReverse {

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

        RecursiveReverse recursiveReverse = new RecursiveReverse();
        ListNode reversedLinkedList = recursiveReverse.reverseLinkedList(head);

        System.out.println(reversedLinkedList);
    }
}
