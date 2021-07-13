package week13;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since December 2016
 * @version 1.0
 *
 */

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the hour and the minute");
		Time t1=new Time(sc.nextInt(), sc.nextInt());
		System.out.println(t1);
		System.out.println("Enter the hour and the minute");
		Time t2=new Time(sc.nextInt(), sc.nextInt());
		System.out.println(t2);
		System.out.println(t1.equals(t2));
		sc.close();
	}

}
