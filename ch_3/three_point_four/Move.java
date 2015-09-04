public class Move
{
	public static void main(String args[])
	{
		// # of towers
		int n = 3;
		Tower[] towers = new Tower[n];
		
		//Put towers in the tower array
		for (int i = 0;i < n;i++)
		{
			towers[i] = new Tower(i);
		}

		//add some disks into the first tower;
		while (n > 0)
		{
			n--;
			towers[n].add(n);
		}
		//Moves disks from the left most tower to the right most tower
		towers[0].moveDisks(n,towers[2],towers[1]);
	}
}
