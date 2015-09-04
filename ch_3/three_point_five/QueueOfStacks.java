import java.util.Stack;

public class QueueOfStacks
{
	public Stack<Integer> stackNew, stackOld;

	public QueueOfStacks()
	{
		stackNew = new Stack<Integer>();
		stackOld = new Stack<Integer>();
	}

	public void push(int i)
	{
		stackNew.push(i);
	}

	public int size()
	{
		return stackNew.size() + stackOld.size();
	}

	public void shift()
	{
		if(stackOld.isEmpty())
		{
			while(!stackNew.isEmpty())
			{
				stackOld.push(stackNew.pop());
			}
		}
	}

	public int peek()
	{
		shift();
		return stackOld.peek();
	}

	public int pop()
	{
		shift();
		return stackOld.pop();
	}
}

