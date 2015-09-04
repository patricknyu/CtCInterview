import CtCILibrary.TreeNode;
import java.util.*;

public class Solution4_4
{
	//This is a DFS pre-order solution.
	public void createLevelLinkedList(TreeNode n, ArrayList<LinkedList<TreeNode>> lists, int level)
	{
		if (n == null)
		{
			return;
		}
		LinkedList<TreeNode> current = null;
		//If the level we are at is not in the list.
		if(lists.size() == level)
		{
			lists.add(current);
		}
		else
		{
			current = lists.get(level);
		}
		current.add(n);
		createLevelLinkedList(n.left,lists,level+1);
		createLevelLinkedList(n.right,lists,level+1);
	}
	public ArrayList<LinkedList<TreeNode>> createLeveLinkedList(TreeNode n)
	{
		ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
		createLevelLinkedList(n,lists,0);
		return lists;
	}
}

