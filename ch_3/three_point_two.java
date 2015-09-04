import java.util.Stack;

public class three_point_two{
	Stack<Integer> s2;
	
	public StackWithMin2(){
		s2 = new Stack<Integer>();
	}

	public void push(){
		if(value <= min()){
			s2.push(value);
		}
		super.push(value);
	}

	public Integer pop(){
		int value = super.pop();
		if (value == min()){
			s2.pop();
		}
		return value;
	}
	public int min(){
		if (s2.isEmpty()){
			return Integer.MAX_VALUE;
		}
		else{
			return s2.peek();
		}
	}
}
