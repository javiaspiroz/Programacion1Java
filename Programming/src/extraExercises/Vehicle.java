package extraExercises;

public class Vehicle {
	protected String license;
	protected float price;
	protected boolean rented;
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		if (price > 1)
			this.price = price;
	}
	/**
	 * @return the rented
	 */
	public boolean isRented() {
		return rented;
	}
	/**
	 * @param rented the rented to set
	 */
	public void setRented(boolean rented) {
		this.rented = rented;
	}
	/**
	 * @return the license
	 */
	public String getLicense() {
		return license;
	}
	public void setLicense(String license){
		String letters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		license = license.toLowerCase();
		//Checking the length
		if (license.length()==7){
			boolean valid = true;
			//Checking the numbers
			for (int ii=0; ii<4 && valid; ii++){
				if (numbers.indexOf(license.charAt(ii)) == -1)
					valid = false;
			}
			//Cheking the letters
			for (int ii=4; ii<7 && valid; ii++){
				if (letters.indexOf(license.charAt(ii)) == -1)
					valid = false;
			}
			if (valid)
				this.license = license.toUpperCase();
		}
	}
	/**
	 * Constructor
	 * @param l license number
	 * @param p rental price
	 */
	public Vehicle (String l, float p){
		setLicense(l);
		setPrice(p);
		rented = false; //not needed, default value
	}
	
	public String toString (){
		String r;
		if (rented)
			r ="rented";
		else
			r = "not rented";
		return "The vehicle with license "+license+" has a price of "+price+" and is "+r;
	}
	
	/**
	 * Equals method, checks if the license number are equal
	 * @param v
	 * @return
	 */
	public boolean equals (Vehicle v){
		return license.equals(v.license);
	}
}
