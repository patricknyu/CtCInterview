public class findMissingNumber
{
	public int findMissing(ArrayList<BitInteger> array)
	{
		return findMissing(array,0);
	}
	
	public int findMissing(ArrayList<BitInteger> input, int column)
	{
		if(column >=BitInteger.INTEGER_SIZE)
		{
			return 0;
		}
		ArrayList<BitInteger> oneBits = new ArrayList<BitInteger>(input.size()/2);
		ArrayList<BitInteger> zeroBits = new ArrayList<BitInteger>(input.size()/2);
		
		//Add the zeroBits and oneBits for the particular column.
		for (BitInteger t : input)
		{
			if(t.fetch(column) ==0)
			{
				zeroBits.add(t);
			}
			else
			{
				oneBits.add(t);
			}
		}

		//This means we are remove everything with a 1 bit here.
		//Then we recurse using only the bits we want.
		if (zeroBits.size() <= oneBits.size())
		{
			int v = findMising(zeroBits,column+1);
			return (v<<1)|0;
		}
		//We remove everything with a 0 bit here.
		else
		{
			int v = findMissing(oneBits,column+1);
			return (v << 1) | 1;
		}
	}
