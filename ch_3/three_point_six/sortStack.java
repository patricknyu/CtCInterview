import java.util.Stack;

public class sortStack
{
	public Stack<Integer> sort(Stack<Integer> stack)
	{
		Stack<Integer> buffer = new Stack<Integer>();
		
		while(!stack.isEmpty())
		{
			int temp = stack.pop();
			while (buffer.peek()> temp && !buffer.isEmpty())
			{
				stack.push(buffer.pop());
			}

			buffer.push(temp);
		}
		return buffer;
	}
}
