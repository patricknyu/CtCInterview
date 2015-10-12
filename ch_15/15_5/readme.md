###Q:
What is denormalization?  Explain the pros and cons.

###A:
JOIN operations are slow.  Denormalization helps with that.  It's essentially storing redundant data to use if we know we will have to query a lot using joins on something.

Denormailztion CONS:
- UPDATE and INSERT are more expensive
- UPDATE and INSERT are more complicated to write.
- Inconsistent data is possible.
- More storage

Denormalization PROS:
- We can review data faster using query.
- Less JOIN
- Queries are simpler and will probably have less bugs.
