package week10;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Band {
	private String _bandName;
	private int _creationYear;
	private Person [] _members;
	
	Band(){
		
	}

	public String get_bandName() {
		return _bandName;
	}

	public void set_bandName(String _bandName) {
		this._bandName = _bandName;
	}

	public int get_creationYear() {
		return _creationYear;
	}

	public void set_creationYear(int _creationYear) {
		this._creationYear = _creationYear;
	}

	public Person[] get_members() {
		return _members;
	}

	public void set_members(Person[] _members) {
		this._members = _members;
	}
}
