public class two_point_six{
	public LinkedListNode my_solution(LinkedListNode head){
		LinkedListNode slow = head;
		LinkedListNode fast = head;
		
		//At this point we are length(loop)-k steps into the loop when k is the # of nodes before the loop starts
		while (fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast){
				break;
			}
		}
		//This means that there is no collision.
		if (fast == null || fast.next == null){
			return null;
		}

		slow = head;
		while (fast != slow){
			fast = fast.next;
			slow = slow.next;
		}
		return slow;
	}
}
