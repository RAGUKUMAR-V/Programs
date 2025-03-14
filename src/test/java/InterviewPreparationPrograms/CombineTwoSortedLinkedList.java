package InterviewPreparationPrograms;

import java.util.LinkedList;
import java.util.List;

public class CombineTwoSortedLinkedList {

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
           while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                // If list1's node is smaller, add it to the merged list
                current.next = list1;
                list1 = list1.next;
            } else {
                // If list2's node is smaller, add it to the merged list
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next; // Move the current pointer forward
        }
        
        // If there are remaining nodes in list1, add them
        if (list1 != null) {
            current.next = list1;
        }
        
        // If there are remaining nodes in list2, add them
        if (list2 != null) {
            current.next = list2;
        }
        
        // Return the next of the dummy node as it points to the head of the merged list
        return dummy.next;
    }
	
	
	public static void main(String[] args) {
	
		List<Integer>list1=new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(4);
		list1.add(6);
		
		
		List<Integer>list2=new LinkedList<>();
		list1.add(1);
		list1.add(3);
		list1.add(5);
		list1.add(6);
		
		solve(list1, list2);

	}

}
