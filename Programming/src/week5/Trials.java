package week5;

import java.util.Scanner;

public class Trials {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the order of a square matrix");
		int order=sc.nextInt(), row=1, column=1, n=0;
		while(column<=order){
			n++;
			column++;
			System.out.print(n+" ");
		}
		System.out.print("\n");
    	column=1;
		if(!(order==1)) System.out.print(n+" ");
		row++;
		int ii=1;
		n=0;
		while(row<=order){
			while(column<=(order-ii)){//column<=1
				column++;
				if (n==order) break;
				if (column>(order-ii) && n==order-1) column--;
				n++;
				System.out.print(n+" ");
			}
			if(n==order-1 && row==order && !(order==2)){
				System.out.print(order+" ");
				System.out.print("1 ");
			}
			if (n==order){
				n=0;
				while (column<=order){
					if (n==1 && row==order || column==order) break;
					n++;
					column++;
					System.out.print(n+" ");
				}
			}
			if (order==row) break;
			System.out.print("\n");
			System.out.print(n+" ");
			row++;
			column=0;
		}
		sc.close();
		
	}

}
