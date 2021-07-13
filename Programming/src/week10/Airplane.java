package week10;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Airplane {
	private int _flightID;
	private Island _origin;
	private Island _destination;
	private int _seats;
	private People [] _passenger = new People[3];
	private String _status;
	private String _company;
		Airplane(int flightID, Island origin, Island destination, int seats, String status, String company){
		_flightID=flightID;
		_origin=origin;
		_destination=destination;
		_seats=seats;
		_status=status;
		_company=company;
	}
	public int get_flightID() {
		return _flightID;
		}
	public void set_flightID(int _flightID) {
		this._flightID = _flightID;
	}
	public Island get_origin() {
		return _origin;
	}
	public void set_origin(Island _origin) {
		this._origin = _origin;
	}
	public Island get_destination() {
		return _destination;
	}
	public void set_destination(Island _destination) {
		this._destination = _destination;
	}
	public int get_seats() {
		return _seats;
	}
	public void set_seats(int _seats) {
		this._seats = _seats;
	}
	public People[] get_passenger() {
		return _passenger;
	}
	public void set_passenger(People[] _passenger) {
		this._passenger = _passenger;
	}
	public String get_status() {
		return _status;
	}
	public void set_status(String _status) {
		this._status = _status;
	}
	public String get_company() {
		return _company;
	}
	public void set_company(String _company) {
		this._company = _company;
	}
}