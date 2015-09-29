import java.util.Hashtable;

public class Library
{
	//Where we hold the books, book id will be the integer
	private Hashtable<Integer, Book> lib;

	//Adding books to our library
	public void addBook(Book b)
	{
		if(lib.containsKey(b.getID()))
		{
			System.out.println("We already have this book");
		}
		else
		{
			lib.put(b.getID(),b);
		}
	}

	//Getting rid of books from our library
	public void removeBook(Book b)
	{
		if(lib.containsKey(b.getID()))
		{
			lib.remove(b.getID());
		}
		else
		{
			System.out.println("We don't have this book.");
		}
	}
	
	//Grabbing books from our library.
	public Book get(Book b)
	{
		if(!lib.containsKey(b.getID()))
		{
			System.out.println("We don't have this book.");
		}
		else
		{
			return lib.get(b.getID());
		}
		return null;
	}
	public boolean containsBook(Book b)
	{
		return lib.containsKey(b.getID());
	}
}
