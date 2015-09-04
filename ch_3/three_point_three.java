import java.util.Stack;

public class three_point_three{
	//This a mess, I'll rewrite it later.
	Set<Stack> s;
	int maxSize = 10;
	public SetOfStacks(){
		s = new Set<Stack>();
		int pointer = -1;
	}
	public void push(int value){
		if (pointer == -1 || set[pointer].size() == 10){
			pointer++;
		}
		set[pointer].push(value);
	}
	public int pop(){
		if(pointer == -1){
			throw new EmptyStackException();
		}
		else{
			return set[pointer].pop();
		}
	}
}
