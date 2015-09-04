import java.lang.*;

public class doubleToBinary
{
	public String convert(double m)
	{
		StringBuilder ans = new StringBuilder();
		ans.append(".");
		if(m > 1 | m < 0)
		{
			System.out.println("ERROR");
			return ans.toString();
		}
		while(m >0.0)
		{
			m = m * 2;
			if (ans.length()>32)
			{
				System.out.print("ERROR");
				return "";
			}
			if(m >= 1)
			{
				ans.append("1");
				m--;
			}
			else
			{
				ans.append("0");
			}
		}
		return ans.toString();
	}
	public static void main(String args[])
	{
		doubleToBinary inst = new doubleToBinary();
		System.out.println(inst.convert(.625));
		System.out.println(inst.convert(.72));
	}
}
		
