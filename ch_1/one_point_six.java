public class one_point_six{
	public static void main(String args[]){

	}
	//I think my solution would be correct if I was using python.  I'm not.  It's wrong here.
	/*public void my_solution(int[][] matrix, int n){
		for (int i = n;i>=2;i--){

			//Temporary variable for the old top
			old_top = matrix[0][:];

			//left to top
			matrix[0][:] = matrix[:][0];

			//bot to left
			matrix[:][0] = matrix[i][:];

			//right to left
			matrix[i][:] = matrix[:][i];

			//top to right
			matrix[i][n] = old_top;
		}
	}*/
	public void their_solution(int[][] matrix, int n){
		for (int layer = 0;layer <n/2;++layer){
			int first = layer;
			int last = n-1-layer;
			for (int i = first;i<last;++i){
				int offset = i-first;

				//save top
				int top = matrix[first][i];

				//left -> top
				matrix[first][i] = matrix[last-offset][first];

				//bot -> left
				matrix[last-offset][first] = matrix[last][last-offset];

				//right -> bot
				matrix[last][last-offset] = matrix[i][last];

				//top -> right
				matrix[i][last] = top;
			}
		}
	}
}
