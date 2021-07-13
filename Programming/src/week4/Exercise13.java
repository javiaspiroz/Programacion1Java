package week4;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise13 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year.");
		int year=sc.nextInt();
		int years4=year%4;
		int years100=year%100;
		int years400=year%400;
		if (years4!=0){
		System.out.println("The year "+year+" is NOT a leap year");
		}
		else if (years4==0 && years100==0 && years400!=0){
		System.out.println("The year "+year+" is NOT a leap year");	
		}
		else if (years400==0){
		System.out.println("The year "+year+" is a leap year");
				}
		else {
		System.out.println("The year "+year+" is a leap year");
		}
		
		sc.close();
	}

}
