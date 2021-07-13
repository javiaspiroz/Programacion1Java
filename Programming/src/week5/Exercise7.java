package week5;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Specify your bithday day and press Enter.");
		int day=sc.nextInt();
		System.out.println("Specify your bithday month and press Enter.");
		int month=sc.nextInt();
		System.out.println("Specify your bithday year and press Enter.");
		int year=sc.nextInt();
		int add1=day+month+year, d1, d2, d3, d4;
		while (add1>9){
			d1=add1/1000;
			d2=add1%1000/100;
			d3=add1%1000%100/10;
			d4=add1%1000%100%10;
			add1=d1+d2+d3+d4;
		}
		System.out.println("Your lucky number is "+add1);
		sc.close();

	}

}
