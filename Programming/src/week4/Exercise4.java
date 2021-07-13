package week4;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since September 2016
 * @version 1.0
 *
 */


public class Exercise4 {

	public static void main(String[] args) {
		int a=5, b=3, c=20, d=20;
		c-=++a/b-3+a%b;
		d-=++a/(b+3-4*a)%b;
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		/*
		 * Analyzing the second sentence:
		 *  First of all we add 1 to 'a' and it keeps modified in all the process. 
		 *   6/3 = 2
		 *   6%3 = 0
		 *   So...= 20-(2-3+0)= 21.
		 */
		/*
		 * Analyzing the third sentence:
		 * First of all we add one again to 'a', so: a = 7.
		 * (b+3-4*a)= 34
		 * And then: 7/34%5= 0, because the order begins with 7/34andasthey are integer numbers the result is 0.
		 */

	}

}
