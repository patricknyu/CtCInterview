###Q:
Design and implement a hash table which uses chaining (linked lists) to handle collisions.

###A:

We need to realize that we will have an issue when we we have a bunch of collisions, we actually can't differentiate between them once we put them on our hash.

We need to create some sort of class that will allow us to differentiate.
