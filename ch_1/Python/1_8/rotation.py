import fileinput
import re

def rotation(s1,s2):
	if(len(s1)!=len(s2) or len(s1)==0):
		return False
	return True if (s2 in s1+s1) else False

if __name__ == "__main__":
	for line in fileinput.input():
		s = re.split('\s+', line)
		print(s[0])
		print(s[1])
		print(rotation(s[0],s[1]))
