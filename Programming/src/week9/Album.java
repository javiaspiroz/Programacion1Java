package week9;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Album {
	public String albumName;
	public int albumYear;
	public Song songName;
	public float price;
	public Band bandName;
	public Album(float price){
		if(price<0){
			this.price=0.0F;
		}
		else{
			this.price=price;
		}
	}
}
