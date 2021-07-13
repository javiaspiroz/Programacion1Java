/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since December 2016
 * @version 1.0
 *
 */

public class Player {
	/**
	 * 
	 * The characteristics of the player are added and its initial values: @param health, @param maxHealth, @param power, @param perception, @param gold and @param food
	 * This characteristics of the player are also set to the reach values smaller than its minimum values with the setters
	 * @param x,y,z are added to control the position of the player inside the dungeon
	 * 
	 */
	private int health=10, maxHealht=10, power=1, perception=1, gold=0, food=100, x, y, z;
	public int getHealth(){
		return this.health;
	}
	//Setters and getters for player's characteristics
	public void setHealth(int health){
		if(health<0){
			this.health=0;
		}
		else{
			this.health=health;
		}
	}
	public int getMaxHealth(){
		return this.maxHealht;
	}
	public void setMaxHealth(int maxHealth){
		if(maxHealth<10){
			this.maxHealht=10;
		}
		else{
			this.maxHealht=maxHealth;
		}
	}
	public int getPower(){
		return power;
	}
	public void setPower(int power){
		if (power<1){
			this.power=1;
		}
		else{
			this.power=power;
		}
	}
	public int getPerception(){
		return perception;
	}
	public void setPerception(int perception){
		if (perception<1){
			this.perception=1;
		}
		else{
			this.perception=perception;
		}
	}
	public int getGold(){
		return gold;
	}
	public void setGold(int gold){
		if (gold<0){
			this.gold=0;
		}
		else{
			this.gold=gold;
		}
	}
	public int getFood(){
		return food;
	}
	public void setFood(int food){
		if (food<0){
			this.food=0;
		}
		else{
			this.food=food;
		}
	}
	//Setters and getters for coordinates of the players
	public void setZ(int z){
		this.z=z;
	}
	public int getZ (){
		return z;
	}
	public int getX (){
		return x;
	}
	public int getY (){
		return y;
	}
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
}