public class two_point_four{
	public static void main(String args[]){
	}
	//This code isn't stable (It doesn't keep the elements in order).
	public their_solution1(Node n, int x){
		Node head = n;
		Node tail = n;

		while(n != null){
			Node next = n.next;
			if (n.data < x){
				n.next = head;
				head = n;
			}
			else{
				tail.next = n;
				n = tail;
			}
			n = next;
		}

		tail.next = null;
		return head;
	}
	//This is the stable (and long) solution.
	public their_solution2(Node n, int x){
		Node beforeStart = null;
		Node beforeEnd = null;
		Node afterStart = null;
		Node afterEnd = null;

		while(n!= null){
			Node next = n.next;
			n.next = null;
			if(n.data < x){
				//Insert into end of before list
				if(beforeStart == null){
					beforeStart = n;
					beforeEnd = beforeStart;
				}
				else{
					beforeEnd.next = n;
					beforeEnd = n;
				}
			}
			else{
				//Insert node into end of after list
				if(afterStart == null){
					afterStart = n;
					afterEnd = afterStart;
				}
				else{
					afterEnd.next = n;
					afterend = n;
				}
			}
			node = next;
		}

		if(beforeStart ==null){
			return afterStart;
		}
		//Merge Lists
		beforeEnd.next = afterStart;
		return beforeStart;
	}


