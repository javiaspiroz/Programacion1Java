package week4;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since September 2016
 * @version 1.0
 *
 */


public class Exercise5 {

	public static void main(String[] args) {
		System.out.println("Introduce a number");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println("Introduce another number");
		double b= sc.nextDouble();
		float c= (float) (a+b);
		System.out.println("Your result is:"+c);
		sc.close();

	}

}
