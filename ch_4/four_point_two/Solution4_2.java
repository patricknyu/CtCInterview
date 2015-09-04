public Solution4_2
{
	public boolean isRoute(Graph g, Node start, Node end)
	{
		if(start == end)
		{
			retrun true;
		}
		else
		{
			start.visited = true;
			for (int i = 0;i < start.adjacent.length;i++)
			{
				isRoute(start.adjacent[i],end);
			}
		}
		return false;
	}
