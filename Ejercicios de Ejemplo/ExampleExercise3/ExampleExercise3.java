package exampleExercises;

public class ExampleExercise3 {

	public static void main(String[] args) {
		int []stannisSoldiers= new int[10000]; //He attacks
		int []lannistersSoldiers=new int[3200];//He defends
		int deadL=0, deadS=0;
		for (int ii=0; ii<stannisSoldiers.length;ii++){
			stannisSoldiers[ii]=(int) (Math.random()*41+10);
		}
		for (int ii=0; ii<lannistersSoldiers.length; ii++){
			lannistersSoldiers[ii]= (int) (Math.random()*41+10)+25;
		}
		for (int rounds=1; rounds<=3; rounds++){
			System.out.println("The result for the round "+rounds+" was:");
		for(int ii=0;ii<stannisSoldiers.length;ii++){
			int num=(int)(Math.random()*3200);
			if(stannisSoldiers[ii]<lannistersSoldiers[num]){
				stannisSoldiers[ii]=0;
				lannistersSoldiers[num]=lannistersSoldiers[num]/3;
				deadS++;
			}
			else if(stannisSoldiers[ii]>lannistersSoldiers[num]){
				stannisSoldiers[ii]=stannisSoldiers[ii]/3;
				lannistersSoldiers[num]=0;
				deadL++;
			}
			else{
				stannisSoldiers[ii]=0;
				lannistersSoldiers[num]=lannistersSoldiers[num]/3;
			}
		}
				
		System.out.println("Stannis : "+(stannisSoldiers.length - deadS)+" alive soldiers.");
		System.out.println("Lannisters : "+(lannistersSoldiers.length - deadL)+" alive soldiers.");
		System.out.println();
		}
		if(deadS==stannisSoldiers.length){
			System.out.println("End of the battle. Stannis won.");
		}
		else System.out.println("End of the battle. Lannisters won.");
	}

}



//As solved by the teacher


/*package year16_17.guided;
/**
 * @author Nerea Luis Mingueza & Angel Garcia Olaya. PLG-UC3M
 * @version 1.0
 * @since October 2016
 * Example implementation for the Guided Exercise 3
 *
 */
/*
public class Exercise3 {

	public static void main(String[] args) {
		//Both armies will be represented using arrays
		byte [] stannis = new byte [10000];
		byte [] lannister = new byte [3200];
		//Creating the power of each soldier
		for (int ii=0; ii<stannis.length; ii++){
			stannis[ii] = (byte)(Math.random()*41+10);
		}
		for (int ii=0; ii<lannister.length; ii++){
			lannister[ii] = (byte)(Math.random()*41+10+25);
		}
		//fighting
		int stannisCasualties = 0, lannisterCasualties = 0, rounds = 0;
		//Main loop for all the battles
		while (stannisCasualties<stannis.length  && lannisterCasualties<lannister.length){
			rounds++;
			int currentDefender;
			//This loop ensures each Stannis' soldier will fight
			for (int ii=0; ii<stannis.length; ii++){
				//First we check the attacker is still alive and there are still defenders
				if (stannis[ii]>0 && lannisterCasualties<lannister.length) {
					//looking randomly for a non-dead defender
					boolean foundDefender = false;
					do  {
						currentDefender = (int) (Math.random()*3200); 
						if (lannister[currentDefender] > 0) {
							foundDefender = true;
						}
					}
					while (!foundDefender);
					//fighting
					if (stannis[ii]>lannister[currentDefender]){
						stannis[ii] = (byte) (stannis[ii]-lannister[currentDefender]/3);
						lannister[currentDefender]=0;
						lannisterCasualties++;
					}
					else {
						lannister[currentDefender]=(byte)(lannister[currentDefender]-stannis[ii]/3);
						stannis[ii] = 0; 
						stannisCasualties++;
					}
				}
			}
			//Printing
			System.out.println("End of wave "+rounds);
			System.out.println("Stannis: "+(stannis.length-stannisCasualties)+" alive soldiers");
			System.out.println("Lannister: "+(lannister.length-lannisterCasualties)+" alive soldiers");
		}
		if (stannisCasualties==stannis.length){
			System.out.println("End of the battle. Lannister Won");
		}
		else {
			System.out.println("End of the battle. Stannis Won");
		}
	}

}
*/