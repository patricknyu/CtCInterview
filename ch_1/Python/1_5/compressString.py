import fileinput
def checkCompression(charArr):
	original = len(charArr)-1
	new = 0
	currentChar = ''
	for i in charArr:
		if(i == '\n'):
			continue
		if(currentChar == ''):
			currentChar = i
			new = 2
		if(i != currentChar):
			currentChar = i
			new+=2
	return new
def compress(s):
	charArr = list(s)
	if(checkCompression(charArr)>= len(charArr)-1):
		return s
	currentChar = ''
	currentCount = 0
	answer = []
	for i in charArr:
		if(i == '\n'):
			answer.append(currentChar)
			answer.append(currentCount)
		if(currentChar == '' and currentCount == 0):
			currentChar = i
			currentCount = 1
		if(currentChar ==i):
			currentCount+=1
		elif(i !=currentChar):
			answer.append(currentChar)
			answer.append(currentCount)
			currentChar = i
			currentCount = 1
	if(len(answer) < len(charArr)-1):
		return ''.join(str(i) for i in answer)
	return s

# This is a bit slow since we don't check for it being short till the end.
# if this was Java we should be using a StringBuilder

	
if __name__ == "__main__":
	for line in fileinput.input():
		print(line)
		print(compress(line))
