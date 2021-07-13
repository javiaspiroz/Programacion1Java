package week13;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since December 2016
 * @version 1.0
 *
 */

public class Customer {
	private String name, email, password;
	private double money;
	public void setName (String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setEmail (String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
	public void setPassword (String password){
		this.password=password;
	}
	public String getPassword(){
		return password;
	}
	public void setMoney (double money){
		if (money<0){
			this.money=0;
		}
		else this.money=money;
	}
	public double getMoney(){
		return money;
	}
	public boolean equals (Customer object){
		boolean result;
		if (name==object.name && email==object.email){
			result=true;
		}
		else result=false;
		return result;
	}
	public String toString(){
		return name+" with email "+email+" and password "+password+" has "+money+"€ lefting";
	}
	public Customer(String name, String password, String email, double money){
		setName(name);
		setPassword(password);
		setEmail(email);
		setMoney(money);
	}
}
