package lesson4;

import java.util.Scanner;
/**
 * This class shows an example of a do-while loop
 * The program generates a random number and the user has to guess it
 * 
 * @author Angel García Olaya
 * @since October 2015
 * @version 1.1
 *
 */
public class DoWhileExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int number = (int) (Math.random()*10)+1;
		boolean found = false;
		//We use a do-while loop because we want the block to be executed at least once
		do {
			System.out.println("Try to guess my number");
			int guess = sc.nextInt();
			if (guess==number) {
				found = true;
			}
			else {
				System.out.println("Wrong number, try again");
			}
		}
		while (!found); //We can write the condition also as found == false
		System.out.println("Good! The number was "+number);
		sc.close(); //We close the Scanner (optional)
	}
}
