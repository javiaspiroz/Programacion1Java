package lesson6.year16_17.third;
/**
 * An example of using the Date class, its constructors and methods.
 * @author Angel Garcia Olaya. PLG-UC3M
 * @since November 2016
 * @version 1.0
 *
 */
public class MainClassDate {

	public static void main(String[] args) {
		//Creating objects with the three constructors
		Date d1, d2, d3, d4;
		//Java knows which constructor are we invoking because all of them have different 
		//number/order/type of parameters
		d1 = new Date (2,11,2016);
		d2 = new Date ();
		d3 = new Date(2,11);
		d4 = new Date (4,"November",2016);
		/* Printing the dates to show their values are correct. We can use the toString method
		 * or use the get methods to create a String other than it.
		 */
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		//Here we decide we want the name of the month, not the number
		System.out.println(d4.getDay()+"/"+d4.getMonthName()+"/"+d4.getYear());
		//We can compare if two Dates are equal
		if (d1.equals(d3)) {
			System.out.println("Both dates are equal!");
		}
		else {
			System.out.println("Both dates are different!");
		}
	}

}
