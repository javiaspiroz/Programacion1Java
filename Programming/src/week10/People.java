package week10;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class People {
	private String _name;
	private String _surname;
	private int _iD;
	private int _flightID;
	
	People(String name, String surname, int id, int flightID){
		_name=name;
		_surname=surname;
		_iD=id;
		_flightID=flightID;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public String get_surname() {
		return _surname;
	}
	public void set_surname(String _surname) {
		this._surname = _surname;
	}
	public int get_iD() {
		return _iD;
	}
	public void set_iD(int _iD) {
		this._iD = _iD;
	}
	public int get_flightID() {
		return _flightID;
	}
	public void set_flightID(int _flightID) {
		this._flightID = _flightID;
	}
}