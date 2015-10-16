public class Piece
{
	private Color color;
	public Piece(Color c)
	{
		color = c;
	}
	//Flip the color
	public void flip()
	{
		if(color == Color.White)
		{
			color = Color.Black;
		}
		else
		{
			color = Color.White;
		}
	}
	public Color getColor()
	{
		return color;
	}
}
