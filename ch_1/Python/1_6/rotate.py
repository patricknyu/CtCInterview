def rotate(matrix):
	for layer in range(0,len(matrix)/2):
		first = layer
		last = len(matrix)-1-layer
		for i in range(first,last):
			offset = i - first
			top = matrix[first][i]
			matrix[first][i] = matrix[last-offset][first]
			matrix[last-offset][first] = matrix[last][last-offset]
			matrix[last][last-offset] = matrix[i][last]
			matrix[i][last] = top
	return matrix

a = [[1,2,3],[4,5,6],[7,8,9]]
print(rotate(a))
