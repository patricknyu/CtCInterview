//I got lazy and just looked at the solution.  Bad Patrick.
public class one_point_seven{
	public static void main(String args[]){

	}
	public void their_solution(int[][] matrix){
		boolean[] row = new boolean[matrix.length];
		boolean[] col = new boolean[matrix[0].length];

		//Time to find the 0's
		for(int i = 0;i < matrix.length;i++){
			for (int j = 0;j < matrix[0].length;j++){
				if (matrix[i][j]==0){
					row[i] = true;
					col[j] = true;
				}
			}
		}

		for (int i =0;i<row.length;i++){
			if(row[i]){
				nullifyRow(matrix,i);
			}
		}

		for (int i =0;i<col.length;i++){
			if(col[i]){
				nullifyCol(matrix,i);
			}
		}
	}
	public void nullifyRow(int[][] matrix,int row){
		for(int i = 0;i <matrix.length;i++){
			matrix[row][i] = 0;
		}
	}

	public void nullifyCol(int[][] matrix,int col){
		for(int i = 0;i <matrix[0].length;i++){
			matrix[i][col] = 0;
		}
	}
}
