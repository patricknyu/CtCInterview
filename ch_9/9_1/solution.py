def slow(n):
	if (n < 0):
		return 0
	elif(n==0):
		return 1
	else:
		return slow(n-1) + slow(n-2) + slow(n-3)


def faster(n,cache):
	if(n<0):
		return 0
	elif(n==0):
		return 1
	elif(cache[n]!=-1):
		return cache[n]
	else:
		cache[n] = faster(n-1,cache) + faster(n-2,cache) + faster(n-3,cache)
		return cache[n]

arr = [-1]*101
print "slow"
print slow(100)
print "fast"
print faster(100,arr)
