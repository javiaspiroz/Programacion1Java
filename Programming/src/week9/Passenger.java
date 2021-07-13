package week9;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Passenger {
	public String name,surname, flight;
	public int id;
	// Now we create the constructor.
	public Passenger (String n, String s, String f, int i){
		name = n;
		surname = s;
		flight = f;
		if (i<0){
			id=-i;
		}
		else {
			id = i;
		}
	}
}