package week5;

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
		System.out.println("Enter a number");
		double num=sc.nextDouble(), times=0;
		System.out.println("Enter another number");
		double num2=sc.nextDouble();
		if (num==0){
			System.out.println("The mean is 0");
		}
		else if (num2==0){
			System.out.println("The mean is "+num/2.0);
		}
		else{
			while (num2!=0){
				times++;
				num=num+num2;
				System.out.println("Enter another number");
				num2=sc.nextDouble();
			}
			System.out.println("The mean is "+num/times);
		}
		sc.close();

	}

}
