#8_1

##Q:
Design the data structures for a generic deck of cards.  Explain how you would subclass the data structures to implement blackjack.

##A:
Technically, generic could be any deck of cards, but let's assume the interviewer specifies the deck as a deck of playing cards.

Assuming no jokers, I would design it using a class for Cards which take in properties such as number and suit.  I would also have a class for the entire deck which contained a stack of 52 cards which ensured we had no duplicate cards somehow.

The books solution, cleverly, uses a enum for the Card class and a ArrayList to represent the cards in the Deck along with a generic class.  They also have a shuffle method.

I'm not going to recreate all the code since my code would mimic the solution nearly identically.
