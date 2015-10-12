###Q:
What are the different types of joins?  Please explain how they differ and why certain types are better in certain situations.

###A:
There is the INNER JOIN which is great when we are planning on matching data.

There is the OUTER JOIN which is great when we need to JOIN two tables and retain information that does not overlap.

There are a couple type of outer joins.  There is the LEFT OUTER JOIN, which contains all the records from the left table, matches what it can, and makes all the rest of the unmatched values set to null.  The RIGHT OUTER JOIN is similar.

There is also the FULL OUTER JOIN, which is basically a combination of the two.
