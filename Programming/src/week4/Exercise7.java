package week4;

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
		System.out.println("Enter two interger numbers");
		int a=sc.nextInt(), b= sc.nextInt(),c;
		if (b==0){
		System.out.println("Cannot divide by zero using interger numbres");	
		}
		else{
		c=a/b;
		System.out.println("The result of the division is: "+c);
		sc.close();
		}
		
		

		
	}

}
