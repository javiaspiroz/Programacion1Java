package week13;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
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
		name.replace("Á", "A");
		name.replace("É", "E");
		name.replace("Í", "I");
		name.replace("Ó", "O");
		name.replace("Ú", "U");
		name.replace("á", "a");
		name.replace("é", "e");
		name.replace("í", "i");
		name.replace("ó", "o");
		name.replace("ú", "u");
		surname.replace("Á", "A");
		surname.replace("É", "E");
		surname.replace("Í", "I");
		surname.replace("Ó", "O");
		surname.replace("Ú", "U");
		surname.replace("á", "a");
		surname.replace("é", "e");
		surname.replace("í", "i");
		surname.replace("ó", "o");
		surname.replace("ú", "u");
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
