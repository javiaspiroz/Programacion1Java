package week6;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada.
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 9.");
		int number = sc.nextInt();
		int [] array1 = new int [20];
		for(int ii=0; ii<20; ii++){
			array1[ii] = (int)(Math.random()*9)+1;
			if (number==array1[ii]){
				System.out.println("Your number is in the random numbers and is in the position "+(ii+1)+".");
			}
		}
			sc.close();
	}

}
