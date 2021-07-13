package week10;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Album {
	private String _albumTittle;
	private int _releasingYear;
	private Song[] _songs;
	private double _price;
	private Band _band;
	
	Album(){
		
	}

	public String get_albumTittle() {
		return _albumTittle;
	}

	public void set_albumTittle(String _albumTittle) {
		this._albumTittle = _albumTittle;
	}

	public int get_releasingYear() {
		return _releasingYear;
	}

	public void set_releasingYear(int _releasingYear) {
		this._releasingYear = _releasingYear;
	}

	public Song[] get_songs() {
		return _songs;
	}

	public void set_songs(Song[] _songs) {
		this._songs = _songs;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double _price) {
		this._price = _price;
	}

	public Band get_band() {
		return _band;
	}

	public void set_band(Band _band) {
		this._band = _band;
	}
}
