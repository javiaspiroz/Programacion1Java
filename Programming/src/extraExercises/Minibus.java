package extraExercises;
public class Minibus extends Vehicle {
private int passengers;
	/**
	 * @return the passengers
	 */
	public int getPassengers() {
		return passengers;
	}
	/**
	 * @param passengers the passengers to set
	 */
	public void setPassengers(int passengers) {
		if (passengers>0)
			this.passengers = passengers;
	}
	/**
	 *  Constructor, invokes the superclass constructor
	 * @param l license number
	 * @param p rental price
	 * @param pas passengers
	 */
	public Minibus (String l, float p, int pas){
		super (l,p);
		setPassengers(pas);
	}
}