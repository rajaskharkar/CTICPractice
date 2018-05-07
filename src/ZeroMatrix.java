
public class ZeroMatrix {
	
	public void setZeros(int[][] matrix){
		boolean[] row= new boolean[matrix.length];
		boolean[] column=new boolean[matrix[0].length];
		//Store the row and column index with value zero
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					row[i]=true;
					column[i]=true;
				}
			}
		}
		
		//Nullify rows
		for(int i=0;i<row.length;i++){
			if(row[i])
				nullifyRow(matrix, i);
		}
		//Nullify columns
		for(int j=0;j<matrix[0].length;j++){
			if(column[j])
				nullifyColumn(matrix, j);
		}
	}

	private void nullifyColumn(int[][] matrix, int col) {
		for(int i=0;i<matrix.length;i++)
			matrix[i][col]=0;
	}

	private void nullifyRow(int[][] matrix, int row) {
		for(int j=0;j<matrix[0].length;j++)
			matrix[row][j]=0;
	}
	
	//check first row and first column for zeros, set hasZero values
	//iterate through and set column, set first row/column element to zero if there are zero in that row/column
	//iterate and nullify entire rows/columns
	//nullify the first row/column if necessary
	
	public void setZeros_two(int[][] matrix){
		boolean rowHasZero=false;
		boolean colHasZero=false;
		//check if first row has a zero
		for(int j=0;j<matrix[0].length;j++){
			if(matrix[0][j]==0){
				rowHasZero=true;
				break;
			}
		}
		//check if first column has a zero
		for(int i=0;i<matrix.length;i++){
			if(matrix[i][0]==0){
				colHasZero=true;
				break;
			}
		}
		//check for zeros in the rest of the array
		for(int i=1;i<matrix.length;i++){
			for(int j=1;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					matrix[i][0]=0;
					matrix[0][j]=0;
				}
			}
		}
		//nullify rows based on values in the first column
		for(int i=1;i<matrix.length;i++){
			if(matrix[i][0]==0){
				nullifyRow(matrix, i);
			}
		}
		//nullify columns based on values in the first column
		for(int j=1;j<matrix[0].length;j++){
			if(matrix[0][j]==0)
				nullifyColumn(matrix,  j);
		}
		//nullify first row
		if(rowHasZero)
			nullifyRow(matrix, 0);
		//nullify first column
		if(colHasZero)
			nullifyColumn(matrix, 0);
	}
}
