public class Kindle
{
	private int storage;
	private Library lib;
	private String username;
	private Book currentBook;

	public Kindle(String u, int s, Library l)
	{
		storage = s;
		username = u;
		lib = l;
	}

	public int getStorageSize()
	{
		return storage;
	}

	public String getUser()
	{
		return username;
	}

	public Book getCurrentBook()
	{
		return currentBook;
	}
	public void readBook(Book b)
	{
		if(currentBook != null)
		{
			System.out.println("You're already reading something else!  Finish that first!");
		}

		if (!lib.containsBook(b))
		{
			System.out.println("We don't have this book to read");
		}

		currentBook = b;
	}
	
	//There is probably a better way to implement this part.
	public void stopReading()
	{
		currentBook = null;
	}
}
	
