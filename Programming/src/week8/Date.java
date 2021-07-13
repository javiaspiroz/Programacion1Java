package week8;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Date {
	public int day;
	public int month;
	public int year;
	public Date (int day, int month, int year){
		this.month=month;
		this.year=year;
		this.day=day;
		if (month==2){
			if (day<1 || day>28){
				this.day=(int)(Math.random()*28)+1;
			}
		}
		else if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
			if (day<1 || day>31){
				this.day=(int)(Math.random()*31)+1;
			}
		}
		else if(month==4 || month==6 || month==5 || month==9 || month==11){
			if (day<1 || day>30){
				this.day=(int)(Math.random()*30)+1;
			}
		}
		else if (month<1 || month>12){
			this.month=(int)(Math.random()*12)+1;
			if (month==2){
				if (day<1 || day>28){
					this.day=(int)(Math.random()*28)+1;
				}
			}
			else if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
				if (day<1 || day>31){
					this.day=(int)(Math.random()*31)+1;
				}
			}
			else if(month==4 || month==6 || month==5 || month==9 || month==11){
				if (day<1 || day>30){
					this.day=(int)(Math.random()*30)+1;
				}
			}
		}
	}

}
