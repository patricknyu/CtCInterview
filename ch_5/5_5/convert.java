public class convert
{
	public int conversion(int a, int b)
	{
		String strA = Integer.toBinaryString(a);
		String strB = Integer.toBinaryString(b);

		int lenA = strA.length();
		int lenB = strB.length();
		int count == 0;
		if(lenA <= lenB)
		{
			for (int i = 0; i < lenA;i++)
			{
				if(strA.charAt(i) != strB.charAt(i))
				{
					count++;
				}
			}
		}
		else
		{
			for (int i =0;i < lenB; i++)
			{
				if(strB.charAt(i) != strA.charAt(i))
				{
					count++;
				}
			}
		}
		return count;
	}
	public int bitSwapRequired(int a, int b)
	{
		int count = 0;
		for (int c = a^b;c!=0;c = c>>1)
		{
			count +=c&1;
		}
		return count;
	}

	public static int bitSwap2(int a, int b)
	{
		int count = 0;
		for(int c = a ^ b; c!=0;c= c&(c-1))
		{
			count++;
		}
		return count;
	}

	public static void main(String args[])
	{
	
	}
}
