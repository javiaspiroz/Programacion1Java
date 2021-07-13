package week5;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise6 {

	public static void main(String[] args) {
		int times=0, result1=0, result2=0, result3=0;
		while(times<10){
		int player1=(int) (Math.random()*2), player2=(int) (Math.random()*2), player3=(int) (Math.random()*2);
		//0=TAIL & 1=HEAD
		times=times+1;
		System.out.println("The round "+times+" result has been:");
		if (player1==0){
		System.out.println("Player 1 has got TAIL");	
		}
		else {
		System.out.println("Player 1 has got HEAD");	
		}
		if (player2==0){
		System.out.println("Player 2 has got TAIL");	
		}
		else {
		System.out.println("Player 2 has got HEAD");	
		}
		if (player3==0){
		System.out.println("Player 3 has got TAIL");	
		}
		else {
		System.out.println("Player 3 has got HEAD");	
		}
		if (player1==player2 && player1==player3){
		System.out.println("The round "+times+" has ended with a tie");	
		}
		else if (player1==player2){
		System.out.println("Player 3 has been the winner for the round "+times);
		result3++;
		}
		else if (player1==player3){
		System.out.println("The player 2 has been the winner for the round "+times);
		result2++;
		}
		else {
		System.out.println("The player 1 has been the winner for the round "+times);
		result1++;
		}
		System.out.println();
		System.out.println("The current score is:");
		System.out.println("Player 1 --> "+result1+" points");
		System.out.println("Player 2 --> "+result2+" points");
		System.out.println("Player 3 --> "+result3+" points");
		System.out.println();
		}
		if (result1>result2 && result1>result3){
		System.out.println("The winner is the player 1 with "+result1+" points");	
		}
		else if (result3>result2 && result3>result1){
		System.out.println("The winner is the player 3 with "+result3+" points");	
		}
		else if (result2>result1 && result2>result3){
		System.out.println("The winner is the player 2 with "+result2+" points");	
		}
		else if (result1==result2){
		System.out.println("Players 1 and 2 have tied with "+result1+" points each one.");	
		}
		else if (result1==result3){
		System.out.println("Players 1 and 3 have tied with "+result1+" points each one.");	
		}
		else {
		System.out.println("Players 2 and 3 have tied with "+result2+" points each one.");
		}
	}

}