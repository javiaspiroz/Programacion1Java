package lesson6.year16_17.third;
/**
 * An example of a Date class with private fields, constructors, getters/setters and other methods
 * @author Angel Garcia Olaya. PLG-UC3M
 * @since November 2016
 * @version 1.0
 *
 */
public class Date {
	/** The day. Valid values are 1 to 31 (depending on the month)*/ 
	private int day=1;
	/** The month. We use an integer as it is better in order to do calculations.
	 * Valid values are in the range 1 to 12 */
	private int month = 1;
	/** The year. Any integer value is a valid value*/
	private int year;
	/** Whether the year is a leap year or not. 		
	 * Year 0 was not a leap year (no leap years that time) but following
	 * the rules (divisible by 400) we mark it as leap year*/
	private boolean leapYear = true;
	/**
	 * No-argument constructor. It sets the initial values to 1/1/0 (d/m/y).
	 * As we don´t need to perform any calculation we leave it empty and
	 * assign the by-default values when we declare the fields.
	 */
	public Date (){
	}
	/**
	 * Constructor it checks the day and month are correct. 
	 * If any of them is not correct it is set to 1.
	 * No value is received for the leapYear field as it will be automatically calculated
	 * @param d the day
	 * @param m the month
	 * @param y the year
	 */
	public Date(int day,int month, int year){
		setYear(year);
		setMonth(month);
		setDay(day);
		}

	/**
	 * Constructor receiving the day and the month. Year is set to this one.
	 * @param day the day
	 * @param month the month
	 */
	public Date (int day, int month){
		//Instead of repeating the code of the other constructor we use the this reserved word
		//to invoke it.
		this(day,month,2016);
	}
	/**
	 * Full constructor that receives the month as a String in lower case. If the month is incorrectly 
	 * spelled, January (1) is chosen.
	 * @param day  the day
	 * @param month the month
	 * @param year the year
	 */
	public Date (int day, String month, int year){
		setYear(year);
		switch (month){
		case "January": this.month=1; break;
		case "Feburary": this.month=2; break;
		case "March": this.month=3; break;
		case "April": this.month=4; break;
		case "May": this.month=5; break;
		case "June": this.month=6; break;
		case "July": this.month=7; break;
		case "August": this.month=8; break;
		case "September": this.month=9; break;
		case "October": this.month=10; break;
		case "November": this.month=11; break;
		case "December": this.month=12; break;
		}
		setDay(day);
	}
	/**
	 * get method, returns the value of the day field so it can be read in the program
	 * where a Date object is created
	 * @return the day
	 */
	public int getDay (){
		return this.day;
	}
	/**
	 * get method, returns the value of the month field so it can be read in the program
	 * where a Date object is created
	 * @return the month
	 */
	public int getMonth(){
		//We can always omit the "this." if no parameter with the same name
		return month;
	}
	/**
	 * get method, returns the value of the year field so it can be read in the program
	 * where a Date object is created
	 * @return the year
	 */
	public int getYear(){
		return this.year;
	}
	/**
	 * get method, returns if this is a leap year so it can be read in the program
	 * where a Date object is created
	 * @return true if this a leap year
	 */
	public boolean getLeapYear (){
		return this.leapYear;
	}
	/**
	 * Returns the name of the month of this Date object
	 * @return the name of the month
	 */
	public String getMonthName (){
		switch (month){
		case 1: return "January";
		case 2: return "February";
		case 3: return "March";
		case 4: return "April";
		case 5: return "May";
		case 6: return "June";
		case 7: return "July";
		case 8: return "August";
		case 9: return "September";
		case 10: return "October";
		case 11: return "November";
		case 12: return "December";
		/*We know the value will be always between 1 and 12 but Java doesn't and
		 * we are obliged to always return a String, so we add a default case 
		 */
		default: return "January";
		}
	}
	/**
	 * Changes the value of the month to the one received as parameter if the new value is correct.
	 * If not, it leaves the month unchanged.
	 * @param month the new value for the month
	 */
	public void setMonth (int month){
		/*The name of the parameter and the name of the field doesn´t need to be equal
		 * but if the are "this." is compulsory */
		if (month>=1 && month<=12){
			this.month = month;
		}
	}
	/**
	 * Changes the value of the year to the one received as parameter.
	 * No checking is done as all integer values are valid for years.
	 * But it also changes the value of the leap year accordingly
	 * @param year the new value for the year
	 */
	public void setYear (int year){
		this.year = year;
		//We change also the value of the leap year
		if(year%4==0 && year%100!=0 || year%400==0){
			this.leapYear = true;
		}
		else {
			this.leapYear = false;
		}
	}
	/**
	 * Changes the value of the day to the one received as parameter if the new value is correct.
	 * If not, it leaves the day unchanged.
	 * @param day the new value for the day
	 */
	public void setDay (int day){
		//We check the maximum number of days of each month
		int maxDays;
		if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11){
			maxDays = 30;
		}
		else if (this.month == 2) {
			if (this.leapYear)
				maxDays = 29;
			else
				maxDays = 28;
		}
		else {
			maxDays = 31;
		}
		if(day>0 && day<=maxDays){
			this.day=day;
		}
	}
	/**
	 * Allows to change both the day and the month. It invokes the setDay and setMonth methods,
	 * which are the ones really doing the job.
	 * @param day the new value for the day
	 * @param month the new value for the month
	 */
	public void setDayAndMonth (int day, int month){
		//We first change the month as the valid values for days depend on the month
		setMonth(month);
		//Now we change the day
		setDay(day);
	}
	/**
	 * Method that is invoked when we print the object
	 */
	public String toString (){
		String result = this.day+"/"+this.month+"/"+this.year;
		return result;
	}
	/**
	 * Method to compare two Date objects
	 * @param another another Date object
	 * @return true if day, month and year are equal
	 */
	public boolean equals (Date another){
		//In this case, instead of creating a variable to store the result
		//we directly return the result of the calculation
		return this.day==another.day && this.month==another.month && this.year==another.year;
	}
}