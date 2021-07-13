package week9;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Time {
	public int initialHour;
	public int initialMin;
	public int finalHour;
	public int finalMin;
	public String interval;
	public Time (int initialHour, int initialMin, int finalHour, int finalMin){
		this.initialHour=initialHour;
		this.initialMin=initialMin;
		this.finalHour=finalHour;
		this.finalMin=finalMin;
		//Check Hours
		if (initialHour<0 || initialHour>23){
			this.initialHour=finalHour;
		}
		if (finalHour<0 || finalHour>23){
			this.finalHour=initialHour;
		}
		if (finalHour<0 || finalHour>23 && initialHour<0 || initialHour>23){
			this.initialHour=0;
			this.finalHour=0;
		}
		//Check Minutes
		if(initialMin<0 || initialMin>59){
			this.initialMin=0;
		}
		if(finalMin<0 || finalMin>59){
			this.finalMin=0;
		}
		//Changing initials values
		if (initialHour>finalHour){
			this.initialHour=finalHour;
			this.finalHour=initialHour;
		}
		if (initialHour==finalHour){
			if (initialMin>finalMin){
				this.initialMin=finalHour;
				this.finalMin=initialMin;
			}
		}
		//Setting time intervals.
		//Important to order them to less intervals involved to the most intervals involved.
		if (initialHour>=0 && finalHour<6){
			this.interval="night";
		}
		else if (initialHour>=6 && finalHour<12){
			this.interval="morning";
		}
		else if (initialHour>=12 && finalHour<18){
			this.interval="afternoon";
		}
		else if (initialHour>=18 && finalHour<24){
			this.interval="evening";
		}
		else if (initialHour>=0 && finalHour<12){
			this.interval="morning night";
		}
		
		else if (initialHour>=6 && finalHour<18){
			this.interval="morning afternoon";
		}
		
		else if (initialHour>=12 && finalHour<24){
			this.interval="afternoon evening";
		}
		
		else if (initialHour>=6 && finalHour<24){
			this.interval="morning afternoon evening";
		}
		else if (initialHour>=0 && finalHour<18){
			this.interval="morning afternoon night";
		}
		else {
			this.interval="morning afternoon evening night";
		}
	}
}
