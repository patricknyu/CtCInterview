import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class JukeBox
{
	//We assume that songs are built in and cannot be changed.

	private Song[] songs;  /*Songs go here*/
	public List<Song> playlist = new ArrayList<Song>();
	
	//Adds to list if it is not in songs.  This might have been better used as a hashset.
	public boolean AddToPlaylist(Song s)
	{
		if (!Arrays.asList(songs).contains(s))
		{
			return false;
		}
		else
		{
			playlist.add(s);
		}
		return true;
	}
	//Plays a certain # of songs
	public void play(int i)
	{
		//If there aren't enough songs in the playlist
		if (i >playlist.size())
		{
			System.out.println("TOO LONG");
		}
		while (i > 0)
		{
			playlist.get(0).play();
			playlist.remove(0);
		}
	}
}



