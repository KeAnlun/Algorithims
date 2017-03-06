
public class main {
	
	//rotate 4byte units 90 degrees
	public static void Rotation(int[][] matrix){
		int length = matrix.length;
		
		for (int row = 0; row <=length/2; row++){
			for (int col = row; col<length-row-1; col++){
				int temp = matrix[row][col];
				int oprow = length-row-1;
				int opcol = length-col-1;
				matrix[row][col] = matrix[opcol][row];
				matrix[opcol][row] = matrix[oprow][opcol];
				matrix[oprow][opcol] = matrix[col][oprow];
				matrix[col][oprow] = temp;
			}
		}
	}
	
	
	public static void main(String[] args){
		int[][] matrix = 
			{{1,2,3,4},
			{5,6,7,8},
			{9, 10, 11, 12},
			{13, 14, 15, 16}};
		Rotation(matrix);
		for (int i=0; i<matrix.length; i++){
			for (int x=0; x< matrix.length; x++){
				System.out.print(" "+ matrix[i][x]);
			}
			System.out.print("\n");
		}
		
		int[][] matrix2 = 
			{{1, 2, 3, 4, 5},
			{6, 7, 8, 9, 10},
			{11, 12, 13, 14, 15},
			{16, 17, 18, 19, 20},
			{21, 22, 23, 24, 25}};
		Rotation(matrix2);
		for (int i=0; i<matrix2.length; i++){
			for (int x=0; x< matrix2.length; x++){
				System.out.print(" "+ matrix2[i][x]);
			}
			System.out.print("\n");
		}
	}
}
