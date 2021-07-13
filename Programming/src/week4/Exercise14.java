package week4;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		System.out.println("Enter the quantity of money you want to change");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive amount of money ");
		double money1=sc.nextDouble();
		
		if (money1>=500){
			System.out.println("500 € bills:" + (int) money1/500);
			money1=money1%500;
		}
		if (money1>=200){
			System.out.println("200 € bills:" + (int) money1/200);
			money1=money1%200;
		}
		if (money1>=100){
			System.out.println("100 € bills:" + (int) money1/100);
			money1=money1%100;
		}
		if (money1>=50){
			System.out.println("50 € bills:" + (int) money1/50);
			money1=money1%50;
		}
		if (money1>=20){
			System.out.println("20 € bills:" + (int) money1/20);
			money1=money1%20;
		}
		if (money1>=10){
			System.out.println("10 € bills:" + (int) money1/10);
			money1=money1%10;
		}
		if (money1>=5){
			System.out.println("5 € bills:" + (int) money1/5);
			money1=money1%5;
		}
		if (money1>=2){
			System.out.println("2 € coins:" + (int) money1/2);
			money1=money1%2;
		}
		if (money1>=1){
			System.out.println("1 € coins:" + (int) money1/1);
			money1=money1%1;
		}
		if (money1>=0.5){
			System.out.println("0.5 € coins:" + (int) (money1/0.5));
			money1=money1%(0.5/10);
		}
		if (money1>=0.2){
			System.out.println("0.2 € coins:" + (int) (money1/0.2));
			money1=money1%(0.2/10);
		}
		if (money1>=0.1){
			System.out.println("0.1 € coins:" + (int) (money1/0.1));
			money1=money1%(0.1/10);
		}
		if (money1>=0.05){
			System.out.println("0.05 € coins:" + (int) (money1/0.05));
			money1=money1%(0.5/100);
		}
		if (money1>=0.02){
			System.out.println("0.02 € coins:" + (int) (money1/0.02));
			money1=money1%(0.2/100);
		}
		if (money1>=0.01){
			System.out.println("0.01 € coins:" + (int) (money1*100));
			money1=money1%(0.1/100);
		}
		if (money1<0) {
			System.out.println("Please enter a valid number");
		sc.close();
			
		}

	}

}
