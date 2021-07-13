package week11;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Person {
	private String name;
	private int age;
	private int dni;
	private char dniLetter;
	private String gender="F";
	private double weight;
	private double height;
	//Non-argument constructor
	public Person(){
		setName(name);
		setAge(age);
		setDni(dni);
		setGender(gender);
		setWeight(weight);
		setHeight(height);
	}
	//Full constructor
	public Person (String name, int age, int dni,String gender, double weight, double height){
		setName(name);
		setAge(age);
		setDni(dni);
		setGender(gender);
		setWeight(weight);
		setHeight(height);
	}
	
	public void setName(String name){
		//Nothing must be checked
		this.name=name;
	}
	public void setAge(int age){
		if (age<0){
			this.age=18;
		}
		else this.age=age;
	}
	public void setGender(String gender){
		//Gender is preset to be Female (F) by default
		//We adjust the value for its impression
		this.gender=gender;
		if (gender.equals("m")||gender.equals("M")||gender.equals("male")){
			this.gender="Male";
		}
		if (gender.equals("f")||gender.equals("F")||gender.equals("female")){
			this.gender="Female";
		}
	}
	public void setDni(int dni){
		//Top value of an int
		if (dni<=99999999){
			this.dni=dni;
		}
		else this.dni=85964245;
		calculateDniLetter();
	}
	public void calculateDniLetter(){
		char [] value = new char [] {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		int num = dni%23;
		for (int ii = 0; ii<value.length; ii++){
			if (num==ii){
				dniLetter=value[ii];
			}
		}
	}
	public void setDniLetter(char dniLetter){
		this.dniLetter=dniLetter;
	}
	public void setWeight(double weight){
		if (weight<0){
			this.weight=0.0;
		}
		else this.weight=weight;
	}
	public void setHeight(double height){
		if (height<0){
			this.height=0.0;
		}
		else this.height=height;
	}
	public String toString(){
		String text="Person Information:"+'\n'+"Name: "+name+'\n'+"Gender: "+gender+'\n'+"Age: "+age+" years old"+'\n'+"DNI: "+dni+"-"+dniLetter+'\n'
				+"Weight: "+weight+" kg"+'\n'+"Height: "+height+" cm"+'\n';
		return text;
	}
}