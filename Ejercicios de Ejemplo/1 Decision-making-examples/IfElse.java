package lesson4;

import java.util.Scanner;

/**
 * This class shows an example of an if-else statement
 * It reads a number from the keyboard and prints whether the student passed the subject or not. 
 * 
 * @author Angel García Olaya
 * @since September 2015
 * @version 1.0
 *
 */
public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float b;
		System.out.println("Introduce your mark");
		b = sc.nextFloat();
		//Notice, we can compare with 5.0F or with 5 as it gets converted automatically to 5.0F
		if (b>=5) {
			//We put all the sentences we want to be executed if the condition is true in between  { }
			System.out.println("You passed!");
			System.out.println("Congratulations");
		}
		else {
			/*Here all the sentences to be executed if the condition is false.
			 * In this case as we only want to execute one sentence we could have removed the { } */
			System.out.println("You failed");
		}
		//This is always executed
		System.out.println("End of program");
		sc.close();
	}
}
