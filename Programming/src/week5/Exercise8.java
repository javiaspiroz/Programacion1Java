package week5;

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
		System.out.println("Enter a value for N (which will be the order of your Latin Square) and press Enter.");
		int n=sc.nextInt(), row=1, column=1, num=0;
		System.out.println("Your Latin Square of order "+n+" is:");
		System.out.println();
		while(column<=n){
			num++;
			column++;
			System.out.print(num+" ");
		}
		System.out.print("\n");
    	column=1;
		if(!(n==1)) System.out.print(num+" ");
		row++;
		int aux=1;
		num=0;
		while(row<=n){
			while(column<=(n-aux)){
				column++;
				if (num==n) break;
				if (column>(n-aux) && num==n-1) column--;
				num++;
				System.out.print(num+" ");
			}
			if(num==n-1 && row==n && !(n==2)){
				System.out.print(n+" ");
				System.out.print("1 ");
			}
			if (num==n){
				num=0;
				while (column<=n){
					if (num==1 && row==n || column==n) break;
					num++;
					column++;
					System.out.print(num+" ");
				}
			}
			if (n==row) break;
			System.out.print("\n");
			System.out.print(num+" ");
			row++;
			column=0;
		}
		sc.close();
	}
}
