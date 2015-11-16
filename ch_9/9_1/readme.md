### Q:

A child is running up a staircase with n steps, and can hop either 1 step, 2 steps, or 3 steps at a time.  Implement a method to count how many possible ways the child can run up the stairs.

### A:
If n == 1, there is 1 way. 1

If n == 2, there are 2 ways.  2 ; 1,1

If n == 3, there are 4 ways.  3 ; 2,1 ; 1,2 ; 1,1,1

If n == 4, there are 7 ways.  3,1 ; 1,3 ; 2,2 ; 2,1,1 ; 1,1,2 ; 1,2,1 ; 1,1,1,1;

If n == 5, there are 13 ways.  3,2 ; 2,3 ; 3,1,1 ; 1,3,1 ; 1,1,3 ; 2,2,1 ; 1,2,2 ; 2,1,2 ; 2,1,1,1 ; 1,2,1,1 ; 1,1,2,1 ; 1,1,1,2 ; 1,1,1,1;

In reality what we should be doing is a top down recursion.  We realize that once we hit the nth step, we had to either take a 3, 2, or 1 step before that one.  So we recurse and add up the n-3, n-2, and n-1 steps.

Obviously this is slow.  It's necessary to cache it.
