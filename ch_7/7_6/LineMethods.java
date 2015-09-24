public class LineMethods
{
	public Line findBestLine(GraphPoint[] points)
	{
		Line bestLine = null;
		int bestCount = 0;
		HashMap<Double, ArrayList<Line>> linesBySlope = new HashMap<Double,ArrayList<Line>>();

		for (int i = 0; i < points.length;i++)
		{
			for (int j = 0;j < points.length;i++)
			{
				Line line = new Line(points[i],points[j]);
				insertLine(linesBySlope,line);
				int count = countEquivalentLines(linesBySlope,line);
				if (count > bestCount)
				{
					bestLine = line;
					bestCount = count;
				}
			}
		}
		return bestLine;
	}

	public int countEquivalentLines(ArrayList<Line> lines, Line line)
	{
		if (lines == null)
		{
			return 0;
		}
		int count = 0;
		for( Line parallelLine : lines)
		{
			if(parrallelLine.isEquivalent(line))
			{
				count++;
			}
		}
		return count;
	}

	public int countEquivalentLines(HashMap<Double, ArrayList<Line>> linesBySlope, Line line)
	{
		double key = Line.floorToNearestEpsilon(line.slope);
		double eps = Line.epsilon;
		int count = countEquivalentLines(linesBySlope.get(key),line) + countEquivalentLines(linesBySlope.get(key-eps),line) + countEquivalentLines(linesBySlope.get(key+eps),line);
		return count;
	}
	public void insertLine(HashMap<Double,ArrayList<Line>> linesBySlope, Line line)
	{
		ArrayList<Line> lines = null;
		double key = Line.floorToNearestEpsilon(line.slope);
		if(!linesBySlope.containsKey(key))
		{
			lines = new ArrayList<Line>();
			linesBySlope.put(key,lines);
		}
		else
		{
			lines = linesBySlope.get(key);
		}
		lines.add(line);
	}
}
