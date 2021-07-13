package extraExercises;

public class Car extends Vehicle {
	private int passengers;
	private boolean diesel;
	public void setPassengers(int p){
		if (passengers>0)
			this.passengers = p;
	}
	public int getPassengers(){
		return passengers;
	}
	public boolean isDiesel() {
		return diesel;
	}
	public void setDiesel(boolean diesel) {
		this.diesel = diesel;
	}
	/** Constructor, invokes the superclass constructor
	 * 
	 * @param l license number
	 * @param p rental price
	 * @param pas passengers
	 * @param d fuel type
	 */
	public Car (String l, float p, int pas, boolean d){
		super(l,p);
		setPassengers(pas);
		setDiesel(d);
	}
	public String toString(){
		String d;
		if (diesel)
			d = "gasoil";
		else
			d = "fuel";
		return super.toString()+" holds "+passengers+" passengers and runs with "+d;
	}
}