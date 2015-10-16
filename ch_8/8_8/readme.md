###Q:
Othello is played as follows: Each Othello piece is white on one side and black on the other. When a piece is surrounded by its opponents on both the left and right sides, or both the top and bottom, it is said to be captured and its color is flipped. On your turn, you must capture at least one of your opponent's pieces. The game ends when either user has no more valid moves. The win is assigned to the person with the most pieces. Implement the object-oriented design for Othello.

###A:
Well initially, this makes me think about the objects we will need.  We need some sort of board object.  I probably want to store that as a 2d array just for simplicity.  We will also need a piece object which has an attribute which allows for white and black pieces.  Players will probably also be necessary.

Some thoughts taken from the solutions:
- You might think to make a Piece object and then BlackPiece and WhitePiece which will inherit properties from Piece, but this is inadvisable since we will flip colors frequently.

- You may want to split up Game and Board, or you can keep it together.  I would keep it separate.

- Keeping score has different options.  I would probably do it in Board.

- It would help if Game was singleton class.  However, this is an assumption.
