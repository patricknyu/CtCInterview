#7_6

##Q:
Given a two-dimensional graph with points on it, find a line which passes the most number of points.

##A:

Apparently the best solution runs in O(n<sup>2</sup>) time.  What you need to do is to create a line segment from each of the n points to every other point.  Then you iterate through the points and find out the line that gives the most collisions using a hashtable. However, there is an issue here with the fact that floating points cannot be represented in binary.  That means we will have to use a epsilon to check equality.  We need a method to round our slope down to the nearest epsilon then compare the slope, slope + epsilon , and slope - epsilon.
