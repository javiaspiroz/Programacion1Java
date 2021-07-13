package week8;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Exercise6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
        int best_1 = 0, best_2 = 0;
        System.out.println("Introduce number of rolls per player");
        int roll = sc.nextInt();
        System.out.println("Introduce player 1 name");
        String name = sc.next();
        System.out.println("Introduce player 2 name");
        String name2 = sc.next();
        Dice player_1 = new Dice(name, roll);
        Dice player_2 = new Dice(name2, roll);
        //Duplicated in player 1:
        for (int ii = 0; ii < roll; ii++){
            if (player_1.rolls[ii] == 1){
                one += 1;
                if (one > best_1){
                    best_1 = one;
                }
            } else if (player_1 .rolls[ii] == 2){
                two += 1;
                if (two > best_1){
                    best_1 = two;
                }
            } else if (player_1.rolls[ii] == 3){
                three += 1;
                if (three > best_1){
                    best_1 = three;
                }
            } else if (player_1.rolls[ii] == 4){
                four += 1;
                if (four > best_1){
                    best_1 = four;
                }
            } else if (player_1.rolls[ii] == 5){
                five += 1;
                if (five > best_1){
                    best_1 = five;
                }
            } else {
                six += 1;
                if (six > best_1){
                    best_1 = six;
                }
            }
        }
        one = 0; two = 0; three = 0; four = 0; five = 0; six = 0;
        for (int ii = 0; ii < roll; ii++){
            if (player_2.rolls[ii] == 1){
                one += 1;
                if (one > best_2){
                    best_2 = one;
                }
            } else if (player_2 .rolls[ii] == 2){
                two += 1;
                if (two > best_2){
                    best_2 = two;
                }
            } else if (player_2.rolls[ii] == 3){
                three += 1;
                if (three > best_2){
                    best_2 = three;
                }
            } else if (player_2.rolls[ii] == 4){
                four += 1;
                if (four > best_2){
                    best_2 = four;
                }
            } else if (player_2.rolls[ii] == 5){
                five += 1;
                if (five > best_2){
                    best_2 = five;
                }
            } else {
                six += 1;
                if (six > best_2){
                    best_2 = six;
                }
            }
        }
        System.out.println();
        if(best_1 > best_2){
            System.out.println("Player 1 wins");
        } else if (best_1 < best_2){
            System.out.println("Player 2 wins");
        } else {
            if (player_1.totalScore > player_2.totalScore){
                System.out.println("Player 1 wins by total score");
            } else if (player_1.totalScore < player_2.totalScore) {
                System.out.println("Player 2 wins by total score");
            } else {
                System.out.println("Game ended in a tie!");
            }
        }
        sc.close();
    }
}
