package week4;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double ticket=9;
		System.out.println("How old are you?");
		int age=sc.nextInt();
		
		if (age<5){
			ticket=ticket*0.4;
		}
		else if(age>60){
			ticket=ticket*0.45;
		}
		else if(age<26){
			ticket=ticket*0.8;
		}
		sc.close();
		System.out.println("The price of your ticket is: "+ticket+"€");

	}

}
