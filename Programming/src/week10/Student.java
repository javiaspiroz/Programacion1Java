package week10;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Student {
	private String name;
	private String surname;
	private float programming;
	private float algebra;
	private float calculus;
	private float physics;
	private float information;
	private float writing;
	public Student (String name, String surname, float programming, float algebra, float calculus, float physics, float information, float writing){
		if (programming<0 || programming>10){
			this.programming=0;
		}
		else{
			this.programming=programming;
		}
		if (algebra<0 || algebra>10){
			this.algebra=0;
		}
		else{
			this.algebra=algebra;
		}
		if (calculus<0 || calculus>10){
			this.calculus=0;
		}
		else{
			this.calculus=calculus;
		}
		if (physics<0 || physics>10){
			this.physics=0;
		}
		else{
			this.physics=physics;
		}
		if (information<0 || information>10){
			this.information=0;
		}
		else{
			this.information=information;
		}
		if (writing<0 || writing>10){
			this.writing=0;
		}
		else{
			this.writing=writing;
		}
		
	}
	//Setters and Getters
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getProgramming(){
		return programming;
	}
	public void setProgramming (float programming){
		this.programming=programming;
	}
	public float getAlgebra(){
		return algebra;
	}
	public void setAlgebra (float algebra){
		this.algebra=algebra;
	}
	public float getCalculus(){
		return calculus;
	}
	public void setCalculus (float calculus){
		this.calculus=calculus;
	}
	public float getPhyics(){
		return physics;
	}
	public void setPhysics (float physics){
		this.physics=physics;
	}
	public float getInformation(){
		return information;
	}
	public void setInformation (float information){
		this.information=information;
	}
	public float getWriting(){
		return writing;
	}
	public void setWriting (float writing){
		this.writing=writing;
	}
}
