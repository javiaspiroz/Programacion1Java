package week4;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers of years you've been working.");
		double years1= sc.nextDouble();
		System.out.println("Enter the base salary you earn in a month.");
		double money1=sc.nextDouble();
		if ( money1 <500 && years1 >= 10 ){
			double money2 = money1* 0.2;
			double money3 = money1 + money2;
			System.out.println("Your new base salary is "+money3);
			}
		else if ( money1<500 && years1<10){
			double money4 = money1*0.05;
			double money5 = money1 + money4;
			System.out.println("Your new base salary is "+money5);
		}
		else{
			System.out.println("Your base salary does not change, sorry it will keep being "+money1+".");
		}
		sc.close();
	

	}

}
