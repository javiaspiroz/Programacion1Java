package week12;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name and strategy of player 1:");
		Player p1 = new Player(sc.next(), sc.next());
		System.out.println("Enter the name and strategy of player 2:");
		Player p2 = new Player(sc.next(), sc.next());
		String winningElection="Rock";
		while(p1.getRound()<p1.getObject().length){
			p1.choosing(winningElection);
			p2.choosing(winningElection);
			if(p1.getObjectChoice(p1.getRound()).equals("Rock")){
				if(p2.getObjectChoice(p2.getRound()).equals("Paper")){
					p2.setScore((byte) (p2.getScore()+1));
					winningElection = "Paper";
				}
				else if(p2.getObjectChoice(p2.getRound()).equals("Scissors")){
					p1.setScore((byte) (p1.getScore()+1));
					winningElection = "Rock";
				}
				else{
					winningElection = "Rock";
				}
			}
			else if(p1.getObjectChoice(p1.getRound()).equals("Paper")){
				if(p2.getObjectChoice(p2.getRound()).equals("Scissors")){
					p2.setScore((byte) (p2.getScore()+1));
					winningElection = "Scissors";
				}
				else if(p2.getObjectChoice(p2.getRound()).equals("Rock")){
					p1.setScore((byte) (p1.getScore()+1));
					winningElection = "Paper";
				}
				else{
					winningElection = "Paper";
				}
			}
			else{
				if(p2.getObjectChoice(p2.getRound()).equals("Rock")){
					p2.setScore((byte) (p2.getScore()+1));
					winningElection = "Rock";
				}
				else if(p2.getObjectChoice(p2.getRound()).equals("Paper")){
					p1.setScore((byte) (p1.getScore()+1));
					winningElection = "Scissors";
				}
				else{
					winningElection = "Scissors";
				}
			}
			p1.setRound((byte) (p1.getRound()+1));
			p2.setRound((byte) (p2.getRound()+1));
		}
		System.out.println("Player 1: "+p1.getScore()+" Points");
		System.out.println("Player 2: "+p2.getScore()+" Points");
		if(p1.getScore()>p2.getScore()){
			System.out.println("Player 1 wins");
		}
		else if(p1.getScore()<p2.getScore()){
			System.out.println("Player 2 wins");
		}
		else{
			System.out.println("Tie");
		}	
		sc.close();
	}
}