import CtCILibrary.LinkedListNode;
public class Reverse
{
	public static void main(String args[])
	{
	}
	public LinkedListNode reverse(LinkedListNode a)
	{
		LinkedListNode head = a;
		LinkedListNode rest = reverse(a.next);
		rest.next = head;
		return rest;
	}
	public LinkedListNode reverse(LinkedListNode head)
	{
		LinkedListNode prev = null;
		LinkedListNode next;
		while(head!= null)
		{
			//cut off the rest
			next = head.next;
			//attach the current node to the previous stuff
			head.next = prev;
			//set the previous to be the current node plus the previous stuff
			prev = head;
			head = next;
		}
		return prev;
	}
}

		

