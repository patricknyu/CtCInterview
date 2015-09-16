#Chapter 7
##Mathematics and Probability

###Prime Numbers
* All positive integers can be decomposed into a product of primes.
* Prime number law states that in order for a number x to divide a number y, all primes in x's prime factorization must be in y's factorization.
* When x = 2<sup>j0</sup> * 3<sup>j1</sup> * 5<sup>j2</sup> * ... and x = 2<sup>k0</sup> * 3<sup>k1</sup> * 5<sup>k2</sup> * ...
* gcd(x,y) = 2<sup>min(j0,k0)</sup> * 3<sup>min(j1,k1)</sup> *... and lcd(x,y) is the same thing with maxes.
* if we did gcd * lcd we would get 2<sup>min(j0,k0)</sup> * 2<sup>max(j0,k0)</sup> * ... and eventually get gcd*lcd = xy

###Checking for Primality
'''
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
'''
