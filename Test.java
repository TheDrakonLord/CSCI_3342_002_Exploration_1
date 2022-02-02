/**
 * Group Members: Neal Jamieson, James Gregory, Landdon Squiers
 * Class: CSCI_3342_002
 * Assignment: Exploration 1 
 */
package exploration1;

/**
 * @author Neal Jamieson
 * 
 * This class takes the algorithms create in the Compare class and analyzes them based on given input sizes. The results are reported to the console including the number of times the basic
 * operation occurred and the amount of time it took for the algorithm to complete.
 */
public class Test {

	/**
	 * evaluates the given algorithms for specified input sizes
	 * @param args command line arguments passed in at execution
	 */
	public static void main(String[] args) {
		//Check n=2 [result should be 2]
		checkIterative(2);
		checkRecursive(2);
		
		//check n=10
		checkIterative(10);
		checkRecursive(10);
		
	}
	
	/**
	 * runs the iterative algorithm and reports the number of times the basic operation occurred and how long it took for the algorithm to complete. Resets the counter variable when finished.
	 * @param n the input size on which to evaluate the algorithm
	 */
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
		
		//Display results and reset the counter
		System.out.println(String.format("Iterative(%d) ran %d times and took %d nanoseconds to complete. The Result was %d", n, Compare.getIterativeCount(), time, result));
		Compare.setIterativeCount(0);
	}
	
	/**
	 * runs the recursive algorithm and reports the number of times the basic operation occurred and how long it took for the algorithm to complete. Resets the counter variable when finished.
	 * @param n the input size on which to evaluate the algorithm
	 */
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
		
		//Display the results and reset the counter
		System.out.println(String.format("Recursive(%d) ran %d times and took %d nanoseconds to complete. The Result was %d", n, Compare.getRecursiveCount(), time, result));
		Compare.setRecursiveCount(0);
	}

}
