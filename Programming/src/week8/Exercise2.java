package week8;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise2 {

	public static void main(String[] args) {
		// 1st object
		Phone phone1=new Phone("bq","E5 HD",2014);
		//2nd object
		Phone phone2=new Phone(null, null, 0);
		phone2.brand="bq";
		phone2.model="E5 HD";
		phone2.year=2014;
		//3rd object
		Phone phone3=phone1;
		phone3.model="M5";
		phone3.year=2016;
		

	}

}
