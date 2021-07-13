package week13;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Ar�n Tejada
 * @since December 2016
 * @version 1.0
 *
 */

public class Student {
	private String name, surname;
	public String getName(){
		return name;
	}
	public String getSurname(){
		return surname;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setSurname (String surname){
		this.surname=surname;
	}
	public String toString(){
		name.toUpperCase();
		surname.toUpperCase();
		name.replace("�", "A");
		name.replace("�", "E");
		name.replace("�", "I");
		name.replace("�", "O");
		name.replace("�", "U");
		name.replace("�", "a");
		name.replace("�", "e");
		name.replace("�", "i");
		name.replace("�", "o");
		name.replace("�", "u");
		surname.replace("�", "A");
		surname.replace("�", "E");
		surname.replace("�", "I");
		surname.replace("�", "O");
		surname.replace("�", "U");
		surname.replace("�", "a");
		surname.replace("�", "e");
		surname.replace("�", "i");
		surname.replace("�", "o");
		surname.replace("�", "u");
		if (surname.length()>15){
			surname.split(surname, 0);
		}
		return name+" "+surname;
	}
	public boolean equals (Student object){
		boolean result;
		if (name==object.name || name.toLowerCase()==object.name || name.toUpperCase()==object.name){
			result=true;
		}
		else result=false;
		return result;
	}
	public Student(String name, String surname){
		setName(name);
		setSurname(surname);
	}
}
