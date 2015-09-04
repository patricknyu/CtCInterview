public class two_point_three{
	public static void main(String ars[]){
	}
	//This is a confusing problem.  If I get something like this, I need to ask a lot of questions.  The solution is very simple.
	public boolean my_soltuion(Node n){
		if (n == null || n.next == null){
			return false;
			//This is a failure
		}
		Node next = n.next;
		n.data  = next.data;
		n.next = next.next;
		return true;
	}
}

