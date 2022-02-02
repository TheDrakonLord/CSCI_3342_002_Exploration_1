/**
 * 
 */
package exploration1;

/**
 * @author Neal Jamieson, James Gregory, Landdon Squiers
 * Class: CSCI_3342_002
 * Assignment: Exploration 1
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		checkIterative(2);
		checkRecursive(2);
		
		checkIterative(10);
		checkRecursive(10);
		
	}
	
	private static void checkIterative(int n) {
		int result = 0;
		
		//System nanoTimer nanosecond resolution
		long startTime = 0;
		long stopTime = 0;
		long overTime = 0;
		//nano second -- clock resolution
		startTime = System.nanoTime();
		stopTime = System.nanoTime();
		overTime = stopTime - startTime;
		
		//Start timer for execution timing
		startTime = System.nanoTime();
		
		//Execute algorithm to be tested
		result = Compare.Iterative(n);
		
		stopTime = System.nanoTime();
		long time = stopTime-startTime-overTime;		
		System.out.println(String.format("Iterative(%d) ran %d times and took %d nanoseconds to complete. The Result was %d", n, Compare.getIterativeCount(), time, result));
		Compare.setIterativeCount(0);
	}
	
	private static void checkRecursive(int n) {
		int result = 0;
		
		//System nanoTimer nanosecond resolution
		long startTime = 0;
		long stopTime = 0;
		long overTime = 0;
		//nano second -- clock resolution
		startTime = System.nanoTime();
		stopTime = System.nanoTime();
		overTime = stopTime - startTime;
		
		//Start timer for execution timing
		startTime = System.nanoTime();
		
		//Execute algorithm to be tested
		result = Compare.Recursive(n);
		
		stopTime = System.nanoTime();
		long time = stopTime-startTime-overTime;
		System.out.println(String.format("Iterative(%d) ran %d times and took %d nanoseconds to complete. The Result was %d", n, Compare.getRecursiveCount(), time, result));
		Compare.setRecursiveCount(0);
	}

}
