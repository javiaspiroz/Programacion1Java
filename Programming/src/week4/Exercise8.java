package week4;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the first person.");
		String name1= sc.next();
		System.out.println("Enter the name of the second person.");
		String name2= sc.next();
		System.out.println("Enter the age of the first person.");
		int age1 = sc.nextInt();
		System.out.println("Enter the age of the second person.");
		int age2 = sc.nextInt();
		if (age1>age2){
			System.out.println(name1+" is older than "+name2);
		}
		if (age1==age2){
			System.out.println(name1+" and "+name2 +" have the same age.");
		}
		if (age1<age2){
			System.out.println(name2+ " is older than " +name1);
		}
   

	}

}
