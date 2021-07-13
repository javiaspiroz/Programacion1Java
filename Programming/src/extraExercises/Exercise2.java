package extraExercises;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Car c1 = new Car("1234ABC", 50, 4, true);
		Minibus m1 = new Minibus("0000BBB", 10, 12);
		Van v1 = new Van("8888CCC", 12, 2500);
		String option;
		System.out.println("Enter your money");
		float money = sc.nextFloat();
		do{
			System.out.println("These are the available vehicles");
			System.out.println("A) "+c1);
			System.out.println("B) "+m1);
			System.out.println("C) "+v1);
			System.out.println("Your current money is "+money);
			System.out.println("Which one do you want to rent (A/B/C)?");
			System.out.println("Q to finish");
			option = sc.next();
			//I don't use polymorphism
			switch(option.toUpperCase()){
			case "A": 	if (money>=c1.getPrice()) {
							money=money-c1.getPrice();
							c1.setRented(true);
					  	}
					  	else 
					  		System.out.println("No money for this!");
						break;
			case "B": 	if (money>=m1.getPrice()) {
							money=money-m1.getPrice();
							m1.setRented(true);
			  			}
			  			else 
			  				System.out.println("No money for this!");
			break;
			case "C": 	if (money>=v1.getPrice()) {
							money=money-v1.getPrice();
							v1.setRented(true);
			  			}
			  			else 
			  				System.out.println("No money for this!");
						break;
			case "Q": break;
			default: System.out.println("Wrong option!");
			}
			
			
		}
		while(!option.equals("Q"));
		sc.close();
	}
}