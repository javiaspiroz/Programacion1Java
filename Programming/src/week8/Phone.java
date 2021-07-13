package week8;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Phone {
	public String brand;
	public String model;
	public int year;
	//1st object
	public Phone (String brand, String model, int year){
		this.brand=brand;
		this.model=model;
		if (year<=2016 && year>=1990){
			this.year=year;
		}
		else{
			this.year=2016;
		}
	}
}
