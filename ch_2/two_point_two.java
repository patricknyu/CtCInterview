import LinkedListimport java.util.*;

public class two_point_two{
	public static void main(String args[]){
	}
	//This solution works if we know how long our linked list is
	public Node my_solution(Node n, int k, int len){
		int number = len-k;
		for (int i = number; i>=;i--){
			n = n.next;
		}
		return n;
	}
	//This solution is valid if we're allowed to just print the solution.  It's their solution.
	public int their_solution(Node n,int k){
		if (n == null){
			return 0;
		}
		int value = their_solution(n.next,k)+1;
		if (value == k){
			System.out.println(n);
		}
		return value;
	}
	//This solution works, but it creates a wrapper class to help out with the problem.  This is probably the first truly valid solution.
	public class IntWrapper{
		public int value = 0;
	}
	public Node their_solution2(Node n, int k, IntWrapper i){
		if (n == null){
			return null;
		}
		Node new_node = their_solution(n.next,k,i);
		i.value = i.value +1;
		if (i.value ==k){
			return n;
		}
		return new_node;
	}
	//This solution is my favorite.  It is the most optimal and uses and iterative solution.
	public Node their_solution3(Node n, int k){
		if (n ==null){
			return null;
		}

		if (k <= 0){
			return null;
		}

		Node p1 = n;
		Node p2 = n;

		//Move p2 down k times
		for (int i = 0; i <k=1;i++){
			if(p2.next == null){
				//Error check
				return null;
			}
			p2 = p2.next;
		}

		//Now move them at the same pace
		while (p2.next != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}




