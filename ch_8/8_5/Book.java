public class Book
{
	private int id;
	private String Author;
	private String Title;
	private String text;

	public Book(int i, String a, String ti, String te)
	{
		id = i;
		Author = a;
		Title = ti;
		text = te;
	}

	public int getID()
	{
		return id;
	}
	public void setID(int i)
	{
		id = i;
	}
	public String getAuthor()
	{
		return Author;
	}
	public void setAuthor(String a)
	{
		Author = a;
	}
	public String getTitle()
	{
		return Title;
	}
	public void setTitle(String ti)
	{
		Title = ti;
	}
	public String getText()
	{
		return text;
	}
	public void setText(String te)
	{
		text = te;
	}
}
