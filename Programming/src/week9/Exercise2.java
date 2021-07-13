package week9;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Exercise2 {

	public static void main(String[] args) {
		//Here we create two islands
        Island1 i1 = new Island1 ("Ibiza", "Spain",15.18F, 90.87F, true);
        Island1 i2 = new Island1 ("Napoli", "Italy",56.98F,89.76F, true);

        //The airplane
        Plane a1 = new Plane ("123456", "Moon Air", i1, i2, 3, 0);

        //And finally the three passengers
        Passenger p1 = new Passenger ("Pepe", "Brett", a1.id, 64610275);
        Passenger p2 = new Passenger ("Andy", "Landwolf", a1.id, 47189241);
        Passenger p3 = new Passenger ("Matt", "Furie", a1.id, 57180572);

        //Printing the info for each object just to check it works
        System.out.println("Island: "+i1.name+" "+i1.cX+" "+i1.cY+" "+i1.country+" Habitable: "+i1.living);
        System.out.println("Island: "+i2.name+" "+i2.cX+" "+i2.cY+" "+i2.country+" Habitable: "+i2.living);
        System.out.println("Airplane: "+a1.id+" "+a1.company+" "+i1.name+" - "+i2.name+" "+a1.seats+" "+a1.status);
        System.out.println("Passenger: "+p1.name+" "+p1.surname+" Flight: "+p1.flight+" ID: "+p1.id);
        System.out.println("Passenger: "+p2.name+" "+p2.surname+" Flight: "+p2.flight+" ID: "+p2.id);
        System.out.println("Passenger: "+p3.name+" "+p3.surname+" Flight: "+p3.flight+" ID: "+p3.id);
	}
}
