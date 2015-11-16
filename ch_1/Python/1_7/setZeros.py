def setCol(matrix,col):
	numRows = len(matrix)
	numCols = len(matrix[0])
	for i in range(0,numRows):
		matrix[col][i] = 0
	return matrix
def setRows(matrix,row):
	numRows = len(matrix)
	numCols = len(matrix[0])
	for i in range(0,numCols):
		matrix[i][row] = 0
	return matrix
def setZeros(matrix):
	RowZeros = [False for i in range(0,len(matrix))]
	ColZeros = [False for i in range(0,len(matrix[0]))]
	for i in range(0,len(matrix)):
		for j in range(0,len(matrix[0])):
			if(matrix[i][j] == 0):
				RowZeros[i] = True
				ColZeros[i] = True
	for i in range(0,len(RowZeros)):
		if(RowZeros[i]):
			matrix = setCol(matrix,i)
	for i in range(0,len(ColZeros)):
		if(ColZeros[i]):
			matrix = setRows(matrix,i)
	return matrix

a = [[1,2,3],[4,0,6],[7,8,9]]
print(setZeros(a))
