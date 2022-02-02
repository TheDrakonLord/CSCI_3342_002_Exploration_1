/**
 * 
 */
package exploration1;

/**
 * @author nealc
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
		
		return n;
		
	}
	
	public static int Recursive(int n) {
		return n;
	}
}
