public class three_point_one{
	//There is a more complicated solution which involves involves a flexible size
	static int stackSize = 100;
	static int[] buffer = int[stackSize*3];
	static int[] stackPointer = {-1,-1,-1};

	public void push(int stackNum, int value) throws Exception{
		//We need to have space
		if (stackPointer[stackNum] +1 > stackSize){
			throw new FullStackException();
		}

		stackPointer[stackNum]++;
		buffer[absTopofStack(stackPointer)] = value;
	}
	public int absTopofStack(int stackNum){
		return stackPointer[stackNum] + stackSize*stackNum;
	}
	public int pop(int stackNum)throws Exception{
		if(isEmpty(stackNum)){
			throw new EmptyStackException();
		}
		//grab value to return
		int value = buffer[absTopofStack(stackNum)];
		buffer[absTopofStack(stackNum)] = 0;
		stackPointer[stackNum] --;
		return value;
	}
	public int peek(int stackNum){
		if(isEmpty(stackNum)){
			throw new EmptyStackException();
		}
	
		return buffer[absTopofStack(stackNum)];
	}
	public boolean isEmpty(int stackNum){
		return -1 == stackPointer[stackNum];
	}
}
