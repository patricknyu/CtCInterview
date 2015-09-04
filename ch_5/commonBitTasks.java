public class CommonBitTasks
{
	public boolean getBit(int num,int i)
	{
		//shifts 1 over i times to get something like 00100.  Then takes the and of it with num so we get only that value.  Then we compare it to zero.
		return (num & (1<<i) != 0);
	}
	public int setBit(int num, int i)
	{
		//shift 1 over i times to get 00100  or similar.  Then or it with num to not mess with the others.
		return num | (1 <<i);
	}
	public int ClearBit(int num, int i)
	{
		// creates a mask that shifts 1 over i times then negates it to get something like 11011.  Then you and it with num to keep the rest the same.
		int mask = ~(1 <<i);
		return num & mask;
	}

	public int clearBitsMSBthorughI(int num, int i)
	{
		//creates a mask starting by shifting 1 over i times to get something like 00100.  Then you subtract it by 1 to get 00011.  Then you and it with num.
		int mask = (1<<i)-1;
		return num & mask;
	}
	public int clearBitsIthrough0(int num, int i)
	{
		//creates a mask by starting creating a whole line of 1s, or -1, then we shift it over by (31-i) bits.  When we use the >>> operator, we keep the initial shift.
		//Then we negate it.  -1 = 11111 -> 000011111 -> 111100000.
		int mask = ~(-1 >>> (31-i));
		return num & mask;
	}
	public int updateBit(int num, int i, int v)
	{
		//use previously written clearBit to clear the spot at i in num.
		//create a mask that is the value "v" shifted i times.  And it with num.
		num = ClearBit(num, i);
		int mask = v << i;
		return num & mask;
	}
}

