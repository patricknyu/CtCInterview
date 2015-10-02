public class Edge
{
	public enum Type
	{
		inner, outer, flat
	}
	Piece parent;
	Type type;
	int index;
	Edge attached_to;

	public boolean fitsWidth(Edge edge)
	{
		return false;
	}
}
