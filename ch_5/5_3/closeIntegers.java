public class closeIntegers
{
	//this is an ugly brute force solution
	public int oneCount(int n)
	{
		String binary = Integer.toBinaryString(n);
		int count = binary.length() - binary.replace("1","").length();
		return count;
	}

	public int bigger(int n)
	{
		int firstOneCount = oneCount(n);
		int secondWordCount = -1;
		while(firstOneCount != secondWordCount)
		{
			n++;
			secondWordCount = oneCount(n);
		}
		return n;
	}

	public int smaller(int n)
	{
		int firstOneCount = oneCount(n);
		int secondWordCount = -1;
		while(firstOneCount != secondWordCount)
		{
			n--;
			secondWordCount = oneCount(n);
		}
		return n;	
	}
	//This is there solution.  It's pretty cool

	//We know that if we flip a zero to a one, we must flip a one to a zero and vice versa.

	//We know that the number will only be bigger if and only if we flip the zero to one bit is to the left of the one to zero bit.

	//We want to make the number bigger, but minimally so.  We flip the first zero to one where there are ones to the left of this zero

	public int bigger2(int n)
	{
		int c = n;
		int c0 = 0;
		int c1 = 0;

		//count number of 0s before our flip
		while(((c&1)==0) && (c!=0))
		{
			c0++;
			c >>=1;
		}
		
		//count number of 1s before our flip
		while((c&1)==1)
		{
			c1++;
			c >>= 1;
		}
		//Check if we are maxed
		if(c0 + c1 == 31 || c0 + c1 == 0)
		{
			return -1;
		}

		//This finds the position of our flip from 0 to 1	
		int p = c0+c1;
		
		//Flip the 0 to 1
		int mask = 1 <<p;
		n  = n | mask;
		//Clear all the bits to the right of p
		int a = 1 << p;
		int b = a-1;
		mask = ~b;
		n = n & mask;
		//Add back in the (c1-1) ones on the right.
		a = 1 <<(c1-1);
		b = a-1;
		n = n | b;

		return n;
	}
	public int smaller2(int n)
	{
		int temp = n;
		int c0 = 0;
		int c1 = 0;
		//We want to flip a 1 to 0 at the rightmost non-trailing position.
		//Then we clear the bits to the right of p and insert c1+1 ones immediately to the right of p.
		//That way we are able to shrink our number without making it too small.
		while(temp&1 ==1)
		{
			c1++;
			temp >> 1;
		}

		if(temp == 0)
		{
			return -1;
		}

		while(((temp &1) ==0) && (temp != 0))
		{
			c0++;
			temp >>=1;
		}
		
		int p = c0 + c1;
		int mask = (~0) << (p+1);
		n = n & mask;

		mask = ((1 <<(c1+1)) - 1)<<(c0-1);
		n = n | mask;
		return n;
	}
	public int biggerArith(int n)
	{
		int temp = n;
		int c0 = 0;
		int c1 = 0;

		while((temp & 1) ==0 && (temp != 0))
		{
			c0++;
			temp >>=1;
		}
		while((temp & 1) ==1)
		{
			c1++;
			temp>>1;
		}
		//This will set the trailing 0s behind p to 1s.  Then we will have p trailing 1s.  Then it will flip the first p 1s to 0s and put a 1 at bit p.
		//Then it will set trailing c1-1 zeros to 1s.
		return n + (1<<c0) + (1 << (c1-1)) -1;
	}
	public int smallerArith(int n)
	{
		int temp = n;
		int c1 = 0;
		int c0 = 0;
		while(temp & 1 == 1)
		{
			c1++;
			temp >>1;
		}
		if(temp ==0)
		{
			return -1;
		}
		while(((temp & 1)==0) && (temp != 0))
		{
			c0++;
			temp >>=1;
		}
		return n - (1<<c1) - (1<< (c0-1)) +1;
	}
	
	public static void main(String args[])
	{
		System.out.println(Integer.toBinaryString(5));
		closeIntegers inst = new closeIntegers();
		System.out.println(inst.oneCount(5));
		System.out.println(inst.bigger(5));
		System.out.println(Integer.toBinaryString(inst.bigger(5)));
		System.out.println(inst.smaller(5));
		System.out.println(Integer.toBinaryString(inst.smaller(5)));
	}
}
