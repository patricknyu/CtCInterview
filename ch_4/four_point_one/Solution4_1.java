import CtCILibrary.AssortedMethods;
import CtCILibrary.TreeNode;

public class Solution4_1
{
	public boolean isBalancedMine(TreeNode n)
	{
		if (n == null)
		{
			return true;
		}
		else if(Math.abs(n.left.height()-n.right.height()) >1)
		{
			return false;
		}
		else
		{
			return isBalancedMine(n.left) && isBalancedMine(n.right);
		}
	}
	//This is there's its similar to mine.  They just have a helper.  I don't really think the helper is necessary
	public int getHeight(TreeNode n)
	{
		if (n == null)
		{
			return 0;
		}
		return Math.max(getHeight(n.left),getHeight(n.right))+1;
	}
	public boolean isBalancedSlow(TreeNode n)
	{
		if (n == null)
		{
			return true;
		}
		else
		{
		int heightDiff = getHeight(n.left)-getHeight(n.right);
		if(Math.abs(heightDiff) >1)
		{
			return false;
		}
			return isBalancedSlow(n.left) && isBalancedSlow(n.right);
		}
	}
	//This is their faster solution which I've tried to implement on my own.  It runs in O(n) time and O(h) space where h is the size of a tree.
	public int CheckHeight(TreeNode n)
	{
		if(n == null)
		{
			return 0;
		}
		int leftHeight = CheckHeight(n.left);
		int rightHeight = CheckHeight(n.right);
		if (leftHeight == -1 || rightHeight == -1)
		{
			return -1;
		}
		if(Math.abs(leftHeight-rightHeight)>1)
		{
			return -1;
		}
		else
		{
			return Math.max(leftHeight,rightHeight)+1;
		}
	}
	public boolean isBalancedFast(TreeNode n)
	{
		if (CheckHeight(n) == - 1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
