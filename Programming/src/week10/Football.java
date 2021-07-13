package week10;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Football {
	private String name;
	private String surname;
	private byte age;
	private String position;
	private String team;
	public Football (String name, String surname, byte age, String position, String team){
		if (age<16 || age>50){
			this.age=25;
		}
		else {
			this.age=age;
		}
		switch (position){
		case "goalkeeper": this.position="goalkeeper";
		case "defense": this.position="defense";
		case "midfielder": this.position="midfielder";
		case "forward": this.position="forward";
			default:
				int num=(int)(Math.random()*4);
				switch (num){
				case 0: this.position="goalkeeper";
				case 1: this.position="defense";
				case 2: this.position="midfielder";
				case 3: this.position="forward";
				}
		}
	}
	//Get methods
	public String getName(){
		return this.name;
	}
	public String getSurname(){
		return this.surname;
	}
	public byte getAge(){
		return this.age;
	}
	public String getPosition(){
		return this.position;
	}
	public String getTeam(){
		return this.team;
	}
	//Set methods
	public void setName (String name){
		this.name=name;
	}
	public void setSurname (String surname){
		this.surname=surname;
	}
	public void setAge (byte age){
		this.age=age;
	}
	public void setPosition (String position){
		this.position=position;
	}
	public void setTeam (String team){
		this.team=team;
	}
}
