/**
 * Group Members: Neal Jamieson, James Gregory, Landdon Squiers
 * Class: CSCI_3342_002
 * Assignment: Exploration 1 
 */
package exploration1;

/**
 * @author Neal Jamieson
 * 
 * This class creates the recursive and iterative methods for evaluating the algorithm given
 */
public class Compare {
	//Declare private counter variables
	private static int _iterativeCount = 0;
	private static int _recursiveCount = 0;
	
	/**
	 * 
	 * @return returns the number of times the iterative method has been run
	 */
	public static int getIterativeCount() {
		return _iterativeCount;
	}
	
	/**
	 * 
	 * @param a value to set the iterative counter variable to
	 */
	public static void setIterativeCount(int a) {
		_iterativeCount = a;
	}
	
	/**
	 * 
	 * @return returns the number of times the recursive method has been run
	 */
	public static int getRecursiveCount() {
		return _recursiveCount;
	}
	
	/**
	 * 
	 * @param a value to set the recursive counter variable to
	 */
	public static void setRecursiveCount(int a) {
		_recursiveCount = a;
	}
	
	/**
	 * evaluates the algorithm using an iterative method
	 * @param n the input size to evaluate the algorithm on
	 * @return returns the result from evaluating the algorithm
	 */
	public static int Iterative(int n) {
		//Declare initial facts
		_iterativeCount = 0;
		int nMinus3 = -3;
		int nMinus2 = 3;
		int nMinus1 = 2;
		int currentN = 0;
		
		//Check if n is one of the base cases
		switch(n) {
			case 0:
				_iterativeCount = 1;
				return nMinus3;
			case 1:
				_iterativeCount = 1;
				return nMinus2;
			case 2:
				_iterativeCount = 1;
				return nMinus1;
			default:
				//if n is not one of the base cases, iterate through using the formula
				for(int i = 3; i <= n; i++) {
					currentN = nMinus1 + 2 * nMinus2 - nMinus3 + 1;
					//move the stored values backwards
					nMinus3 = nMinus2;
					nMinus2 = nMinus1;
					nMinus1 = currentN;
					//increment the counter as the basic operation has occured
					_iterativeCount++;
				}
				//return the result
				return currentN;
		}
	}
	
	/**
	 * evaluates the algorithm using a recursive method
	 * @param n the input size to evaluate the algorithm on
	 * @return returns the result form evaluating the algorithm
	 */
	public static int Recursive(int n) {
		//declare the initial facts
		int nZero = -3;
		int nOne = 3;
		int nTwo = 2;
		int currentN = n;
		_recursiveCount++;
		
		//if n is one of the base cases return the base case
		switch(n) {
		case 0:
			return nZero;
		case 1:
			return nOne;
		case 2:
			return nTwo;
		default:
			//otherwise use the recursive formula
			currentN = Recursive(n-1) + 2 * Recursive(n-2) - Recursive(n-3) + 1;
			return currentN;
		}
	}
}
