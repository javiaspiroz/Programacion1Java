package week8;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

class Dice {
    String name;
    Byte[] rolls;
    int totalScore;

    Dice(String name, int roll) {
        this.name = name;
        rolls = new Byte[roll];
        System.out.println("");
        System.out.println("");
        System.out.println(name + "'s rolls:");
        for (int ii = 0; ii < roll; ii++) {
            byte score = (byte) ((Math.random() * 6) + 1);
            System.out.println("Roll " + (ii+1) + " result: " + score);
            rolls[ii] = score;
            totalScore += score;
        }
    }
}
