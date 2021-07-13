package week5;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num= (int)(Math.random()*(100)+1);
		System.out.println("Enter a number between 1 and 100.");
		int guess=sc.nextInt();
		while (num!=guess){
			System.out.println("The number you entered: "+guess+"; is not the number. Please, try again.");
			if (guess<num){
				System.out.println("Clue: The number you entered is LOWER than the number you are trying to find.");
			}
			else{
				System.out.println("Clue: The number you entered is BIGGER than the number you are trying to find.");
			}
			guess=sc.nextInt();
		}
		System.out.println("Congratulations!! You've found the number!!");
		sc.close();

	}

}
