###Q:

Imagine a robot sitting on the upper left comer of an X by Y grid. The robot can only move in two directions: right and down. How many possible paths are there for the robot to go from (0, 0) to (X, Y) ?

FOLLOW UP

Imagine certain spots are "off limits," such that the robot cannot step on them. Design an algorithm to find a path for the robot from the top left to the bottom right.

###A:

So essential I first realized that since we can only go right and down we know that we will have to make X right and Y down moves.

What this means is that we will have to have a combination of those two amount of moves.

n choose r = n!/(r!(n-r)!)

We use the choose formula and choose either X right moves out of X+Y total moves or Y down moves out of X+Y total moves.

Either way, the solution ends up the same.

X+Y choose X = (X+Y)!/(X!Y!)

#####FOLLOWUP

So when we aren't allowed to get to use a certain point, it's important to realize that we'd have to go around it somehow.  Due to our movement limitations, going around this is a bit easier.

We can work this top down.

We want to get to the point (X,Y).  Due to our movement limitations, the only way we will ever get to (X,Y) is if right before that we are at either (X-1,Y) or (X,Y-1).

Next we think about how we could ever get to (X-1,Y).  Once again, due to movement limitations, we can only get to (X-1,Y) if we first get to (X-2,Y) or (X-1,Y-1).

Then we think about how we could ever get to (X,Y-1).   We can only get here if we first get to (X-1,Y-1) or (X,Y-2).

This is how we recurse to find a slow solution.  In my implementation, the isFree method will tell me if a spot is off limit.

```java
boolean getPath(int x, int y, ArrayList<Point> path)
{
	if(y<0 ||x<0||!isFree(x,y))
	{
		return false;
	}
	
	boolean isAtOrigin = (x==0) && (y==0);

	if(isAtOrigin ||getPath(x,y-1,path)||getPath(x-1,y,path))
	{
		Point p = new Point(x,y);
		path.add(p);
		return true;
	}
	return false;
}
```

This is obviously very slow.  It runs in O(2<sup>X+Y</sup>) time since we have X+Y steps and 2 choices per step.


