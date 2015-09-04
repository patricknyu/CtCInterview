import java.util.Stack;
public class Tower
{
	public Stack<Integer> disks;
	public int ind;

	public Tower(int i)
	{
		disks = new Stack<Integer>();
		ind = i;
	}
	//Index is just a way for us to number our poles/towers	
	public int index()
	{
		return ind;
	}
	//Adds a disk to current tower if we can add it there.
	public void add(int d)
	{
		if (!disks.isEmpty() && disks.peek() < d)
		{
			System.out.println("You can't add that");
		}

		else
		{
			disks.push(d);
		}
	}
	//Moves the top of the current tower to the inputed destination tower.
	public void moveTop(Tower t)
	{
		int topDisk = disks.pop();
		t.add(topDisk);
		System.out.println("Move disk " + topDisk + " from " + index() + " to " + t.index());
	}
	
	//Moves n disks from the current tower to the destination tower.  The Buffer is the tower that is not changed at the end of this action.
	public void moveDisks(int n, Tower destination, Tower buffer)
	{
		if (n > 0){
			//Move all but there bottom to the buffer
			moveDisks(n-1,buffer,destination);
			//Moves the bottom to the destinaiton
			moveTop(destination);
			//Moves all the disks that are currently on the buffer to the destination
			buffer.moveDisks(n-1,destination,this);
		}
	}
}

