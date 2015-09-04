public class bitUpdater
{
	//We want to insert m into n inbetween position i and j
	public int updateBits(int m, int n, int i, int j)
	{
		int allOnes = ~0;
		
		//Shift allOnes correctly so that we are able to create something like 1110000...0000
		int left = allOnes << (j+1);

		//Shift to get the right side
		int right = ((1<<i)-1);

		//Combine to get the mask.
		int mask = left | right;

		//Clear n
		int nClear = mask & n;
		//Shift m so its in the right spot
		int mShift = m << i;
		
		//Put mShift into nClear
		return nClear | mShift;
	}
	public static void main(String args[])
	{
		int n = 1024;
		int m = 19;
		int i = 2;
		int j = 6;
		bitUpdater inst = new bitUpdater();
		System.out.println(Integer.toBinaryString(inst.updateBits(m,n,i,j)));
	}
}

