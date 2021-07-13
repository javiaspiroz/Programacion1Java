package week10;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Student2 {
	private String name, surname;
	private float[] marks=new float[6];
	public Student2(String name, String surname, float marks){
		for(int ii=0; ii<6;ii++){
			if (marks<0 || marks>10){
				this.marks[ii]=0;
			}
			else this.marks[ii]=marks;
		}
	}
	public String getName(){
		return this.name;
	}
	public String getSurname(){
		return this.surname;
	}
	public void setName (String name){
		this.name=name;
	}
	public void setSurname (String surname){
		this.surname=surname;
	}
	public float getMarks(){
		for(int ii=0; ii<6;){
			return this.marks[ii];
		}
		return 0;
	}
	public void setMarks (float marks){
		for(int ii=0; ii<6;ii++){
			this.marks[ii]=marks;
		}
	}
}
