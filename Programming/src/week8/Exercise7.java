package week8;

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
		int answer=0, ii=0;
		Market product=new Market(null, 0.0F, 0);
		do{
			System.out.println("Select your option:");
			System.out.println("1. Add a new product.");
			System.out.println("2. Search for a product.");
			System.out.println("3. Modify stock and price.");
			System.out.println("4. Exit");
			answer=sc.nextInt();
			if (answer==1){
				if(ii>=10) System.out.println("You can't introduce more products, sorry. Please, select another option.");
				else{
					System.out.println("Enter the name, price and stock.");
					product.name[ii]=sc.next();
					product.price[ii]=sc.nextFloat();
					product.stock[ii]=sc.nextInt();
					ii++;
				}
			}	
			else if (answer==2){
				System.out.println("Enter the name.");
				String fruitSearched=sc.next();
				for(int jj=0; jj<ii; jj++){
					if (product.name[jj].equals(fruitSearched)){
						System.out.println("The price is "+product.price[jj]);
						System.out.println("There are "+product.stock[jj]);
						}
				}
			}
			else if (answer==3){
				System.out.println("Enter the name.");
				String fruitSearched2=sc.next();
				for (int kk=0; kk<ii; kk++){
					if (product.name[kk].equals(fruitSearched2)){
						System.out.println("Enter the new price.");
						product.price[kk]=sc.nextFloat();
						System.out.println("Enter the new quantity.");
						product.stock[kk]=sc.nextInt();
					}	
				}
			}
			else if (answer==4){
				System.out.println("Thanks for using the program");
			}
			else{
				System.out.println("You didn't selected a suitable option. Choose another one, please.");
			}
		}
		while(answer!=4);
		sc.close();
	}

}
