package linkedlist;


public class MergeTwoSortedLists {

    public ListNode mergeTwoSortedLists(ListNode list1, ListNode list2){

        // Pointers and dummy node
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        // Run until one of them is null
        while(temp1!=null&&temp2!=null){
            if(temp1.val<temp2.val){
                temp.next = temp1; // update dummy node
                temp = temp.next;  // move pointer ahead
                temp1 = temp1.next; // move pointer ahead
            } else {
                temp.next = temp2;
                temp = temp.next;
                temp2 = temp2.next;
            }
        }

        // Attach the leftover linked list for whichever wasn't null
        if(temp1!=null) temp.next = temp1;
        if(temp2!=null) temp.next = temp2;
        return dummyNode.next;
    }

    public static void main (String[] args){

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(7);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(1);
        list2.next.next = new ListNode(5);
        list2.next.next.next = new ListNode(6);

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode sortedList = mergeTwoSortedLists.mergeTwoSortedLists(list1,list2);

        while (sortedList!=null){
            System.out.println(sortedList.val);
            sortedList= sortedList.next;
        }
    }
}
