import java.util.Stack;

public class StackWeight
{
	public Stack<Integer> s1,s2;

	public StackWeight()
	{
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
	}

	public void push(int i)
	{
		if(s1.peek() < i)
		{
			s1.push(i);
		}

		else
		{
			while(s1.peek() > i)
			{
				s2.push(s1.pop());
			}
			s1.push(i);
		}
	}
	
	public int pop()
	{
		return s1.pop();
	}

	public int peek()
	{
		return s1.peek();
	}
}


