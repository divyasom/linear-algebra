/** 
 * Generic version of the Matrix class. 
 */ 
public class Matrix {

    private Integer[][] matrix; 

    /**
     * Instantiates a new matrix 
     *
     * @param rows the number of rows in the matrix 
     * @param cols the number of columns in the matrix 
     */
    public Matrix(int rows, int cols) {
        matrix = new Integer[rows][cols];
    } 
    
    /**
     * Instantiates a new matrix 
     *
     * @param matrix the matrix 
     */
    public Matrix(Integer[][] matrix) {
        this.matrix = matrix;
    }
     
    /** 
     * Returns the matrix 
     * @return the matrix 
     */ 
    public Integer[][] getMatrix() {
        return matrix;
    }

    /** 
     * Update the entry at row r and column c 
     *
     * @param r the row of the interest element 
     * @param c the column of the interest element
     * @param v the new value 
     */
    public void updateEntry(int r, int c, Integer v) {
        matrix[r][c] = v;
    }
}
