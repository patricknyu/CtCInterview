public class OddEven
{
	public int swap(int n)
	{
	//The idea is to get a = n & 10101010...10 to get all the odd bits then shift it the right by 1, so >> 1
	//Then we get b = n & 010101..01 to get all the even bits and shift it to the left by 1, so << 1.
		return ((n & 0xaaaaaaaa)>>1|(n & 0x55555555)<<1);
	}
	public static void main(String args[])
	{
		OddEven inst = new OddEven();
		System.out.println(inst.swap(6));
		System.out.println(inst.swap(10));
	}
}
