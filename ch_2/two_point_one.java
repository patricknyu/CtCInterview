import java.util.*;

public class two_point_one{
	public static void main(String args[]){

	}
	//This first solution is pretty nice. It utilizes a hashset which is good.  It takes O(n) time.
	public void my_solution(LinkedListNode n){
		Hashset set = new Hashset<Integer>();
		LinkedListNode previous = null;
		while(n != null){
			if(set.contains(n.data)){
				previous.next = n.next;
			}
			else{
				set.add(n.data);
				previous = n;
			}
			n = n.next;

		}
	}
	//This solution is good as well.  It utilizes the runner strategy for dealing with linkedlists.  It takes O(1) time but O(n^2) space.
	public void my_solution_2(LinkedListNode head){
		if(head == null){
			return;
		}

		LinkedListNode current = head;
		while(current != null){
			LinkedListNode runner = current;
			while(runner.next != null){
				if(runner.next.data ==current.data){
					runner.next = runner.next.next;
				}
				else{
					runner = runner.next;}
			}
			current = current.next;
		}
	}
}
