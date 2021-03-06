#Chapter 7
##Mathematics and Probability
This is just stuff from the chapter intro that I felt the need to rewrite.
###Prime Numbers
* All positive integers can be decomposed into a product of primes.
* Prime number law states that in order for a number x to divide a number y, all primes in x's prime factorization must be in y's factorization.
* When x = 2<sup>j0</sup> * 3<sup>j1</sup> * 5<sup>j2</sup> * ... and x = 2<sup>k0</sup> * 3<sup>k1</sup> * 5<sup>k2</sup> * ...
* gcd(x,y) = 2<sup>min(j0,k0)</sup> * 3<sup>min(j1,k1)</sup> *... and lcd(x,y) is the same thing with maxes.
* if we did gcd * lcd we would get 2<sup>min(j0,k0)</sup> * 2<sup>max(j0,k0)</sup> * ... and eventually get gcd*lcd = xy

###Checking for Primality
```java
boolean primeNaive(int n)
{
	if (n<2)
	{
		return false;
	}
	for (int i = 2;i<n;i++)
	{
		if (n % i == 0)
		{
			return false;
		}
	}
	return true;
}
```
Here's a slightly better solution.
```java
boolean primeSlightlyBetter(int n)
{
	if (n<2)
	{
		return false;
	}
	int sqrt = (int) Math.sqrt(n);
	for (int i = 2; i <= sqrt;i++)
	{
		if (n % i == 0)
		{
			return false;
		}
	}
	return true;
}
```

We can see that this solution is faster because it only needs to go up to the square root.  The square root works becuase it's the 1/2 way point, we don't have to do the pairs twice.

###The Sieve of Eratosthenes

Starts with a list of numbers up to max.  Then iterates through all the prime numbers and crosses out numbers divisible by the primes.

Here is the implementation they gave.

```java
boolean[] sieveOfEratosthenes(int max)
{
	boolean[] flags = new boolean[max+1];
	int count = 0;
	
	//Set the flags other than 0 and 1 to true
	init(flags);
	int prime = 2;

	while (prime <= Math.sqrt(max))
	{
		crossOff(flags,prime);

		prime = getNextPrime(flags,prime);

		if( prime >= flags.length)
		{
			break;
		}
	}
}

void crossOff(boolean[] flags, int prime)
{
	for (int i = prime*prime;i<flags.length;i+=prime)
	{
		flags[i] = false;
	}
}

int getNextPrime(boolean[] flags, int prime)
{
	int next = prime+1;
	while (next <flags.length&&!flags[next])
	{
		next++;
	}
	return next;
}
```

This can be easily optimized.

###Probability
Just some formulas

- P(A & B) = P(B|A)*P(A)
- P(A or B) = P(A) + P(B) - P(A & B)
- If A and B are independent P(A & B) = P(A)*P(B)
- If A and B are mutually exclusive (if one happens, the other cannot happen: P(A or B) = P(A) + P(B), P(A & B) = 0

###Things to watch out for

- Precision with floats and doubles
- Don't assume things are integers
- Do not assume independence


