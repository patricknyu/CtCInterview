//We need to find the next node when in a in-order tree traversal.

//When we do in-roder traversal, it goes traverse left, data on current, then traverse right.
import CtCILibrary.TreeNode;

public class Solution4_6
{
	public TreeNode nextInOrder(TreeNode n)
	{
		if (n == null)
		{
			return null;
		}
		while (n.left != null)
		{
			n = n.left;
		}
		return n;
	}
	public TreeNode whatsNext(TreeNode n)
	{
		if (n.right != null)
		{
			return nextInOrder(n.right);
		}
		else if (n.parent != null)
		{
			if(n.parent.left == n)
			{
				return n.parent;
			}
		}
		return n.parent.parent; 
	}
	public TreeNode betterInOrderSucc(TreeNode n)
	{
		if (n == null)
		{
			return null;
		}
		if(n.right != null)
		{
			return nextInOrder(n.right);
		}
		else
		{
			TreeNode q = n;
			TreeNode x = q.parent;
			while (x != null && x.left !=q)
			{
				q = x;
				x = x.parent;
			}
			return x;
		}
	}
}
