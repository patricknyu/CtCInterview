package two_point_five;

import CtCILibrary.LinkedListNode;

public class two_point_five{
	public static void main(String args[]){
		LinkedListNode lA1 = new LinkedListNode(9, null, null);
		LinkedListNode lA2 = new LinkedListNode(9, null, lA1);
		LinkedListNode lA3 = new LinkedListNode(9, null, lA2);
		
		LinkedListNode lB1 = new LinkedListNode(1, null, null);
		LinkedListNode lB2 = new LinkedListNode(0, null, lB1);
		LinkedListNode lB3 = new LinkedListNode(0, null, lB2);	
		
		LinkedListNode list3 = addLists(lA1, lB1, 0);
		
		System.out.println("  " + lA1.printForward());		
		System.out.println("+ " + lB1.printForward());			
		System.out.println("= " + list3.printForward());	
		
		int l1 = linkedListToInt(lA1);
		int l2 = linkedListToInt(lB1);
		int l3 = linkedListToInt(list3);
		
		System.out.print(l1 + " + " + l2 + " = " + l3 + "\n");
		System.out.print(l1 + " + " + l2 + " = " + (l1 + l2));	
	}
	public static LinkedListNode addLists(LinkedListNode L1, LinkedListNode L2, int carry){
		if (L1 == null && L2 == null && carry == 0){
			return null;
		}
		LinkedListNode result = new LinkedListNode();
		int value = carry;
		if (L1 !=null){
			value += L1.data;
		}
		if (L2 !=null){
			value +=L2.data;
		}
		result.data = value %10;
		if(L1 !=null || L2 !=null){
			LinkedListNode more = addLists(L1 == null ? null : L1.next, L2 == null ? null : L2.next, value>10? 1 : 0);
		}
		return result;
}
	public static int linkedListToInt(LinkedListNode node) {
		int value = 0;
		if (node.next != null) {
			value = 10 * linkedListToInt(node.next);
		}
		return value + node.data;
	}
}
