#6_5

##Q:
There is a building of 100 floors. If an egg drops from the Nth floor or above, it will break. If it's dropped from any floor below, it will not break. You're given two eggs. Find N, while minimizing the number of drops for the worst case.

##A:
We want to minimize drops in the worst case so we want to make sure that the number of drops that egg 1 takes + the number of drops that egg 2 takes will be the same.  Hence when egg 1 is needed to be dropped one more time, egg 2 has to be dropped one less time. Our strategy is to drop egg 1 at a rate starting low and ending high, and then dropping egg2 from our last known success until failure.  We need to find the rate at which egg 1 is dropped.  We know that we need to decrease egg 2 drops with every egg 1 drop so if we start at floor X, then the next drop for egg 1 should go up by X-1 floors and so on.  So X + (X-1) + (X-2) + ... + 1 = 100, or X(X+1)/2 = 100, so that means that X = 14.  Our first drop is at floor 14, then our next drop is at 27 and so on.
