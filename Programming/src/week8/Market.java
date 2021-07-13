package week8;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class Market {
	public String [] name=new String [10];
	public float []price=new float[10];
	public int []stock=new int[10];
	public Market(String name, float price, int stock){
		for(int ii=0; ii<10; ii++){
			if (price>=0) this.price[ii]=price;
			else this.price[ii]=0.0F;
		}
		for(int ii=0; ii<10; ii++){
			if (stock>=0) this.stock[ii]=stock;
			else this.stock[ii]=0;
		}
	}

}
