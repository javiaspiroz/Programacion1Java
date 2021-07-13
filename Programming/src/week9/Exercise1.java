package week9;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of intervals you want to create.");
		int num=sc.nextInt();
		Time [] times=new Time[num];
		for(int ii=0; ii<num; ii++){
			System.out.println("Enter the initial hour.");
			int initialHour=sc.nextInt();
			System.out.println("Enter the initial minute.");
			int initialMin=sc.nextInt();
			System.out.println("Enter the final hour.");
			int finalHour=sc.nextInt();
			System.out.println("Enter the final minute.");
			int finalMin=sc.nextInt();
			times[ii]=new Time(initialHour, initialMin, finalHour, finalMin);
			System.out.println("Time interval: ["+times[ii].initialHour+":"+times[ii].initialMin+"-"+times[ii].finalHour+":"+times[ii].finalMin+"]");
			System.out.print("Runs through: "+times[ii].interval);
			System.out.println();
		}
		sc.close();
	}
}