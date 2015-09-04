import CtCILibrary.TreeNode;
public class Solution4_3
{
	//This is my solution it's not completely polished and will break, but it has the general idea.  The concept is the same as their's
	public TreeNode MakeBinaryTree(int[] arr)
	{
		int mid = arr.length/2;
		TreeNode root = new TreeNode(arr[mid]);
		int[] firstHalf;
		int[] secondHalf;
		if (arr.length %2 ==1)
		{
			firstHalf = new int[mid];
			secondHalf = new int[mid];
		}
		else{
			firstHalf = new int[mid-1];
			secondHalf = new int[mid];
		}
		System.arraycopy(arr, 0, firstHalf, 0, firstHalf.length);
		System.arraycopy(arr, firstHalf.length, secondHalf, 0, secondHalf.length);
		root.setLeftChild(MakeBinaryTree(firstHalf));
		root.setRightChild(MakeBinaryTree(secondHalf));
		return root;
	}
	//This is their solution.  It works well.
	public TreeNode createMinimalBST(int arr[], int start, int end)
	{
		if (end<start)
		{
			return null;
		}
		int mid = (start+end)/2;
		TreeNode n = new TreeNode(arr[mid]);
		n.left = createMinimalBST(arr,start,mid-1);
		n.right = createMinimalBST(arr,mid+1,end);
		return n;
	}
	public TreeNode createMinimalBST(int arr[])
	{
		return createMinimalBST(arr, 0,arr.length-1);
	}
}
