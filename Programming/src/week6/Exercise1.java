package week6;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise1 {

	public static void main(String[] args) {
		int [] a =new int []{1,2,3,4,5,6};
		a[5]=a[3];
		System.out.println(a[5]+" & "+a[3]);
		a[3]=9;
		System.out.println(a[5]+" & "+a[3]);
		//The first one doesn't change, because we are only assigning the value of the first one to the second one.
		a[5]=8;
		System.out.println(a[5]+" & "+a[3]);
		//Now the value of the first one changes.
	}

}
