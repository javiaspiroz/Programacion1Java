package week9;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Plane {
	public String id;
    public Island1 origin, destination;
    public int seats;
    public byte status;
    //Being status = 0 (on-time), 1 (delayed) or 2 (cancelled)
    public String company;

    public Plane (String i, String c, Island1 o, Island1 d, int s, int st) {
        id = i;
        company = c;
        origin = o;
        destination = d;

        if (st > 2 || st < 0) {
            status = 0; 
        }
        else {
            status = (byte) st;
        }

        if (s < 0) {
            seats = 0;
        }
        else {
            seats = s;
        }
    }
}
