package week13;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since December 2016
 * @version 1.0
 *
 */

public class Product {
	private String name;
	private int stock;
	private float price;
	public void setName (String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setStock (int stock){
		if (stock>=0)
			this.stock = stock;
		else
			this.stock = 0;
	}
	public int getStock(){
		return stock;
	}
	public void setPrice (float price){
		if (price>=0)
			this.price = price;
		else
			this.price = 0;
	}
	public float getPrice(){
		return price;
	}
	public String toString(){
		return "We have "+stock+" of "+name+" and it costs "+price+"€";
	}
	public boolean equals (Product object){
		boolean result;
		if (name==object.name){
			result=true;
		}
		else result=false;
		return result;
	}
	public Product(String name, int stock, float price){
		setName(name);
		setStock(stock);
		setPrice(price);
	}
}