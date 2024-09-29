package linkedlist;

public class ReverseRecursive {

    public ListNode reverseLinkedList(ListNode head){
        // Base case
        if(head==null||head.next==null){
            return head;
        }

        //Recursion
        ListNode newHead = reverseLinkedList(head.next); // Example: Returned 5 from base case
        head.next.next = head; // Reversing the pointer // 4's next -> (5)'s next = 4 : Situation
        head.next = null; // Breaking the above situation : 4 -> 5 -> 4 // we make 4's next = null, so that newHead becomes 5->4->null
        return newHead; // returning 5->4->null
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
