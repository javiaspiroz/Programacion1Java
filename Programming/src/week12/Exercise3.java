package week12;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Exercise3 {

	public static void main(String[] args) {
		long n=5;
		n=factorial(n);
		System.out.println(n);
	}
	public static long factorial (long n){
		if (n==0||n==1){
			return 1;
		}
		return n*factorial(n-1);
	}
}
/*
*First time the method is invoked, the value of 5 is assigned to n, then the value of n is revalued and factorial is again invoked.
* As its value is not 1 or 0, next line is executed. In the next line, n has been decreased by 1 as said in the last part of the method.
* The same is done that is was with 5 and it is also decreased till it reaches 1. When n=1, the value obtained is 1.
* Once executed the method we receive our final value. 
*/