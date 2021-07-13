package week10;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Song {
	private String _tittle;
	private int _duration;
	private Person _author;
	
	Song(){
		
	}

	public String get_tittle() {
		return _tittle;
	}

	public void set_tittle(String _tittle) {
		this._tittle = _tittle;
	}

	public int get_duration() {
		return _duration;
	}

	public void set_duration(int _duration) {
		this._duration = _duration;
	}

	public Person get_author() {
		return _author;
	}

	public void set_author(Person _author) {
		this._author = _author;
	}
}
