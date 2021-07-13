package week9;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Song {
	public String songName;
	public int duration;
	public Author authorName;
	public Song(String songName, int duration){
		this.songName=songName;
		if (duration<0){
			this.duration=0;
		}
		else{
			this.duration=duration;
		}
	}
}
