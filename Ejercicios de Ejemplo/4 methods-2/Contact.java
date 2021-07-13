package lesson6.year16_17;
/**
 * A class to store a Contact in a phone book
 * @author Angel Garcia Olaya. PLG-UC3M
 * @since November 2016
 * @version 1.0
 *
 */
public class Contact {
	private String name;
	private int  [] numbers;
	/** The main number of the contact. By default it is the first one. Not really needed to assign the 0*/
	private int main = 0;

	/**
	 * Creates a contact with several numbers
	 * @param name The name of the contact
	 * @param numbers The new numbers
	 */
	public Contact (String name, int [] numbers){
		setName(name);
		addNumber(numbers);
	}
	
	/**
	 * Creates a contact with a single number
	 * @param name The name of the contact
	 * @param number The number
	 */
	public Contact (String name, int number){
		setName(name);
		addNumber(number);
	}

	/**
	 * Creates a contact without numbers
	 * @param name The name of the contact
	 */
	public Contact (String name){
		setName(name);
	}

	public void setName (String name){
		this.name = name;
	}
	/**
	 * Adds a number to the list of numbers of a contact
	 * It is an example of an overloaded method (methods with same name but
	 * different parameters)
	 * @param number the new number
	 * @return true if the number is added (if it is new for this contact)
	 */
	public boolean addNumber (int number){
		//Looking if the number is already stored
		boolean found = findNumber(number);
		if (!found){
			int [] aux;
			//Checking if the array is created
			if (numbers==null) {
				//If it is not created, we create it
				this.numbers = new int [1];
				this.numbers[0] = number;
			}
			else {
				//Creating and array with one more position
				aux = new int [this.numbers.length+1];
				//Copying the field into it
				System.arraycopy(this.numbers, 0, aux, 0, numbers.length);
				//Adding the new number
				aux[this.numbers.length] = number;
				//Storing back the new array into the field (the original one is lost)
				this.numbers = aux;
			}
		}
		return !found;
	}

	/**
	 * Adds several numbers to the list of numbers of a contact.
	 * It is an example of an overloaded method (methods with same name but
	 * different parameters)
	 * @param number the new numbers
	 * @return true if all the numbers are added (if all are new for this contact)
	 */
	public boolean addNumber (int [] numbers){
		//We use the already created method
		//It is not very efficient, but it is the easier way
		boolean all = true;
		for (int ii=0; ii<numbers.length; ii++){
			//If any of them is not added, it will be false forever
			all = addNumber(numbers[ii]) && all;
		}
		return all;
	}

	/**
	 * Returns if the number belongs to the contact
	 * @param number the number to find
	 * @return true if it belongs to the contact
	 */
	public boolean findNumber (int number){
		if (this.numbers!=null) {
			for (int ii=0; ii<this.numbers.length;ii++){
				if (number==this.numbers[ii]) return true;
			}
		}
		return false;
	}
	
	public String getName (){
		return this.name;
	}
	/**
	 * Returns the numbers of a contact
	 * @return the array of numbers. It can be null!
	 */
	public int [] getNumbers (){
		return this.numbers;
	}
	/**
	 * Returns the main number of the contact
	 * @return the main number or 0 if there is no number
	 */
	public int getNumber (){
		if (this.numbers!= null)
			return this.numbers[this.main];
		else
			return 0;
	}
	/**
	 * Changes the main phone of a contact.
	 * @param pos the position of the new position
	 * @return true if the position exists
	 */
	public boolean changeMainNumber (int pos){
		if (pos>=0 && pos<this.numbers.length) {
			main = pos;
			return true;
		}
		return false;
	}
	
	/**
	 * ToString method
	 */
	public String toString (){
		String res = this.name+": ";
		if (this.numbers!=null){
			for (int ii=0; ii<this.numbers.length;ii++){
				res = res + this.numbers[ii]+" ";
			}
		}
		return res;
	}
	
	/**
	 * Checks the names are equal and all the numbers too even if they 
	 * are stored in different orders
	 * @param c another Contact
	 * @return true if both are equal
	 */
	public boolean equals (Contact c){
		//If the name is different they are not equal
		if (!this.name.equals(c.name)) return false;
		//We don´t need to write else as if the previous "if" is true, this will not be executed
		//Else if both lists of numbers are null, they are equal
		if (this.numbers == null && c.numbers == null) return true;
		//If one is null and the other is not, they are not equal
		if (this.numbers == null && c.numbers!=null || this.numbers!=null && c.numbers ==null) return false;
		//If both don't have the same length, they are not equal
		if (this.numbers.length!=c.numbers.length) return false;
		//Now we have to check if both have the same numbers
		for (int ii=0; ii<this.numbers.length; ii++){
			//We invoke the find method of the other object with each
			//of the objects in our list
			//If anyone is not found, we return false. In any other case we continue with the next
			if (!c.findNumber(this.numbers[ii]))
					return false;
		}
		//If we reached here, both are equal
		return true;
	}
}
