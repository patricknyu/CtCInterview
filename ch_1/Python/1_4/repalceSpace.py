import fileinput
def replaceSpace(s):
	charArr = list(s)
	charArrAns = []
	for i in charArr:
		if(ord(i)==32):
			charArrAns.append('%20')
		elif(i != '\n'):
			charArrAns.append(i)
	return ''.join(charArrAns)

# Python makes this a bit too easy.  I'll try to rewrite it so it's more java like

def replaceSpace2(s,length):
	charArr = list(s)
	emptySpaces = 0
	for i in charArr:
		if(ord(i)==32):
			emptySpaces+=1
	answerArr = ['' for i in range(0,length+emptySpaces*3)]
	j =0
	for i in charArr:
		if(ord(i)==32):
			answerArr[j] = '%'
			answerArr[j+1] = '2'
			answerArr[j+2] = '0'
			j+=3
		elif(i !='\n'):
			answerArr[j] = i
			j+=1
	return ''.join(answerArr)
if __name__ == "__main__":
	for line in fileinput.input():
		print(line)
		print(replaceSpace(line))
		print(replaceSpace2(line,len(str(line))-1))
