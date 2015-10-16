public class File extends Entry
{
	private String content;
	private int size;

	public File(String n,Directory p, int s)
	{
		super(n,p);
		size = s;
	}

	public int size()
	{
		return size;
	}
	public String getContent()
	{
		return content;
	}
	public void setContents(String c)
	{
		content = c;
	}
}
