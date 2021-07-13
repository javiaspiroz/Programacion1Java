import minidungeon.MiniDungeonGUI;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since December 2016
 * @version 1.0
 *
 */

public class Main {

	public static void main(String[] args) throws InterruptedException {
		//We create the board and set its dimensions
		MiniDungeonGUI board =new  MiniDungeonGUI(20, 20);
		board.setVisible(true);
		board.md_setPortraitPlayer("portrait.jpg");
		board.md_setTextPlayerName("Unknown");
		board.md_println("Unknown has entered the game");
		//We create the auxiliary boards and player to control the position depending on the levels
		Board board2=new Board(1);
		Board board3=new Board(2);
		Board board4=new Board(3);
		Board board5=new Board(4);
		Player p1=new Player();
		//We set it to 1, the first level of our game
		board2.levels=1;
		//The corridors are designed on the matrixes of the board class
		//We print the board for the first level
		for (int ii=0; ii<20; ii++){
			for (int jj=0; jj<20; jj++){
				//Everything different to 0 will be accessible and printed with white
				if (board2.dimensions[ii][jj]!=0){
					board.md_setSquareColor(ii, jj, 255, 255, 255);
				}
				//If it is 0, a black square will be printed
				else{
					board.md_setSquareColor(ii, jj, 0, 0, 0);
				}
			}
		}
		//We print the elevators for level 1
		if(board2.levels==1){
			board.md_setSquareColor(11, 10, 0, 255, 0);
		}
		//We add the image for the player
		//We should check that the player appears in a accessible square, but as it is not random, it is not needed
		board.md_addSprite(1, "black-knight.png" , true);
		//Make player visible
		board.md_setSpriteVisible(1, true);
		//Creating objects for levels, first number is the floor, second the number of this object in this floor
		//Level 1
		Object sword1=new Object(12,15,1);
		board.md_addSprite(2, "sword.png", false);
		board.md_moveSprite(2, 12, 15);
		board.md_setSpriteVisible(2, true);
		Object heart1=new Object(1,19,1);
		board.md_addSprite(3, "heart.png", false);
		board.md_moveSprite(3, 1, 19);
		board.md_setSpriteVisible(3, true);
		Object apple11=new Object(15,19,1);
		board.md_addSprite(4, "apple.png", false);
		board.md_moveSprite(4, 15, 19);
		board.md_setSpriteVisible(4, true);
		Object apple12=new Object(2,15,1);
		board.md_addSprite(5, "apple.png", false);
		board.md_moveSprite(5, 2, 15);
		board.md_setSpriteVisible(5, true);
		Object apple13=new Object(9,11,1);
		board.md_addSprite(6, "apple.png", false);
		board.md_moveSprite(6, 9, 11);
		board.md_setSpriteVisible(6, true);
		Object potion11=new Object(2,10,1);
		board.md_addSprite(7, "potion.png", false);
		board.md_moveSprite(7, 2, 10);
		board.md_setSpriteVisible(7, true);
		Object potion12=new Object(15,13,1);
		board.md_addSprite(8, "potion.png", false);
		board.md_moveSprite(8, 15, 13);
		board.md_setSpriteVisible(8, true);
		//For the other levels we do not need to make them visible now
		//Level 2
		Object potion22=new Object(19,9,2);
		Object potion21=new Object(11,3,2);
		Object apple23=new Object(7,8,2);
		Object apple22=new Object(4,15,2);
		Object apple21=new Object(15,18,2);
		Object heart2=new Object(1,10,2);
		Object sword2=new Object(10,0,2);
		board.md_addSprite(10, "sword.png", false);
		board.md_addSprite(11, "heart.png", false);
		board.md_addSprite(12, "apple.png", false);
		board.md_addSprite(13, "apple.png", false);
		board.md_addSprite(14, "apple.png", false);
		board.md_addSprite(15, "potion.png", false);
		board.md_addSprite(16, "potion.png", false);
		//Level 3
		Object potion32=new Object(5,19,3);
		Object potion31=new Object(0,16,3);
		Object apple33=new Object(12,19,3);
		Object apple32=new Object(18,6,3);
		Object apple31=new Object(1,8,3);
		Object heart3=new Object(18,19,3);
		Object sword3=new Object(10,6,3);
		Object eye3=new Object(12,2,3);
		board.md_addSprite(27, "eye.png", false);
		board.md_addSprite(20, "sword.png", false);
		board.md_addSprite(21, "heart.png", false);
		board.md_addSprite(22, "apple.png", false);
		board.md_addSprite(23, "apple.png", false);
		board.md_addSprite(24, "apple.png", false);
		board.md_addSprite(25, "potion.png", false);
		board.md_addSprite(26, "potion.png", false);
		//Level 4
		Object potion42=new Object(6,11,4);
		Object potion41=new Object(6,9,4);
		Object apple43=new Object(19,19,4);
		Object apple42=new Object(0,1,4);
		Object apple41=new Object(3,0,4);
		Object heart4=new Object(3,4,4);
		Object sword4=new Object(16,10,4);
		board.md_addSprite(30, "sword.png", false);
		board.md_addSprite(31, "heart.png", false);
		board.md_addSprite(32, "apple.png", false);
		board.md_addSprite(33, "apple.png", false);
		board.md_addSprite(34, "apple.png", false);
		board.md_addSprite(35, "potion.png", false);
		board.md_addSprite(36, "potion.png", false);
		//Create coins randomly
		/*
		 * It is created just for level 1 because when we had created for the other levels, 
		 * when we passed to them the player could not move
		 */
		//Coins for level 1
		int n=50;
		Object [] coins1=new Object[5];
		for (int ii=0; ii<5; ii++){
			int ramx=(int) (Math.random()*20);
			int ramy=(int) (Math.random()*20);
			while (board2.dimensions[ramx][ramy]!=1){
				ramx=(int) (Math.random()*20);
				ramy=(int) (Math.random()*20);
				}
			if (board2.dimensions[ramx][ramy]==1){
				board2.dimensions[ramx][ramy]=7;
				coins1[ii]=new Object(ramx,ramy,1);
				board.md_addSprite(n, "gold.png", false);
				board.md_moveSprite(n, ramx, ramy);
				board.md_setSpriteVisible(n, true);
				n++;
			}
		}
		//Bosses
		//Level 1, we also make it visible here
		Enemy boss1=new Enemy(12,12,1,2,3);
		board.md_addSprite(100, "blue-king.png", false);
		board.md_moveSprite(100, boss1.getX(), boss1.getY());
		board.md_setSpriteVisible(100, true);
		//Level 2
		Enemy boss2=new Enemy(13,7,2,2,3);
		board.md_addSprite(101, "blue-king.png", false);
		board.md_moveSprite(101, boss2.getX(), boss2.getY());
		//Level 3
		Enemy boss3=new Enemy(17,0,3,2,3);
		board.md_addSprite(102, "blue-king.png", false);
		board.md_moveSprite(102, boss3.getX(), boss3.getY());
		//Level 4
		Enemy boss4=new Enemy(4,19,4,2,3);
		board.md_addSprite(103, "blue-king.png", false);
		board.md_moveSprite(103, boss4.getX(), boss4.getY());
		
		
		int size=20, counter2=0, counter3=0, counter4=0;
		boolean endOfGame=false;
		int xpos=0, ypos=0;
		while(!endOfGame){
			String command=board.md_getLastAction();
			//When we use elevators
			//Level 1 elevators to move to level 2
			if (board2.levels==1 && p1.getX()==11 && p1.getY()==10){
				board2.setLevels(2);
				board.md_setTextFloor(-1);
				board.md_println("Entering floor -1");
				for (int ii=0; ii<20; ii++){
					for (int jj=0; jj<20; jj++){
						if (board3.dimensions[ii][jj]!=0){
							board.md_setSquareColor(ii, jj, 255, 255, 255);
						}
						else{
							board.md_setSquareColor(ii, jj, 0, 0, 0);
						}
					}
				}
			}
			//We print elevators for level 2
			if(board2.levels==2){
				board.md_setSquareColor(11, 10, 255, 0, 0);
				board.md_setSquareColor(12, 3, 0, 255, 0);
			}
			//level 2 elevators to move to level 3
			if (board2.levels==2 && p1.getX()==12 && p1.getY()==3){
				board2.setLevels(3);
				board.md_setTextFloor(-2);
				board.md_println("Entering floor -2");
				for (int ii=0; ii<20; ii++){
					for (int jj=0; jj<20; jj++){
						if (board4.dimensions[ii][jj]!=0){
							board.md_setSquareColor(ii, jj, 255, 255, 255);
						}
						else{
							board.md_setSquareColor(ii, jj, 0, 0, 0);
						}
					}
				}
			}
			//We print elevators for level 3
			if(board2.levels==3){
				board.md_setSquareColor(12, 3, 255, 0, 0);
				board.md_setSquareColor(18, 1, 0, 255, 0);
			}
			//Level 3 elevators to move to level 4
			if (board2.levels==3 && p1.getX()==18 && p1.getY()==1){
				board2.setLevels(4);
				board.md_setTextFloor(-3);
				board.md_println("Entering floor -3");
				for (int ii=0; ii<20; ii++){
					for (int jj=0; jj<20; jj++){
						if (board5.dimensions[ii][jj]!=0){
							board.md_setSquareColor(ii, jj, 255, 255, 255);
						}
						else{
							board.md_setSquareColor(ii, jj, 0, 0, 0);
						}
					}
				}
			}
			//We print elevators for level 3
			if(board2.levels==4){
				board.md_setSquareColor(18, 1, 255, 0, 0);
				board.md_setSquareColor(4, 17, 0, 255, 0);
			}
			//Editing objects for  levels
			//Level 2
			if (board2.levels==2){
				if (counter2==0){
					board.md_moveSprite(10, 10, 0);
					board.md_setSpriteVisible(10, true);
					board.md_moveSprite(11, 1, 10);
					board.md_setSpriteVisible(11, true);
					board.md_moveSprite(12, 15, 18);
					board.md_setSpriteVisible(12, true);
					board.md_moveSprite(13, 4, 15);
					board.md_setSpriteVisible(13, true);
					board.md_moveSprite(14, 7, 8);
					board.md_setSpriteVisible(14, true);
					board.md_moveSprite(15, 11, 3);
					board.md_setSpriteVisible(15, true);
					board.md_moveSprite(16, 19, 9);
					board.md_setSpriteVisible(16, true);
					board.md_setSpriteVisible(101, true);
					counter2++;
				}
			}
			//Level 3
			if (board2.levels==3){
				if (counter3==0){
					board.md_moveSprite(20,10,6);
					board.md_setSpriteVisible(20, true);
					board.md_moveSprite(21,18,19);
					board.md_setSpriteVisible(21, true);
					board.md_moveSprite(22,1,8);
					board.md_setSpriteVisible(22, true);
					board.md_moveSprite(23,18,6);
					board.md_setSpriteVisible(23, true);
					board.md_moveSprite(24,12,19);
					board.md_setSpriteVisible(24, true);
					board.md_moveSprite(25,0,16);
					board.md_setSpriteVisible(25, true);
					board.md_moveSprite(26,5,19);
					board.md_setSpriteVisible(26, true);
					board.md_moveSprite(27,12,2);
					board.md_setSpriteVisible(27, true);
					board.md_setSpriteVisible(102, true);
					counter3++;
				}
			}
			//Level 4
			if (board2.levels==4){
				if (counter4==0){
					board.md_moveSprite(30,16,10);
					board.md_setSpriteVisible(30, true);
					board.md_moveSprite(31,3,4);
					board.md_setSpriteVisible(31, true);
					board.md_moveSprite(32,3,0);
					board.md_setSpriteVisible(32, true);
					board.md_moveSprite(33,0,1);
					board.md_setSpriteVisible(33, true);
					board.md_moveSprite(34,19,19);
					board.md_setSpriteVisible(34, true);
					board.md_moveSprite(35,6,9);
					board.md_setSpriteVisible(35, true);
					board.md_moveSprite(36,6,11);
					board.md_setSpriteVisible(36, true);
					board.md_setSpriteVisible(103, true);
					counter4++;
				}
			}
			//When taking objects
			//Level 1
			if (board2.levels==1){
				if (board2.dimensions[p1.getX()][p1.getY()]==2){
					p1.setMaxHealth(p1.getMaxHealth()+1);
					board.md_setTextHealthMax(p1.getMaxHealth());
					board2.dimensions[p1.getX()][p1.getY()]=1;
					board.md_println("Maximum health increased to "+p1.getMaxHealth());
				}
				if (board2.dimensions[p1.getX()][p1.getY()]==3){
					p1.setPower(p1.getPower()+1);
					board.md_setTextStrength(p1.getPower());
					board2.dimensions[p1.getX()][p1.getY()]=1;
					board.md_println("Strength increased to "+p1.getPower());
				}
				if (board2.dimensions[p1.getX()][p1.getY()]==5){
					if (p1.getHealth()+10>p1.getMaxHealth()){
						p1.setHealth(p1.getMaxHealth());
					}
					else{
						p1.setHealth(p1.getHealth()+10);
					}
					board.md_setTextHealthCurrent(p1.getHealth());
					board2.dimensions[p1.getX()][p1.getY()]=1;
					board.md_println("Health increased to "+p1.getHealth());
				}
				if (board2.dimensions[p1.getX()][p1.getY()]==6){
					p1.setFood(p1.getFood()+25);
					board.md_setTextFood(p1.getFood());
					board2.dimensions[p1.getX()][p1.getY()]=1;
					board.md_println("Food increased to "+p1.getFood());
				}
				//Coins level 1
				if (board2.dimensions[p1.getX()][p1.getY()]==7){
					p1.setGold(p1.getGold()+25);
					board.md_setTextGold(p1.getGold());
					board2.dimensions[p1.getX()][p1.getY()]=1;
					board.md_println("Gold increased to "+p1.getGold());
				}				
			}
			//Level 2
			if (board2.levels==2){
				if (board3.dimensions[p1.getX()][p1.getY()]==2){
					p1.setMaxHealth(p1.getMaxHealth()+1);
					board.md_setTextHealthMax(p1.getMaxHealth());
					board3.dimensions[p1.getX()][p1.getY()]=1;
					board.md_println("Maximum health increased to "+p1.getMaxHealth());
				}
				if (board3.dimensions[p1.getX()][p1.getY()]==3){
					p1.setPower(p1.getPower()+1);
					board.md_setTextStrength(p1.getPower());
					board3.dimensions[p1.getX()][p1.getY()]=1;
					board.md_println("Strength increased to "+p1.getPower());
				}
				if (board3.dimensions[p1.getX()][p1.getY()]==5){
					if (p1.getHealth()+10>p1.getMaxHealth()){
						p1.setHealth(p1.getMaxHealth());
					}
					else{
						p1.setHealth(p1.getHealth()+10);
					}
					board.md_setTextHealthCurrent(p1.getHealth());
					board3.dimensions[p1.getX()][p1.getY()]=1;
					board.md_println("Health increased to "+p1.getHealth());
				}
				if (board3.dimensions[p1.getX()][p1.getY()]==6){
					p1.setFood(p1.getFood()+25);
					board.md_setTextFood(p1.getFood());
					board3.dimensions[p1.getX()][p1.getY()]=1;
					board.md_println("Food increased to "+p1.getFood());
				}
			}
			//Level 3
			if (board2.levels==3){
				if (board4.dimensions[p1.getX()][p1.getY()]==2){
					p1.setMaxHealth(p1.getMaxHealth()+1);
					board.md_setTextHealthMax(p1.getMaxHealth());
					board4.dimensions[p1.getX()][p1.getY()]=1;
					board.md_println("Maximum health increased to "+p1.getMaxHealth());
				}
				if (board4.dimensions[p1.getX()][p1.getY()]==4){
					p1.setPerception(p1.getPerception()+1);
					board.md_setTextPerception(p1.getPerception());
					board4.dimensions[p1.getX()][p1.getY()]=1;
					board.md_println("Perception increased to "+p1.getPerception());
				}
				if (board4.dimensions[p1.getX()][p1.getY()]==3){
					p1.setPower(p1.getPower()+1);
					board.md_setTextStrength(p1.getPower());
					board4.dimensions[p1.getX()][p1.getY()]=1;
					board.md_println("Strength increased to "+p1.getPower());
				}
				if (board4.dimensions[p1.getX()][p1.getY()]==5){
					if (p1.getHealth()+10>p1.getMaxHealth()){
						p1.setHealth(p1.getMaxHealth());
					}
					else{
						p1.setHealth(p1.getHealth()+10);
					}
					board.md_setTextHealthCurrent(p1.getHealth());
					board4.dimensions[p1.getX()][p1.getY()]=1;
					board.md_println("Health increased to "+p1.getHealth());
				}
				if (board4.dimensions[p1.getX()][p1.getY()]==6){
					p1.setFood(p1.getFood()+25);
					board.md_setTextFood(p1.getFood());
					board4.dimensions[p1.getX()][p1.getY()]=1;
					board.md_println("Food increased to "+p1.getFood());
				}
			}
			//Level 4
			if (board2.levels==4){
				if (board5.dimensions[p1.getX()][p1.getY()]==2){
					p1.setMaxHealth(p1.getMaxHealth()+1);
					board.md_setTextHealthMax(p1.getMaxHealth());
					board5.dimensions[p1.getX()][p1.getY()]=1;
					board.md_println("Maximum health increased to "+p1.getMaxHealth());
				}
				if (board5.dimensions[p1.getX()][p1.getY()]==3){
					p1.setPower(p1.getPower()+1);
					board.md_setTextStrength(p1.getPower());
					board5.dimensions[p1.getX()][p1.getY()]=1;
					board.md_println("Strength increased to "+p1.getPower());
				}
				if (board5.dimensions[p1.getX()][p1.getY()]==5){
					if (p1.getHealth()+10>p1.getMaxHealth()){
						p1.setHealth(p1.getMaxHealth());
					}
					else{
						p1.setHealth(p1.getHealth()+10);
					}
					board.md_setTextHealthCurrent(p1.getHealth());
					board5.dimensions[p1.getX()][p1.getY()]=1;
					board.md_println("Health increased to "+p1.getHealth());
				}
				if (board5.dimensions[p1.getX()][p1.getY()]==6){
					p1.setFood(p1.getFood()+25);
					board.md_setTextFood(p1.getFood());
					board5.dimensions[p1.getX()][p1.getY()]=1;
					board.md_println("Food increased to "+p1.getFood());
				}
			}
			//Delete objects per level
			//Level 1
			if (board2.levels==1){
				if(apple11.getX()==p1.getX() && apple11.getY()==p1.getY()){
					board.md_setSpriteVisible(4, false);
				}
				if(apple12.getX()==p1.getX() && apple12.getY()==p1.getY()){
					board.md_setSpriteVisible(5, false);
				}
				if(apple13.getX()==p1.getX() && apple13.getY()==p1.getY()){
					board.md_setSpriteVisible(6, false);
				}
				if(potion11.getX()==p1.getX() && potion11.getY()==p1.getY()){
					board.md_setSpriteVisible(7, false);
				}
				if(potion12.getX()==p1.getX() && potion12.getY()==p1.getY()){
					board.md_setSpriteVisible(8, false);
				}
				if(sword1.getX()==p1.getX() && sword1.getY()==p1.getY()){
					board.md_setSpriteVisible(2, false);
				}
				if(heart1.getX()==p1.getX() && heart1.getY()==p1.getY()){
					board.md_setSpriteVisible(3, false);
				}
				//Coins level 1 
				if(coins1[0].getX()==p1.getX() && coins1[0].getY()==p1.getY()){
					board.md_setSpriteVisible(50, false);
				}
				if(coins1[1].getX()==p1.getX() && coins1[1].getY()==p1.getY()){//falla
					board.md_setSpriteVisible(51, false);
				}
				if(coins1[2].getX()==p1.getX() && coins1[2].getY()==p1.getY()){
					board.md_setSpriteVisible(52, false);
				}
				if(coins1[3].getX()==p1.getX() && coins1[3].getY()==p1.getY()){
					board.md_setSpriteVisible(53, false);
				}
				if(coins1[4].getX()==p1.getX() && coins1[4].getY()==p1.getY()){
					board.md_setSpriteVisible(54, false);
				}
			}
			if (board2.levels==2 || board2.levels==3 || board2.levels==4){
				board.md_setSpriteVisible(2, false);
				board.md_setSpriteVisible(3, false);
				board.md_setSpriteVisible(4, false);
				board.md_setSpriteVisible(5, false);
				board.md_setSpriteVisible(6, false);
				board.md_setSpriteVisible(7, false);
				board.md_setSpriteVisible(8, false);
				for (int jj=50;jj<55;jj++){
					board.md_setSpriteVisible(jj, false); 
				}
			}
			//Level 2
			if (board2.levels==2){
				if(apple21.getX()==p1.getX() && apple21.getY()==p1.getY()){
					board.md_setSpriteVisible(12, false);
				}
				if(apple22.getX()==p1.getX() && apple22.getY()==p1.getY()){
					board.md_setSpriteVisible(13, false);
				}
				if(apple23.getX()==p1.getX() && apple23.getY()==p1.getY()){
					board.md_setSpriteVisible(14, false);
				}
				if(potion21.getX()==p1.getX() && potion21.getY()==p1.getY()){
					board.md_setSpriteVisible(15, false);
				}
				if(potion22.getX()==p1.getX() && potion22.getY()==p1.getY()){
					board.md_setSpriteVisible(16, false);
				}
				if(sword2.getX()==p1.getX() && sword2.getY()==p1.getY()){
					board.md_setSpriteVisible(10, false);
				}
				if(heart2.getX()==p1.getX() && heart2.getY()==p1.getY()){
					board.md_setSpriteVisible(11, false);
				}
			}
			if (board2.levels==1 || board2.levels==3 || board2.levels==4){
				board.md_setSpriteVisible(10, false);
				board.md_setSpriteVisible(11, false);
				board.md_setSpriteVisible(12, false);
				board.md_setSpriteVisible(13, false);
				board.md_setSpriteVisible(14, false);
				board.md_setSpriteVisible(15, false);
				board.md_setSpriteVisible(16, false);				
			}
			//Level 3
			if (board2.levels==3){
				if(apple31.getX()==p1.getX() && apple31.getY()==p1.getY()){
					board.md_setSpriteVisible(22, false);
				}
				if(apple32.getX()==p1.getX() && apple32.getY()==p1.getY()){
					board.md_setSpriteVisible(23, false);
				}
				if(apple33.getX()==p1.getX() && apple33.getY()==p1.getY()){
					board.md_setSpriteVisible(24, false);
				}
				if(potion31.getX()==p1.getX() && potion31.getY()==p1.getY()){
					board.md_setSpriteVisible(25, false);
				}
				if(potion32.getX()==p1.getX() && potion32.getY()==p1.getY()){
					board.md_setSpriteVisible(26, false);
				}
				if(sword3.getX()==p1.getX() && sword3.getY()==p1.getY()){
					board.md_setSpriteVisible(20, false);
				}
				if(heart3.getX()==p1.getX() && heart3.getY()==p1.getY()){
					board.md_setSpriteVisible(21, false);
				}
				if(eye3.getX()==p1.getX() && eye3.getY()==p1.getY()){
					board.md_setSpriteVisible(27, false);
				}
			}
			if (board2.levels==1 || board2.levels==2 || board2.levels==4){
				board.md_setSpriteVisible(20, false);
				board.md_setSpriteVisible(21, false);
				board.md_setSpriteVisible(22, false);
				board.md_setSpriteVisible(23, false);
				board.md_setSpriteVisible(24, false);
				board.md_setSpriteVisible(25, false);
				board.md_setSpriteVisible(26, false);
				board.md_setSpriteVisible(27, false);
			}
			//Level 4
			if (board2.levels==4){
				if(apple41.getX()==p1.getX() && apple41.getY()==p1.getY()){
					board.md_setSpriteVisible(32, false);
				}
				if(apple42.getX()==p1.getX() && apple42.getY()==p1.getY()){
					board.md_setSpriteVisible(33, false);
				}
				if(apple43.getX()==p1.getX() && apple43.getY()==p1.getY()){
					board.md_setSpriteVisible(34, false);
				}
				if(potion41.getX()==p1.getX() && potion41.getY()==p1.getY()){
					board.md_setSpriteVisible(35, false);
				}
				if(potion42.getX()==p1.getX() && potion42.getY()==p1.getY()){
					board.md_setSpriteVisible(36, false);
				}
				if(sword4.getX()==p1.getX() && sword4.getY()==p1.getY()){
					board.md_setSpriteVisible(30, false);
				}
				if(heart4.getX()==p1.getX() && heart4.getY()==p1.getY()){
					board.md_setSpriteVisible(31, false);
				}
			}
			if (board2.levels==1 || board2.levels==2 || board2.levels==3){
				board.md_setSpriteVisible(30, false);
				board.md_setSpriteVisible(31, false);
				board.md_setSpriteVisible(32, false);
				board.md_setSpriteVisible(33, false);
				board.md_setSpriteVisible(34, false);
				board.md_setSpriteVisible(35, false);
				board.md_setSpriteVisible(36, false);				
			}
			//Consequences of food reaching 0, in player class values are set the minimum values
			if(p1.getFood()==0){
				p1.setPower(p1.getPower()/2);
				board.md_setTextStrength(p1.getPower());
				p1.setPerception(p1.getPerception()/2);
				board.md_setTextPerception(p1.getPerception());
			}
			//To finish the game
			if (board2.levels==4 && xpos==4 && ypos==17 || p1.getHealth()==0){
				endOfGame=true;
				if (board2.levels==4 && xpos==4 && ypos==17){
					board.md_showMessageDialog("You have completed the game!!");
				}
				if  (p1.getHealth()==0){
					board.md_showMessageDialog("Game over, try again.");
				}
			}
			//Enemies
			//Level 1
			if (board2.levels==1 && boss1.getX()==p1.getX() && boss1.getY()==p1.getY() && boss1.getHealth()>0){
				p1.setHealth(p1.getHealth()-boss1.getPower());
				boss1.setHealth(p1.getPower()-boss1.getHealth());
				board.md_println("The boss health is reduced to "+boss1.getHealth());
				board.md_println("Unknown health is reduced to "+p1.getHealth());
				board.md_setTextHealthCurrent(p1.getHealth());
				p1.setFood(p1.getFood()-3);
				board.md_setTextFood(p1.getFood());
			}
			if (board2.levels==1 && boss1.getHealth()==0){
				board.md_setSpriteVisible(100, false);
			}
			//Level 2
			if (board2.levels==2 && boss2.getX()==p1.getX() && boss2.getY()==p1.getY() && boss2.getHealth()>0){
				p1.setHealth(p1.getHealth()-boss2.getPower());
				boss2.setHealth(p1.getPower()-boss2.getHealth());
				board.md_println("The boss health is reduced to "+boss2.getHealth());
				board.md_println("Unknown health is reduced to "+p1.getHealth());
				board.md_setTextHealthCurrent(p1.getHealth());
				p1.setFood(p1.getFood()-3);
				board.md_setTextFood(p1.getFood());
			}
			if (board2.levels==2 && boss2.getHealth()==0){
				board.md_setSpriteVisible(101, false);
			}
			//Level 3
			if (board2.levels==3 && boss3.getX()==p1.getX() && boss3.getY()==p1.getY() && boss3.getHealth()>0){
				p1.setHealth(p1.getHealth()-boss3.getPower());
				boss3.setHealth(p1.getPower()-boss3.getHealth());
				board.md_println("The boss health is reduced to "+boss3.getHealth());
				board.md_println("Unknown health is reduced to "+p1.getHealth());
				board.md_setTextHealthCurrent(p1.getHealth());
				p1.setFood(p1.getFood()-3);
				board.md_setTextFood(p1.getFood());
			}
			if (board2.levels==3 && boss3.getHealth()==0){
				board.md_setSpriteVisible(102, false);
			}
			//Level 4
			if (board2.levels==4 && boss4.getX()==p1.getX() && boss4.getY()==p1.getY() && boss4.getHealth()>0){
				p1.setHealth(p1.getHealth()-boss4.getPower());
				boss4.setHealth(p1.getPower()-boss4.getHealth());
				board.md_println("The boss health is reduced to "+boss4.getHealth());
				board.md_println("Unknown health is reduced to "+p1.getHealth());
				board.md_setTextHealthCurrent(p1.getHealth());
				p1.setFood(p1.getFood()-3);
				board.md_setTextFood(p1.getFood());
			}
			if (board2.levels==4 && boss4.getHealth()==0){
				board.md_setSpriteVisible(103, false);
			}

			//Move player
			//Level 1
			if(board2.levels==1){
				if (command.equals("right") && xpos+1<size){
					if (board2.dimensions[xpos+1][ypos]!=0){
						xpos++;
						p1.setX(xpos);
						p1.setFood((p1.getFood()-1));
						board.md_setTextFood((p1.getFood()));
					}
				}
				if (command.equals("left") && xpos-1>=0){
					if (board2.dimensions[xpos-1][ypos]!=0){
						xpos--;
						p1.setX(xpos);
						p1.setFood((p1.getFood()-1));
						board.md_setTextFood((p1.getFood()));
					}
				}
				if (command.equals("down") && ypos+1<size){
					if (board2.dimensions[xpos][ypos+1]!=0){
						ypos++;
						p1.setY(ypos);
						p1.setFood((p1.getFood()-1));
						board.md_setTextFood((p1.getFood()));
					}
				}
				if (command.equals("up") && ypos-1>=0){
					if(board2.dimensions[xpos][ypos-1]!=0){
						ypos--;
						p1.setY(ypos);
						p1.setFood((p1.getFood()-1));
						board.md_setTextFood((p1.getFood()));
					}
				}
			}
			//Level 2
			if(board2.levels==2){
				if (command.equals("right") && xpos+1<size){
					if (board3.dimensions[xpos+1][ypos]!=0){
						xpos++;
						p1.setX(xpos);
						p1.setFood((p1.getFood()-1));
						board.md_setTextFood((p1.getFood()));
					}
				}
				if (command.equals("left") && xpos-1>=0){
					if (board3.dimensions[xpos-1][ypos]!=0){
						xpos--;
						p1.setX(xpos);
						p1.setFood((p1.getFood()-1));
						board.md_setTextFood((p1.getFood()));
					}
				}
				if (command.equals("down") && ypos+1<size){
					if (board3.dimensions[xpos][ypos+1]!=0){
						ypos++;
						p1.setY(ypos);
						p1.setFood((p1.getFood()-1));
						board.md_setTextFood((p1.getFood()));
					}
				}
				if (command.equals("up") && ypos-1>=0){
					if(board3.dimensions[xpos][ypos-1]!=0){
						ypos--;
						p1.setY(ypos);
						p1.setFood((p1.getFood()-1));
						board.md_setTextFood((p1.getFood()));
					}
				}
			}
			//Level 3
			if(board2.levels==3){
				if (command.equals("right") && xpos+1<size){
					if (board4.dimensions[xpos+1][ypos]!=0){
						xpos++;
						p1.setX(xpos);
						p1.setFood((p1.getFood()-1));
						board.md_setTextFood((p1.getFood()));
					}
				}
				if (command.equals("left") && xpos-1>=0){
					if (board4.dimensions[xpos-1][ypos]!=0){
						xpos--;
						p1.setX(xpos);
						p1.setFood((p1.getFood()-1));
						board.md_setTextFood((p1.getFood()));
					}
				}
				if (command.equals("down") && ypos+1<size){
					if (board4.dimensions[xpos][ypos+1]!=0){
						ypos++;
						p1.setY(ypos);
						p1.setFood((p1.getFood()-1));
						board.md_setTextFood((p1.getFood()));
					}
				}
				if (command.equals("up") && ypos-1>=0){
					if(board4.dimensions[xpos][ypos-1]!=0){
						ypos--;
						p1.setY(ypos);
						p1.setFood((p1.getFood()-1));
						board.md_setTextFood((p1.getFood()));
					}
				}
			}
			//Level 4
			if(board2.levels==4){
				if (command.equals("right") && xpos+1<size){
					if (board5.dimensions[xpos+1][ypos]!=0){
						xpos++;
						p1.setX(xpos);
						p1.setFood((p1.getFood()-1));
						board.md_setTextFood((p1.getFood()));
					}
				}
				if (command.equals("left") && xpos-1>=0){
					if (board5.dimensions[xpos-1][ypos]!=0){
						xpos--;
						p1.setX(xpos);
						p1.setFood((p1.getFood()-1));
						board.md_setTextFood((p1.getFood()));
					}
				}
				if (command.equals("down") && ypos+1<size){
					if (board5.dimensions[xpos][ypos+1]!=0){
						ypos++;
						p1.setY(ypos);
						p1.setFood((p1.getFood()-1));
						board.md_setTextFood((p1.getFood()));
					}
				}
				if (command.equals("up") && ypos-1>=0){
					if(board5.dimensions[xpos][ypos-1]!=0){
						ypos--;
						p1.setY(ypos);
						p1.setFood((p1.getFood()-1));
						board.md_setTextFood((p1.getFood()));
					}
				}
			}
			board.md_moveSprite(1, xpos, ypos);
			Thread.sleep(100);
		}
	}
}