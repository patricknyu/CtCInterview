import java.util.ArrayList;
public class Directory extends Entry
{
	protected ArrayList<Entry> contents;

	public Directory(String n, Directory p)
	{
		super(n,p);
		contents = new ArrayList<Entry>();
	}

	public int size()
	{
		//Must do this since directories can contain directories.
		int size = 0;
		for (Entry e: contents)
		{
			size +=e.size();
		}
		return size;
	}
	public int numberOfFiles()
	{
		int count = 0;
		for (Entry e : contents)
		{
			if (e instanceof Directory)
			{
				count++;
				Directory d = (Directory) e;
				count+=d.numberOfFiles();
			}
			else if(e instanceof File)
			{
				count++;
			}
		}
		return count;
	}
	public boolean deleteEntry(Entry e)
	{
		return contents.remove(e);
	}
	public void addEntry(Entry e)
	{
		contents.add(e);
	}
	protected ArrayList<Entry> getContents()
	{
		return contents;
	}
}

