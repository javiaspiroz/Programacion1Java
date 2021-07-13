/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since December 2016
 * @version 1.0
 * @param x, y, z to control the position of the object inside the dungeon
 * @param health and power to control the characteristics of the player when is attacked or he attacks
 *
 */

public class Enemy {
	private int x, y, z, health, power;
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
	public void setZ(int z){
		this.z=z;
	}
	public void setPower(int power){
		this.power=power;
	}
	public void setHealth(int health){
		if (health<0){
			this.health=0;
		}
		else{
			this.health=health;
		}
	}
	public int getX (){
		return x;
	}
	public int getY (){
		return y;
	}
	public int getZ (){
		return z;
	}
	public int getHealth(){
		return health;
	}
	public int getPower(){
		return power;
	}
	public Enemy(int x, int y, int z, int power, int health){
		setX(x);
		setY(y);
		setZ(z);
		setPower(power);
		setHealth(health);
	}
}