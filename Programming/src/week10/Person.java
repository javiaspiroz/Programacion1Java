package week10;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Person {
	private String _personName;
	private int _birthYear;

	Person(){
		
	}

	public String get_personName() {
		return _personName;
	}

	public void set_personName(String _personName) {
		this._personName = _personName;
	}

	public int get_birthYear() {
		return _birthYear;
	}

	public void set_birthYear(int _birthYear) {
		this._birthYear = _birthYear;
	}
}
