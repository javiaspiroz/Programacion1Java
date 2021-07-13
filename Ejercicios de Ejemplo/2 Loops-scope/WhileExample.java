package lesson4;

import java.util.Scanner;
/**
 * This class shows an example of a while loop
 * The program generates a random number and the user has to guess it
 * (it would be better to use a do-while loop here as we want the loop to iterate at least once)
 * 
 * @author Angel García Olaya
 * @since October 2015
 * @version 1.1
 *
 */
public class WhileExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int number = (int) (Math.random()*10)+1;
		boolean found = false;
		while (!found){//We can write the condition also as found == false
			System.out.println("Try to guess my number");
			int guess = sc.nextInt();
			if (guess==number)
				//As the if block is a single sentence, we can omit the braces { }
				found = true;
			else
				System.out.println("Wrong number, try again");
		}
		System.out.println("Good! The number was "+number);
		sc.close();//We close the Scanner (optional)
	}
}
