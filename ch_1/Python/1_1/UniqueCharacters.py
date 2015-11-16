import fileinput

def unique(s):
	charArr = list(s)
	charIdx = [0]*26
	#print(charArr)
	for i in charArr:
		if(i=='\n'):
			continue
		if(charIdx[ord(i)-97] == 1):
			return False
		else:
			charIdx[ord(i)-97]+=1
	return True

if __name__ == "__main__":
	for line in fileinput.input():
		print(line)
		print(unique(str(line)))
