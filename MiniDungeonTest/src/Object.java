/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since December 2016
 * @version 1.0
 * @param x, y, z to control the position of the object inside the dungeon
 *
 */

public class Object {
	private int x, y, z;
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
	public int getX (){
		return x;
	}
	public int getY (){
		return y;
	}
	public void setZ(int z){
		this.z=z;
	}
	public int getZ (){
		return z;
	}
	public Object (int x, int y, int z){
		setX(x);
		setY(y);
		setZ(z);
	}
}