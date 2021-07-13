package exampleExercises;

import java.util.Scanner;

public class AttackStrategies {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String time;
		System.out.println("Enter 'Day' or 'Night' depending in which one you are.");
		time=sc.next();
		int soldiers;
		System.out.println("Enter the number of soldiers.");
		soldiers=sc.nextInt();
		byte siegeEngines;
		System.out.println("Enter the number of siege engines.");
		siegeEngines=sc.nextByte();
		boolean poison;
		System.out.println("Enter 'true' or 'false' to say if you have poison or not.");
		poison=sc.nextBoolean();
		boolean weather;
		System.out.println("Enter 'true' or 'false' to say if it is raining or not.");
		weather=sc.nextBoolean();
		if (soldiers>500 && siegeEngines>=50 && weather==false && time.equals("Night.")){
			System.out.println("You can use the Strategy A: Silent Attack.");
		}
		else if (soldiers>10000 && time.equals("Day")){
			System.out.println("You can use the Strategy B: Crossfire.");
			
		}
		else if (poison==true && soldiers>=1 && time.equals("Night")){
			System.out.println("You can use Strategy C: Kill the King.");
		}
		sc.close();
	

	}

}
