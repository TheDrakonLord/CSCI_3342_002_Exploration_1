/**
 * 
 */
package exploration1;

/**
 * @author Neal Jamieson, James Gregory, Landdon Squiers
 * Class: CSCI_3342_002
 * Assignment: Exploration 1
 * 
 *
 */


public class Compare {
	private static int _iterativeCount = 0;
	private static int _recursiveCount = 0;
	
	public static int getIterativeCount() {
		return _iterativeCount;
	}
	
	public static void setIterativeCount(int a) {
		_iterativeCount = a;
	}
	
	public static int getRecursiveCount() {
		return _recursiveCount;
	}
	
	public static void setRecursiveCount(int a) {
		_recursiveCount = a;
	}
	
	public Compare() {
		
	}
	
	public static int Iterative(int n) {
		_iterativeCount = 0;
		int nMinus3 = -3;
		int nMinus2 = 3;
		int nMinus1 = 2;
		int currentN = 0;
		
		switch(n) {
			case 0:
				return nMinus3;
			case 1:
				return nMinus2;
			case 2:
				return nMinus1;
			default:
				for(int i = 3; i <= n; i++) {
					currentN = nMinus1 + 2 * nMinus2 - nMinus3 + 1;
					nMinus3 = nMinus2;
					nMinus2 = nMinus1;
					nMinus1 = currentN;
					_iterativeCount++;
				}
				return currentN;
		}
	}
	
	public static int Recursive(int n) {
		int nZero = -3;
		int nOne = 3;
		int nTwo = 2;
		int currentN = n;
		_recursiveCount++;

		switch(n) {
		case 0:
			return nZero;
		case 1:
			return nOne;
		case 2:
			return nTwo;
		default:
			currentN = Recursive(n-1) + 2 * Recursive(n-2) - Recursive(n-3) + 1;
			return currentN;
		}
	}
}
