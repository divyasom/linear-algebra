/** 
 * Generic version of the Matrix class. 
 * @param <T> the type of value stored in the Matrix 
 */ 
public class Matrix<T> {

	private T[][] matrix; 

	/**
	 * Instantiates a new matrix 
	 *
	 * @param rows the number of rows in the matrix 
	 * @param cols the number of columns in the matrix 
	 */
	public Matrix(int rows, int cols) {
		matrix = (T[][]) new Object[rows][cols];
	} 

	/** 
	 * Update the entry at row r and column c 
	 *
	 * @param r the row of the interest element 
	 * @param c the column of the interest element
	 * @param v the new value 
	 */
	public void updateEntry(int r, int c, T v) {
		matrix[r][c] = v;
	}
}