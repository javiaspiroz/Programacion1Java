package week13;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since December 2016
 * @version 1.0
 *
 */

public class Time {
	private int hour, minute;
	//If commented, means not used
	private boolean format24h;
	/*public void setFormat24h (boolean format24h){
		boolean aux;
		if(hour>12){
			aux=true;
			this.hour=12;
		}
		else{
			aux=false;
		}
		this.format24h=aux;
	}*/
	/*public void setHour (String h){
		if (hour<0 || hour>24 || minute<0 || minute>60){
			this.hour=10;
			this.minute=30;
		}
		h=hour+":"+minute;
	}*/
	public boolean equals (Time object){
		boolean result;
		if (hour==object.hour && minute==object.minute){
			result=true;
		}
		else if ((hour-12)==object.hour && minute==object.minute){
			result=true;
		}
		else{
			result=false;
		}
		return result;
	}
	public int getHour(){
		return hour;
	}
	public int getMinute(){
		return minute;
	}
	public void setHour(int hour){
		if (hour<0|| hour>24){
			this.hour=10;
		}
		else this.hour=hour;
	}
	public void setMinute (int minute){
		if (minute<0|| minute>24){
			this.minute=45;
		}
		else this.minute=minute;
	}
	public String toString(){
		String text;
		if (format24h=false){
			if (hour>12){
				text=(hour-12)+":"+minute+" p.m.";
			}
			else{
				text=hour+":"+minute+" a.m.";
			}
		}
		else{
			text=hour+":"+minute;
		}
		return text;
	}
	public Time(int hour, int minute){
		setHour(hour);
		setMinute(minute);
	}
}