import CtCILibrary.TreeNode;

public class Solution4_8
//I'm struggling to implement this, but the general idea is to perform PreOrder and InOrder traversals using 0's for the null values.  You can turn the data into a string and figure out whats up.
{
	/*public StringBuilder PreOrder(TreeNode n)
	{
		int maxNumNodes = Math.pow(2,n.height+1)-1;
		s = new StringBuilder(maxNumNodes);
		return PreOrder(n,s);
	}

	public String PreOrder(TreeNode n)
	{
		int maxNumNodes = Math.pow(2,n.height+1)-1;
		StringBuilder s = new StringBuilder(maxNumNodes);
		return PreOrder(n,s);
	}
	public String PreOrder(TreeNode n)
	{
		if(n == null)
		{
			this.s.append(0);
		}
		else
		{
			this.s.append(n.data);
		}
		if (n == null)
		{
			this.s.append(0);
		}
		else
		{
			return PreOrder(n.left);
		}
		if(n == null)
		{
			this.s.append(0);
		}
		else
		{
			return PreOrder(n.right);
		}
		return this.s.toString();
	}*/
	public void visit(TreeNode n)
	{
		if(n != null)
		{
			s.append(n.data);
		}
	}
	public TreeNode PreOrder(TreeNode n)
	{
		visit(n.data);
		PreOrder(n.left);
		PreOrder(n.right);
	}
	public TreeNode InOrder(TreeNode n)
	{
		InOrder(n.left);
		visit(n);
		InOrder(n.right);
	}
	public static void main(String args[])
	{
		Solution4_8 inst = new Solution4_8();
		TreeNode t1 = new TreeNode(3);
		t1.left = new TreeNode(3);
		TreeNode t2 = new TreeNode(3);
		t2.right = new TreeNode(3);
		System.out.println(inst.PreOrder(t1));
	}
}

