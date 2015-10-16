public class Board
{
	private int blackCount = 0;
	private int whiteCount = 0;
	//2d array to represent the pieces
	private Piece[][] board;

	public Board(int rows, int columns)
	{
		board = new Piece[rows][columns];
	}

	public void initialize()
	{
		int middleR = board.length/2;
		int middleC = board[middleR].length/2;
		board[middleR][middleC] = new Piece(Color.White);
		board[middleRow+1][middleC] = new Piece(Color.Black);
		board[middleRow+1][middleC+1] = new Piece(Color.White);
		board[middleRow][middleC+1] = new Piece(Color.White);
		blackCount = 2;
		whiteCount = 2;
	}

	public boolean placeColor(int row, int column, Color c)
	{
		if (board[row][column] != null)
		{
			return false;
		}
		else
		{
			//For directions to flip
			int[] results = new int[4];
			results[0] = flipSection(row-1,column,color,Direction.up);
			results[1] = flipSection(row+1,column,color,Direction.down);
			results[2] = flipSection(row,column+1,color,Direction.right);
			results[3] = flipSection(row,column-1,color,Direction.left);
			
			int flipped = 0;
			for (int i = 0; i< 4;i++)
			{
				if (results[i] > 0)
				{
					flipped +=results[i];
				}
			}

			if(flipped <=0)
			{
				return false;
			}

			piece[row][column] = new Piece(c);
			updateScore(c, flipped+1);
		}
			return true;
	}
	public int flipSection(int row, int column, Color color, Direction d)
	{
		int r=0;
		int c=0;
		switch(d)
		{
		case up:
			r = -1;
			break;
		case down:
			r = 1;
			break;
		case left:
			c = -1;
			break;
		case right:
			c = 1;
			break;
		}
		if(row < 0|| column < 0 || row > board.length|| column > board[row].length || board[row][column] == null)
		{
			return -1;
		}

		if(board[row][column].getColor() == color)
		{
			return 0;
		}
		int flipped = flipSection(row+r,colum + c, color, d)
		if(flipped <0)
		{
			return -1;
		}
		board[row][column].flip();
		return flipped +1;
	}
	public int getScoreForColor(Color c)
	{
		if(c == Color.Black)
		{
			return blackCount;
		}
		return whiteCount;
	}
	public void updateScore(Color c, int news)
	{
		if(c == Color.Black)
		{
			whiteCount -= (news-1);
			blackCount += news;
		}
		else
		{
			whitecount +=news;
			blackCount -=(news-1);
		}
	}
	public void printBoard()
	{
		for(int row =0; row< board.length;row++)
		{
			for (int column = 0; column < board[row].length;i++)
			{
				if(board[row][column] == null)
				{
					System.out.print("_");
				}
				else if(board[row][column] == Color.Black)
				{
					System.out.print("B");
				}
				else if (board[row][column] == Color.White)
				{
					System.out.print("W");
				}
			}
			System.out.println();
		}
	}
}
			




