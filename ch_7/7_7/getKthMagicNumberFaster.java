public class getKthMagicNumberFaster
{
	public static int getKthMagicNumberFaster(int k)
	{
		if (k < 0) return 0;

		int val = 0;
		// Three queues for each set of multiples
		Queue<Integer> q3 = new LinkedList<Integer>();
		Queue<Integer> q5 = new LinkedList<Integer>();
		Queue<Integer> q7 = new LinkedList<Integer>();
		// Start with 3^0 * 5^0 * 7^0
		queue3.add(1);
		
		//Iterate through to find
		for(int i = 0; i < k;i++)
		{
			//Each queue's respective min
			int v3 = q3.size() > 0 ? q3.peek() : Integer.MAX_VALUE;
			int v5 = q5.size() > 0 ? q5.peek() : Integer.MAX_VALUE;
			int v7 = q7.size() > 0 ? q7.peek() : Integer.MAX_VALUE;
			
			//Overall min
			val = Math.min(v3,Math.min(v5,v7));
			if(val == v3)
			{
				q3.remove();
				q3.add(3*val);
				q5.add(5*val);
				q7.add(7*val);
			}
			else if (val == v5)
			{
				q5.remove();
				q5.add(5*val);
				q7.add(7*val);
			}
			else if(val == v7)
			{
				q7.remove();
				q7.add(7*val);
			}
		}
		return val;
	}
}
