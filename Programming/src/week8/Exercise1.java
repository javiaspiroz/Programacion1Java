package week8;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Football player1=new Football();
		System.out.println("Enter the name of the player");
		player1.name=sc.next();
		System.out.println("Enter the surname of the player");
		player1.surname=sc.next();
		System.out.println("Enter the age of the player");
		player1.age=sc.nextByte();
		System.out.println("Enter the position of the player");
		player1.position=sc.next();
		System.out.println("Enter the team of the player");
		player1.team=sc.next();
		sc.close();
	}

}
