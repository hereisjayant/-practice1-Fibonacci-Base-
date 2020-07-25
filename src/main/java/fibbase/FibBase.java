package fibbase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FibBase {

	private Map<Integer,Integer> ourMap = new HashMap<Integer,Integer>();
	/**
	 * 
	 * @param a
	 *            > 0
	 * @param b
	 *            >= a
	 * @return y(a) + y(a+1) + y(a+2) + ... + y(b-1) + y(b)
	 */
	public static long ySum(long a, long b) {
		// TODO: Implement this method using the definitions
		// for y(a) in the README document.
		return 0;
	}

/*	private void getTheSum(int in){

	}*/

/*	private void MapReturn(int a){

	}*/

	/**
	 * Gives you the max Fibonacci number for a given number
	 * @param a this is the input till whatever you want your fibonacci series
	 * @return an integer
	 */
	private int getMaxFib(int a){
		if(a==1 || a==0) return a;
		int i=1;
		int j=1;
		while (i<=a){
			int k = j;
			j=i;
			i=k+j;
		}
		return i;
	}

	/**
	 * gets a fibonacci series till the number n in a list with the
	 * lowest index corresponding to the least value in the series
	 * @param n the series will be less than equal to n
	 * @return an arraylist of the series
	 */
	private ArrayList<Integer> getFibTillN(int n){
		//gets the max of the Fibonacci seq.
		int max= getMaxFib(n);
		int j=1;
		ArrayList<Integer> out = new ArrayList<>();
		for(int i=1; i<=max;){
			out.add(i);
			int k=j;
			j = i;
			i= j+k;
		}
		return out;
	}

	/**
	 * Gets an arraylist of the number expressed in the base fibonacci
	 * @param n the number which we want to express in terms of fibonaci series
	 * @return a list with the lowest index corresponding to the least index of the sequence
	 */
/*	private ArrayList<Integer> getFibBase(int n){
		int number = n;
		ArrayList<Integer> fibNumbers = new ArrayList<>(getFibTillN(n));
		ArrayList<Integer> baseFib = new ArrayList<>();
		for(int i = fibNumbers.size()-1; i>=0 ; i--){
			if(fibNumbers.get(i)<=number){
				baseFib.add(i,1);
				number=number-fibNumbers.get(i);
			}
			else baseFib.add(i,0);
		}
	}*/



}
