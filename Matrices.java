import java.util.Set;

/**
 * An operator class for the Matrix class. 
 */ 
public class Matrices {

    /** 
     * Computes the matrix sum of two similarly-sized matrices A and B.  
     *
     * @param A an n by n matrix 
     * @param B an n by n matrix 
     * @return the n by n matrix sum of A and B 
     * @implSpec This method should run in O(n^2) time
     * @implSpec This method should use O(n^2) space
     */ 
    public static Matrix add(Matrix A, Matrix B) {
        Matrix sumMatrix = new Matrix(A.getMatrix().length, A.getMatrix().length);
        for (int r = 0; r < sumMatrix.getMatrix().length; r++) {
            for (int c = 0; c < sumMatrix.getMatrix().length; c++) {
                sumMatrix.updateEntry(r, c, A.getMatrix()[r][c] + B.getMatrix()[r][c]);
            }
        }
        return sumMatrix;
    }

    /** 
     * Computes the matrix difference of two similarly-sized matrices A and B. 
     *
     * @param A an n by n matrix 
     * @param B an n by n matrix 
     * @return the n by n matrix difference of A and B 
     * @implSpec This method should run in O(n^2) time
     * @implSpec This method should use O(n^2) space
     */ 
    public static Matrix subtract(Matrix A, Matrix B) {
        Matrix subtractMatrix = new Matrix(A.getMatrix().length, A.getMatrix().length);
        for (int r = 0; r < subtractMatrix.getMatrix().length; r++) {
            for (int c = 0; c < subtractMatrix.getMatrix().length; c++) {
                subtractMatrix.updateEntry(r, c, A.getMatrix()[r][c] - B.getMatrix()[r][c]);
            }
        }
        return subtractMatrix;
    }

    /** 
     * Computes the matrix product of two multiplicable matrices A and B.
     *
     * @param A an m by n matrix 
     * @param B an n by p matrix 
     * @return the m by p matrix product of A and B 
     * @implSpec This method should run in O(nmp) time
     * @implSpec This method should use O(n^2) space
     */
    public static Matrix multiply(Matrix A, Matrix B) {
        Matrix productMatrix = new Matrix(A.getMatrix().length, B.getMatrix()[0].length);
        for (int r = 0; r < A.getMatrix().length; r++) {
            for (int c = 0; c < B.getMatrix()[0].length; c++) {
                productMatrix.updateEntry(r, c, getDotProduct(A, B, r, c));
            }
        }
        return productMatrix;
    }
    
    public static Integer getDotProduct(Matrix A, Matrix B, int r, int c) {
        Integer[] column = new Integer[A.getMatrix()[r].length];
        int dotProduct = 0;
        for (int i = 0; i < B.getMatrix().length; i++) {
            column[i] = B.getMatrix()[i][c];
        }
        for (int i = 0; i < A.getMatrix()[r].length; i++) {
            dotProduct = dotProduct + A.getMatrix()[r][i]*column[i];
        }
        return dotProduct;
    }

    /** 
     * Computes the inverse, if it exists, of a matrix A.
     * 
     * @param A an n by n matrix 
     * @return the n by n matrix inverse of A
     * @implSpec This method should run in O(n^3) time
     * @implSpec This method should use O(1) space
     */ 
    public static Matrix inverse(Matrix A, Matrix B) {
        // TODO: Implement
        return null;
    }

    /** 
     * Computes the row-echelon form of a matrix A.
     * 
     * @param A an m by n matrix 
     * @return the m by n row-echelon form of A 
     * @implSpec This method should run in O(n^3) time
     * @implSpec This method should use O(1) space
     */ 
    public static Matrix rowEchelon(Matrix A) {
        // TODO: Implement
        return null;
    }

    /** 
     * Computes the reduced row-echelon form of a matrix A
     * 
     * @param A an m by n matrix 
     * @return the m by n reduced row-echelon form of A 
     * @implSpec This method should run in O(n^3) time
     * @implSpec This method should use O(1) space.
     */ 
    public static Matrix reducedRowEchelon(Matrix A) {
        // TODO: Implement
        return null;
    }

    /** 
     * Solves a linear system of equations by transforming the system's 
     * augmented matrix into reduced row-echelon form
     * 
     * @param A an m by n matrix 
     * @return the m-vector solution, if it exists, to the system 
     * @implSpec This method should run in O(n^3) time
     * @implSpec This method should use O(1) space.
     */ 
    public static Matrix gaussJordanElimination(Matrix A, Matrix B) {
        // TODO: Implement
        return null;
    }

    /**
     * Computes the eigenvalues of a matrix A
     * 
     * @param A an n by n matrix 
     * @return a set of eigenvalues 
     * @implSpec This method should run in O(n^3) time
     * @implSpec This method should use O(n) space.
     */
    public static Set<Integer> getEigenvalues(Matrix A) {
        // TODO: Implement 
        return null;
    }

    /** 
     * Computes the corresponding eigenvector for a specific eigenvalue of A 
     * 
     * @param A an n by n matrix 
     * @param v an eigenvalue of A 
     * @return the variable-defined eigenvector corresponding to v
     * @implSpec This method should run in O(n^3) time
     * @implSpec This method should use O(n) space. 
     */ 
    public static Matrix getEigenvector(Matrix A, Integer v) {
        // TODO: Implement 
        return null;
    } 
}
