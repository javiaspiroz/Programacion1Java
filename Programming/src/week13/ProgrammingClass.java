package week13;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since December 2016
 * @version 1.0
 *
 */

public class ProgrammingClass {
	Student [] students=new Student [5];
	public ProgrammingClass(){
		
	}
	public boolean addStudent (Student st){
		//My function, the next one is done by the teacher
		/*boolean result;
		if(students[4].getName()==null && students[4].getSurname()==null){
			result=true;
			students[4].setName(st.getName());
			students[4].setSurname(st.getSurname());
		}
		else{
			result=false;
		}
		return result;*/
		//Theacher's one
		for (int ii = 0; ii < students.length; ii++) {
			if (students[ii] == null) {
				students[ii] = st;
				return true;
			}
		}
		//If we reach this, all the positions were full
		return false;
	}
	public int search (Student st){//Consider revision
		int pos=0;
		for(int ii=0; ii<5;ii++){
			if(students[ii].equals(st)/*.getSurname()==st.getName()*/){
				pos=ii;
			}
			else{
				pos=-1;
			}
		}
		return pos;		
	}
	public String toString(){
		/*String text="";
		for (int ii=0; ii<5;ii++){
			text=text+students[ii].getName()+students[ii].getSurname()+'\n';
		}
		return text;*/
		String s = "";
		for (int ii = 0; ii < students.length; ii++) {
			if (students[ii] != null) {
				s += students[ii] + "\n";
			}
		}
		return s;
	}
}
