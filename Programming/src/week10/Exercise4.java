package week10;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Exercise4 {

	public static void main(String[] args) {
		Island firstIsland = new Island("Rome", -17.00, 23.00, "Italy", true);
		Island secondIsland = new Island("Chicago", 26.99, -62.91, "USA", true);
		
		Airplane plane = new Airplane(568, firstIsland, secondIsland, 3, "on-time", "Iberia");
		
		People passenger1 = new People("Luis", "Casado", 4862497, plane.get_flightID());
		People passenger2 = new People("Gabriel", "Hurtado", 5792348, plane.get_flightID());
		People passenger3 = new People("Elisa", "Garrido", 3678945, plane.get_flightID());
		
		
		People[] passengers = new People [3];
		passengers[0] = passenger1;
		passengers[1] = passenger2;
		passengers[2] = passenger3;
		
		plane.set_passenger(passengers);

	}

}
