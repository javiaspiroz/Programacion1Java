package year16_17.guided;
import java.util.Scanner;

/**
 * 
 * @author Nerea Luis Mingueza & Angel García Olaya. PLG-UC3M
 * @version 1.1
 * @since October 2015
 *
 */
public class Exercise2 {

	public static void main(String[] args) {
		//day could be a boolean, but we declare it as a String to show how to manage Strings in conditionals
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
		/* Although most of the times it is working, it is not good to use == to compare Strings (see the
		 * explanation in Aula Global). Strings should be compared using equals, as shown below 
		 */
		if (day.equals("night") && soldiers>500 && engines >= 50 && !rain){
			System.out.println("The recommended strategy is A: \"Silent attack\"");
			//As noneApplicable has been declared in the main block, it can be changed inside this block
			noneApplicable = false;
		}
		/* We do not use else if as we want the three strategies to be applicable, if we used an else if
		 * if the first is applicable the next if will never be checked
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
					+ "but  I  tell  you  what  you satisfy for each one of them right "
					+ "now so you can take a decision");
			//We define some constant Strings as we are going to reuse them
			String NIGHT = "night", DAY = "day", SOLDIERS1 ="more than 500 soldiers", SOLDIERS2 = "more than 10000 soldiers";
			String SOLDIERS3= "one soldier", SIEGE = "siege machines", RAIN = "no rain", POISON = "poison";
			//Strategy A
			String satisfy = "\t Satisfy: ", noSatisfy = "\t Do not satisfy: ";
			System.out.println("Strategy A:");
			if (day.equals("night"))
				satisfy = satisfy+NIGHT+"\t";
			else
				noSatisfy = noSatisfy+NIGHT+"\t";
			if (soldiers>500)
				satisfy = satisfy+SOLDIERS1+"\t";
			else
				noSatisfy = noSatisfy+SOLDIERS1+"\t";
			if (engines>=50)
				satisfy = satisfy+SIEGE+"\t";
			else
				noSatisfy = noSatisfy+SIEGE+"\t";
			if (rain)
				satisfy = satisfy+RAIN+"\t";
			else
				noSatisfy = noSatisfy+RAIN+"\t";
			System.out.println(satisfy);
			System.out.println(noSatisfy);
			
			//Strategy B
			satisfy = "\t Satisfy: ";
			noSatisfy = "\t Do not satisfy: ";
			System.out.println("Strategy B:");
			if (day.equals("day"))
				satisfy = satisfy+DAY+"\t";
			else
				noSatisfy = noSatisfy+DAY+"\t";
			if (soldiers>10000)
				satisfy = satisfy+SOLDIERS2+"\t";
			else
				noSatisfy = noSatisfy+SOLDIERS2+"\t";
			System.out.println(satisfy);
			System.out.println(noSatisfy);
			
			//Strategy C
			satisfy = "\t Satisfy: ";
			noSatisfy = "\t Do not satisfy: ";
			System.out.println("Strategy C:");
			if (day.equals("night"))
				satisfy = satisfy+NIGHT+"\t";
			else
				noSatisfy = noSatisfy+NIGHT+"\t";
			if (soldiers>0)
				satisfy = satisfy+SOLDIERS3+"\t";
			else
				noSatisfy = noSatisfy+SOLDIERS3+"\t";
			if (poison)
				satisfy = satisfy+POISON+"\t";
			else
				noSatisfy = noSatisfy+POISON+"\t";
			System.out.println(satisfy);
			System.out.println(noSatisfy);
			
			/* Here the new code for exercise 4 */
			//Randomly selecting the strategy: A --> 1 B --> 2 C--> 3
			int strategy = (int)(Math.random()*3)+1;
			//Variables to store the required elements
			int reqSoldiers = 0, reqSiege = 0;
			boolean reqPoison = false;
			//Depending on the strategy we will need different quantities of them
			switch (strategy){
			case 1: System.out.println("Strategy A");
			//As we initialized the variables before the switch we don't need
			//to initialize all of them here, just to change the values accordingly
			//to the strategy
					reqSoldiers = 500 - soldiers;
					reqSiege = 50 - engines;
					break;
			case 2: System.out.println("Strategy B");
					reqSoldiers = 10000 - soldiers;
					break;
			case 3: System.out.println("Strategy C");
					reqPoison = true;
					reqSoldiers = 1 - soldiers;
			}
			/*We assume we only have money, no raw material is available*/
			int money = 100_000;
			int herbs = 0;
			int wood = 0;
			int  iron = 0;
			
			//Buying soldiers, the loop will only be executed if reqSoldiers > 0
			// and if there is money enough to keep buying soldiers
			//We declare boughtSoldiers outside the loop as we will need its value later
			int boughtSoldiers;
			for (boughtSoldiers=0; boughtSoldiers<reqSoldiers && money>=10; boughtSoldiers++){
				System.out.println("1 soldier was bought, 10 golden coins were used");
				money = money - 10;
				//for every 5 soldiers bought, we obtain 10 wood units
				if (boughtSoldiers%5==0) {
					wood = wood +10;
				}
			}
			//Buying siege machines
			//First buying raw material
			//Declared outside the loop as we will use them later
			int totalWoodNeeded = reqSiege *200;
			int totalIronNeeded = reqSiege * 50;
			for (; wood<totalWoodNeeded && money>=10; wood=wood+20){
				System.out.println("20 wood units were bought. 10 golden coins were used.");
				money -= 10;
			}
			for (; iron<totalIronNeeded && money>=10; iron=iron+5){
				System.out.println("5 iron units were bought. 10 golden coins were used.");
				money -= 10;
			}
			int boughtSiege;
			for (boughtSiege=0; boughtSiege < reqSiege && wood >0 && iron >0; boughtSiege++){
				System.out.println("1 siege machine was bought. 200 wood units and 50 iron units were used.");
				wood-=200;
				iron-=50;
			}
			//Now the poison
			if (reqPoison) {
				int totalHerbs = 50;
				totalWoodNeeded = 100 - wood;
				//Again buying the raw material
				for (; wood<totalWoodNeeded && money>=10; wood=wood+20){
					System.out.println("20 wood units were bought. 10 golden coins were used.");
					money -= 10;
				}
				for (; herbs<totalHerbs && money>=10; herbs=herbs+10){
					System.out.println("10 herbs were bought. 10 golden coins were used.");
					money -= 10;
				}
				//We only need to buy 1 poison, so we don´t use a loop
				if (wood>=totalWoodNeeded && herbs >= totalHerbs && money >= 100)
					reqPoison = false;
			}
			//If we didn't buy enough, is because we ran out of money
			if (boughtSoldiers < reqSoldiers || boughtSiege < reqSiege || reqPoison == true) {
					System.out.println("We ran out of money, no battle today");
				}
			else {
				//To convert 1,2,3 to A,B,C we add 64 to the number and cast it to char (A is 65)
				System.out.println("Now you are ready for the battle. Just follow the strategy: "+(char)(64+strategy));
				System.out.println("Available money: "+money);
			}
			sc.close();
		}
	}
}