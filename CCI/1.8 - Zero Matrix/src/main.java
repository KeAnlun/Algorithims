
public class main {
	public static void zero(int matrix[][]){
		Boolean firstRow = false;
		Boolean firstCol = false;
		for (int i=0; i<matrix.length || (firstRow&&firstCol); i++){
			if(matrix[0][i] == 0){
				firstRow = true;
			}
			if(matrix[i][0] == 0){
				firstRow = true;
			}
		}
		for (int row = 1; row < matrix.length; row++){
			for (int col = 1; col < matrix.length; col++){
				if(matrix[row][col] == 0){
					matrix[row][0] = 0;
					matrix[0][col] = 0;
				}
			}
		}
		
		for (int i=0; i<matrix.length; i++){
			if(matrix[i][0] == 0){
								
			}
			if(matrix[0][i] == 0){
				
			}
		}
	}
}
