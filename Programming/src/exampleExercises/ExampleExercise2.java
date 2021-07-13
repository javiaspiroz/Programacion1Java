package exampleExercises;

import java.util.Scanner;

public class ExampleExercise2 {
	public static void main(String[] args) {
		//day could be a boolean, but we declare it as a String to show how to compare Strings in conditionals
		String day;
		int soldiers, engines;
		boolean poison, rain;

		Scanner sc = new Scanner (System.in);
		System.out.println("Is it day or night?");
		day = sc.next();
		System.out.println("How many soldiers do you have?");
		soldiers = sc.nextInt();
		System.out.println("How many siege engines?");
		engines = sc.nextInt();
		System.out.println("Do you have poison? (true/false)");
		poison = sc.nextBoolean();
		System.out.println("Is it raining? (true/false)");
		rain = sc.nextBoolean();
		/* We are going to assume that the alternatives are not exclusive, i.e. more than one can be applicable.
		 * Then, we need to track if none is applicable, so we create an auxiliary variable to account for that
		 */
		boolean noneApplicable = true;
		//Checking the first strategy
		/* Although most of the times it is working, this is one of the cases where it is not
		 * (we'll see why when we speak about objects in lesson).
		 * Avoid using == to compare Strings
		 * Strings should be compared using equals, as shown below 
		 */
		if (day.equals("night") && soldiers>500 && engines >= 50 && !rain){
			System.out.println("The recommended strategy is A: \"Silent attack\"");
			noneApplicable = false;
		}
		/* We do not use "else if" as we want the three strategies to be applicable, if we used an "else if"
		 * if the first one was applicable the next "if" would never be checked
		 */
		if (day.equals("day") && soldiers > 10000){
			System.out.println("The recommended strategy is B: \"Crossfire\"");
			noneApplicable = false;
		}
		if (day.equals("night") && soldiers>0 && poison){
			System.out.println("The recommended strategy is C: \"Kill the king\"");
			noneApplicable = false;
		}
		//Now we check if none has been applied
		if (noneApplicable) {
			System.out.println("None  of  the  three  strategies  is satisfied  completely  "
					+ "but  I'll  tell  you  what you satisfy for each one of them right "
					+ "now so you can take a decision");
			//We define some constant Strings as we are going to reuse them
			String NIGHT = "night", DAY = "day", SOLDIERS1 ="more than 500 soldiers", 
					SOLDIERS2 = "more than 10000 soldiers";
			String SOLDIERS3= "one soldier", SIEGE = "siege machines", RAIN = "no rain", POISON = "poison";
			/*
			 * We will create two String variables, in one of them we will append what is satisfied, while
			 * in the other one we will append not satisfied items
			 */
			String satisfy = "\t Satisfy: ", noSatisfy = "\t Do not satisfy: ";
			//Strategy A
			System.out.println("Strategy A:");
			if (day.equals("night")) {
				satisfy = satisfy+NIGHT+"\t";
			}
			else {
				noSatisfy = noSatisfy+NIGHT+"\t";
			}
			if (soldiers>500) {
				satisfy = satisfy+SOLDIERS1+"\t";
			}
			else {
				noSatisfy = noSatisfy+SOLDIERS1+"\t";
			}
			if (engines>=50){
				satisfy = satisfy+SIEGE+"\t";
			}
			else {
				noSatisfy = noSatisfy+SIEGE+"\t";
			}
			if (rain) {
				satisfy = satisfy+RAIN+"\t";
			}
			else {
				noSatisfy = noSatisfy+RAIN+"\t";
			}
			System.out.println(satisfy);
			System.out.println(noSatisfy);

			//Strategy B
			satisfy = "\t Satisfy: ";
			noSatisfy = "\t Do not satisfy: ";
			System.out.println("Strategy B:");
			if (day.equals("day")) {
				satisfy = satisfy+DAY+"\t";
			}
			else {
				noSatisfy = noSatisfy+DAY+"\t";
			}
			if (soldiers>10000) {
				satisfy = satisfy+SOLDIERS2+"\t";
			}
			else {
				noSatisfy = noSatisfy+SOLDIERS2+"\t";
			}
			System.out.println(satisfy);
			System.out.println(noSatisfy);

			//Strategy C
			satisfy = "\t Satisfy: ";
			noSatisfy = "\t Do not satisfy: ";
			System.out.println("Strategy C:");
			if (day.equals("night")) {
				satisfy = satisfy+NIGHT+"\t";
			}
			else {
				noSatisfy = noSatisfy+NIGHT+"\t";
			}
			if (soldiers>0) {
				satisfy = satisfy+SOLDIERS3+"\t";
			}
			else {
				noSatisfy = noSatisfy+SOLDIERS3+"\t";
			}
			if (poison){
				satisfy = satisfy+POISON+"\t";
			}
			else {
				noSatisfy = noSatisfy+POISON+"\t";
			}
			System.out.println(satisfy);
			System.out.println(noSatisfy);
			int strategy=(int)(Math.random()*3);
			int reqSoldiers, reqSieges;
			boolean needPoison;
			switch(strategy){
			case 0:
				System.out.println("The strategy will be A: Silent Attack");
				reqSoldiers= 500-soldiers;
				reqSieges= 50-engines;
				needPoison=false;
				System.out.println("You need "+reqSoldiers+" soldiers and "+reqSieges+" sieges engines.");

			case 1:
				System.out.println("The strategy will be B: Crossfire");
				reqSoldiers=10000-soldiers;
				reqSieges=0;
				needPoison=false;
				System.out.println("You need "+reqSoldiers+" soldiers.");

			default:
				System.out.println("The strategy will be C: Kill the king)");
				reqSoldiers= 1-soldiers;
				reqSieges=0;
				needPoison=true;
				System.out.println("You need "+reqSoldiers+" soldiers and some poison.");
			}			

			int money= 100000;
			int wood=0, herbs=0, iron=0;
			/*It is possible to do it like this but the exercise is made in order to 
			 * learn how to use loops.
			 * 
			 * money = money-(reqSoldiers*10);
		     int wood=0;
		     if (reqSoldiers>=10) ((int)(wood==(reqSoldiers/10));
		     money=money-(reqSieges*100+reqSiege*100);
			 */
			//Buying soldiers
			for(int boughtSoldiers=0; boughtSoldiers<reqSoldiers; boughtSoldiers++){
				money=money-10;
				System.out.println("1 solider was bought. 10 golden coins were used");
				//for every 5 soldiers bought, we obtain 10 wood units
				if (boughtSoldiers%5==0) {
					wood = wood +10;
				}
				int needWood=reqSieges*200, needIron=reqSieges*50, boughtSieges=0;
				for (;wood<needWood && money>=10; wood=wood+20){
					System.out.println("20 wood units were bought. 10 golden coins were used.");
					money=money-10;
				}
				for (;iron<needIron && money>=10; iron=iron+5){
					System.out.println("5 iron units were bought. 10 golden coins were used.");
					money=money-10;
				for (boughtSieges=0; boughtSieges<reqSieges && wood>0 && iron>0; boughtSieges++){
				wood=wood-200;
				iron=iron-50;
				System.out.println("1 siege machine was bought. 200 wood units and 50 iron units were used.");
				}
				int needHerbs=50;
				if(needPoison){
				needWood=wood-100;
				}
				for (;wood<needWood && money>=10;wood=wood+20){
					System.out.println("20 wood units were bought. 10 golden coins were used.");
					money=money-10;
				}
				for (; herbs< needHerbs && money>=10; herbs=herbs+10){
					System.out.println("10 herbs were bought. 10 golden coins were used.");
					money =money-10;
				}
				if (wood>=needWood && herbs >= needHerbs && money >= 100)
					needPoison = false;
			    }
				//If we didn't buy enough, is because we ran out of money
				if (boughtSoldiers < reqSoldiers || boughtSieges < reqSieges || needPoison == true) {
						System.out.println("We ran out of money, no battle today");
					}
				else {
					//To convert 1,2,3 to A,B,C we add 64 to the number and cast it to char (A is 65)
					System.out.println("Now you are ready for the battle. Just follow the strategy: "+(char)(64+strategy));
					System.out.println("Available money: "+money);
				}


				//We close the Scanner. Non-compulsory but good to be done
				sc.close();
				}
		}
	}
}

