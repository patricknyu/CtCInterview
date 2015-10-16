public class Game
{
	//This will be sized at 2
	private Player[] players;
	private static Game _instance;
	private Board board;
	//We create this as a singleton.  Also we assume 10x10
	private final int ROWS = 10;
	private final int COLUMNS = 10;

	private Game()
	{
		board = new Board(ROWS,COLUMNS);
		players = new Player[2];
		players[0] = new Player(Color.Black);
		players[1] = new Player(Color.White);
	}
	//Standard singleton stuff.
	public static Game getInstance()
	{
		if(_instance == null)
		{
			_instance = new Game();
		}
		return _instance;
	}
	public Board getBoard()
	{
		return board;
	}
}

