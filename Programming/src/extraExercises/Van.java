package extraExercises;

public class Van extends Vehicle {
	private int load;
	/**
	 * @return the load
	 */
	public int getLoad() {
		return load;
	}
	/**
	 * @param load the load to set
	 */
	public void setLoad(int load) {
		if (load>0)
			this.load = load;
	}
	/**
	 *  Constructor, invokes the superclass constructor
	 * 
	 * @param l license number
	 * @param p rental price
	 * @param lo load
	 */
	public Van (String l, float p, int lo){
		super (l,p);
		setLoad(lo);
	}
}