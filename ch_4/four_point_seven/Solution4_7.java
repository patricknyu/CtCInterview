import CtCILibrary.TreeNode;

public class Solution4_7
{
	public boolean isDescendant(TreeNode root, TreeNode p)
	{
		if (root == null)
		{
			return false; 
		}
		if (root == p)
		{
			return true;
		}
		return isDescendant(root.left,p) || isDescendant(root.right,p);
	}
	public TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q)
	{
		if(root == null)
		{
			return null;
		}
		if(!isDescendant(root,p) || !isDescendant(root,q))
		{
			return null;
		}
		if(root == p || root == q)
		{
			return root;
		}

		boolean POnLeft = isDescendant(root.left,p);
		boolean QOnLeft = isDescendant(root.left,q);
		
		//This means they are opposite sides of the tree.
		if(POnLeft != QOnLeft)
		{
			return root;
		}

		//If we don't hit that that means they are on the same side.
		if (POnLeft)
		{
			return commonAncestor(root.left,p,q);
		}
		return commonAncestor(root.right,p,q);
	}
}
