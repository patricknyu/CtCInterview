public class Line
{
	//The epsilon we choose
	public static double epsilon = .0001;
	public double slope, intercept;
	//Infinite slope boolean
	private boolean infinite_slope = false;

	public Line(Graphpoint p, Graphpoint q)
	{
		//This is if the slope is the same.
		if (Math.abs(p.x-q.x) > epsilon)
		{
			slope = (p.y-q.y)/(p.x-q.x);
			intercept = p.y - slope*p.x;
		}
		//if the slope is different
		else
		{
			infinite_slope = true;
			intercept = p.x;
		}
	}
	//Floor function
	public static double floorToNearestEpsilon(double d)
	{
		int r = (int) (d/epsilon);
		return ((double r) * epsilon;
	}
	//Equivalent
	public boolean isEquivalent(double a, double b)
	{
		return (Math.abs(a-b)<epsilon);
	}
	
	//Line equivalency --I don't think that's a word.
	public boolean isEquivalent(Object o)
	{
		Line l = (Line) o;
		if (isEquaivalent(l.slope,slope) && isEquivalent(l.intercept,intercept) && (infinite_slope == l.infinite_slope))
		{
			return true;
		}
		return false;
	}
}
