package lesson4;

import java.util.Scanner;

/**
 * This class shows an example of chained if-else
 * It prints the textual mark for a given numeric mark
 * 
 * @author Angel García Olaya
 * @since September 2015
 * @version 1.0
 *
 */
public class ChainedIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce your mark");
		float mark = sc.nextFloat();
		//Notice that in every case we are executing just a single sentence, so { } could be removed.
		//They are left for clarity
		if(mark<0 || mark>10){
			System.out.println("Wrong mark!");
		}
		else if (mark<5){
			System.out.println("You failed");
		}
		else if (mark<7){
			System.out.println("Your mark is average");
		}
		else if (mark<9) {
			System.out.println("Your mark is above average");
		}
		else if (mark<10) {
			System.out.println("Your mark is excellent");
		}
		else {
			System.out.println("You graduate with honors!");
		}
		
		sc.close();
	}

}
