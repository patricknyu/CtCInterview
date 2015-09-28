public class Song
{
	private int year;
	private String artist;
	private String lyrics;
	private int length;
	private String name;
	
	public Song(String n, String a, String lyr, int len, int y)
	{
		name = n;
		artist = a;
		lyrics = lyr;
		length = len;
		year = y;
	}

	public void play()
	{
		System.out.println("Now Playing " + name + " by " + artist + " from " + year + ".");
		System.out.println(lyrics);
	}
}
