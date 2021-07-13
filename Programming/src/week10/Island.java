package week10;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Island {
	private String _name;
	private double _latitude;
	private double _longitude;
	private String _country;
	private boolean _habitable;
	Island(String name, double latitude, double longitude, String country, boolean habitable){
		_name=name;
		if(latitude>85 || latitude<-85){
			latitude=0;
		}
		_latitude=latitude;
		if(longitude>180 || longitude<-180){
			longitude=0;
		}
		_longitude=longitude;
		_country=country;
		_habitable=habitable;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public double get_latitude() {
		return _latitude;
	}
	public void set_latitude(double _latitude) {
		this._latitude = _latitude;
	}
	public double get_longitude() {
		return _longitude;
	}
	public void set_longitude(double _longitude) {
		this._longitude = _longitude;
	}
	public String get_country() {
		return _country;
	}
	public void set_country(String _country) {
		this._country = _country;
	}
	public boolean is_habitable() {
		return _habitable;
	}
	public void set_habitable(boolean _habitable) {
		this._habitable = _habitable;
	}
}