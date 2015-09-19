#7_2
##Q:
There are three ants on different vertices of a triangle. What is the probability of collision (between any two or all of them) if they start walking on the sides of the triangle? Assume that each ant randomly picks a direction,with either direction being equally likely to be chosen,and that they walk at the same speed.

Similarly, find the probability of collision with n ants on an n-vertex polygon.

##A:
The only ways that there will be no collision among the ants will be when all the ants go in the same direction.  That can happen if they all choose right or if they all choose left.

The probability they all choose right is 1/8.  The probability they all choose left is 1/8.  That means the probability that there is collision is 1/4.

P(collision) = 1 - P(no collision) = 1 - 1/4 = 3/4

If we want to expand this to a n ants on a n-vertex polygon, we can see that the same truth holds.  In this case, however there is a (1/2)<sup>n</sup> probability that they all choose left and a (1/2)<sup>n</sup> probability they all choose right.

Hence the probability of no collision will be 2 * (1/2)<sup>n</sup>.  P(collision) = 1-2*(1/2)<sup>n</sup>.
