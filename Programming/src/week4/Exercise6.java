package week4;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since September 2016
 * @version 1.0
 *
 */

public class Exercise6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of seconds");
		int seconds1 = sc.nextInt();
		int minutes1= seconds1/60;
		int minutes2= minutes1%60;
		int seconds2= seconds1%60;
		int hours= minutes1/60;
		System.out.println( "Your time introduced is:"+hours+" hours "+minutes2+" minutes "+seconds2+" seconds.");
		sc.close();

	}

}
