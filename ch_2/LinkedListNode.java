public class LinkedListNode{
	LinkedListNode next = null;
	int data;

	public LinkedListNode(int d){
		data = d;
	}

	public void appendToTail(int d){
		LinkedListNode end = new Node(d);
		LikedListNode n = this;
		while (n.next != null){
			n = n.next;
		}
		n.next = end;
	}
	public LinkedListNode deleteNode(LikedListNode head,int d){
		LinkedListNode n = head;

		if(n.data = d){
			return head.next;
		}
		
		while(n.next != null){
			if(n.next.data ==d){
				n.next = n.next.next;
				return head;
			}
		n = n.next;
		}
		return head;
	}
}

