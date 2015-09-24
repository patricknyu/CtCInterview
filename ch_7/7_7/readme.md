#7_7

##Q:
Design an algorithm to find the kth number such that the only prime factors are 3, 5, and 7.

##A:
This is a pretty difficult problem, especially if you're going for the optimal solution.

###Solution 1
Brute force.  We can multiply each number in a list of k-1 numbers by 3, 5, and 7 until we find the smallest number that is not already in the k-1 list.

###Solution 2
Each time we add a number to our list, we keep in mind 3, 5, and 7 multiplied by that number into a temporary list.

See getKthMagicNumber.java

###Solution 3
This is the most optimal.  It involves three queues which took the numbers previously used multiplied by 3,5, and 7 respectively and not using duplicates.  We do this till we get our k numbers.

See getKthMagicNumberFast.java
