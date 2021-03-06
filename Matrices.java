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
	public static <T> Matrix<T> add(Matrix<T> A, Matrix<T> B) {
		// TODO: Implement 
		return null;
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
	public static <T> Matrix<T> subtract(Matrix<T> A, Matrix<T> B) {
		// TODO: Implement 
		return null;
	}

	/** 
	 * Computes the matrix product of two multiplicable matrices A and B.
	 *
	 * @param A an m by n matrix 
	 * @param B an n by p matrix 
	 * @return the m by p matrix product of A and B 
	 * @implSpec This method should run in O(n^3) time
	 * @implSpec This method should use O(n^2) space
	 */
	public static <T> Matrix<T> multiply(Matrix<T> A, Matrix<T> B) {
		// TODO: Implement 
		return null;
	}

	/** 
	 * Computes the inverse, if it exists, of a matrix A.
	 * 
	 * @param A an n by n matrix 
	 * @return the n by n matrix inverse of A
	 * @implSpec This method should run in O(n^3) time
	 * @implSpec This method should use O(1) space
	 */ 
	public static <T> Matrix<T> inverse(Matrix<T> A, Matrix<T> B) {
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
	public static <T> Matrix<T> rowEchelon(Matrix<T> A) {
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
	public static <T> Matrix<T> reducedRowEchelon(Matrix<T> A) {
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
	public static <T> Matrix<T> gaussJordanElimination(Matrix<T> A, Matrix<T> b) {
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
	public static <T> Set<T> getEigenvalues(Matrix<T> A) {
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
	public static <T> Matrix<T> getEigenvector(Matrix<T> A, T v) {
		// TODO: Implement 
		return null;
	} 
}