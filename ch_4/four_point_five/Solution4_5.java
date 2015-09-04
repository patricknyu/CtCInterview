import CtCILibrary.TreeNode;

public class Solution4_5
{
	public static int index = 0;
	//This is an in-order DFS search.  It assumes that we do not have identical data values for different nodes.	
	public static void BTtoArray(TreeNode n, int[] arr)
	{
		if(n == null)
		{
			return;
		}
		BTtoArray(n.left,arr);
		arr[index] = n.data;
		index++;
		BTtoArray(n.right,arr);
	}
	public static boolean BSTCheck(TreeNode n)
	{
		int[] arr = new int[n.size()];
		BTtoArray(n,arr);
		for (int i = 0;i <n.size()-1;i++)
		{
			if(arr[i] > arr[i+1])
			{
				return false;
			}
		}
		return true;
	}

	//Different solution not using the array, but same algorithm type.
	public static Integer last = null;
	public static boolean BSTCheck2(TreeNode n)
	{
		if(n == null)
		{
			return true;
		}
		if(!BSTCheck2(n.left))
		{
			return false;
		}
		if(last != null && n.data <= last)
		{
			return false;
		}
		last = n.data;
		if(!BSTCheck2(n.right))
		{
			return false;
		}
		return true;
	}
	//This is the min-max solution implemented by me
	public boolean BSTCheck3(TreeNode n)
	{
		return BSTCheck3(n,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	public boolean BSTCheck3(TreeNode n, int min, int max)
	{
		if (n == null)
		{
			return true;
		}
		if (n.data <= min|| n.data >= max)
		{
			return false;
		}
		if(!BSTCheck3(n.left,min, n.data)||!BSTCheck3(n.right,n.data,max))
		{
			return false;
		}
		return true;
	}
}
