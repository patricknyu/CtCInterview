public class two_point_seven{
	public static void main(String args[]){
	}
	//An easy way to do this is to reverse the list and compare.  Here is a recursive funciton to reverse a LinkedList
	public LinkedListNode reverse(LinkedListNode l1){
		if(l1 == null){
			return null;
		}
		if(l1.next == null){
			return l1;
		}
		LinkedListNode second = l1.next;
		l1.next = null;
		LinkedListNode reversedNode = reverse(second);
		second.next = l1;
		return reversedNode;
	}
	//This is an iteraive solution which assumes you do not know the length of the linked list.
	public boolean checkPalindrome(LinkedListNode head){
		LinkedListNode slow = head;
		LinkedListNode fast = head;
		Stack<Integer> stack = new Stack<Integer>();

		while (fast.next != null && fast != null){
			stack.push(slow);
			fast = fast.next.next;
			slow = slow.next;
		}
		//Check if we have an odd # of elements.  If we do, we skip the middle element.
		if (fast != null){
			slow = slow.next;
		}

		while (slow.next != null){
			int top = stack.pop().intValue();

			if (top != slow.data){
				return false;
			}
			slow = slow.next;
		}
		return true;
	}
}
