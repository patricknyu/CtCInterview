import fileinput
import re

def permutation(s1,s2):
	if(len(s1)!=len(s2)):
		return False
	s1charArr = list(s1)
	s2charArr = list(s2)
	s1charCount = [0 for i in range(0,26)]
	s2charCount = [0 for i in range(0,26)]
	
	for i in range(0,len(s1)):
		if(s1[i] != '\n'):
			s1charCount[ord(s1[i])-97]+=1
		if(s2[i] != '\n'):
			s2charCount[ord(s2[i])-97]+=1
	for i in range(0,26):
		if(s1charCount[i] !=s2charCount[i]):
			return False
	return True

if __name__ == "__main__":
	for line in fileinput.input():
		s = re.split('\s+', line)
		print(s[0])
		print(s[1])
		print(permutation(s[0],s[1]))
