Explain what the following code does: ((n & (n-1)) == 0).in what the following code does: ((n & (n-1)) == 0).

So what we have to realize is that when (A & B) == 0, we know that there is nothing in common between A and B.

When we look at n and (n-1), we know that n-1 will move the least significant bit to 0 and all the bits less than it will be changed from 0 to 1.

Hence n must be a be of the form that there is only one bit at 1, hence n must be a power of 2.
