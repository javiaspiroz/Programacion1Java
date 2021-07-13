package week11;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Rectangle {
	private double base, height, maxSide;
	private boolean square;
	public Rectangle(double base, double height){
		setBase(base);
		setHeight(height);
		setSquare();
	}
	public void setBase (double base){
		if (base<=0){
			this.base=1.0;
		}
		else this.base=base;
	}
	public void setHeight (double height){
		if (height<=0){
			this.height=1.0;
		}
		else this.height=height;
	}
	public void setSquare (){
		if (base==height){
			this.square=true;
		}
		else this.square=false;
	}
	//Despite it's created we are not forced to use it.
	public boolean equals (Rectangle object){
		boolean result;
		if (this.base==object.base && this.height==object.height){
			result=true;
		}
		else if (this.base==object.height && this.height==object.base){
			result=true;
		}
		else result=false;
		return result;
	}
	public double getArea (){
		double area=height*base;
		return area;
	}
	public double getPerimeter (){
		double perimeter=(2*base)+(2*height);
		return perimeter;
	}
	public double getSide(){
		if (this.base>=this.height){
			maxSide=base;
		}
		if (this.base<this.height){
			maxSide=height;
		}
		return maxSide;
	}
	public String toString(){
		if(square==true){
			return "This is a square of "+base+"x"+height;
		}
		else{
			 return "This is a rectangle of "+base+"x"+height;
		}
	}
	public boolean isSquare(){
		return square;
	}
	
}
