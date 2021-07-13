package lesson6.year16_17.first;

/**
 * An example of using the Date class, its constructors and get/set methods
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
		d3 = new Date(3,11);
		d4 = new Date (4,"November",2016);
		/* Printing the days to show their values are correct
		 * Now we need to use the get methods to access to them
		 * For the month we can use the getMonth or the getMonthName, depending on what we need
		 */
		System.out.println(d1.getDay()+"/"+d1.getMonth()+"/"+d1.getYear());
		System.out.println(d2.getDay()+"/"+d2.getMonth()+"/"+d2.getYear());
		System.out.println(d3.getDay()+"/"+d3.getMonth()+"/"+d3.getYear());
		System.out.println(d4.getDay()+"/"+d4.getMonthName()+"/"+d4.getYear());
		//If we want to change the value of any field we need to use the set methods
		d1.setDay(31);
		//No change as the provided value is not correct
		System.out.println(d1.getDay()+"/"+d1.getMonth()+"/"+d1.getYear());
		//Invoking the method that changes both the day and month
		d4.setDayAndMonth(4, 12);
		System.out.println(d4.getDay()+"/"+d4.getMonth()+"/"+d4.getYear());
	}

}
