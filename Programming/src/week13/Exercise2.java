package week13;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since December 2016
 * @version 1.0
 *
 */

public class Exercise2 {

	public static void main(String[] args) {
		ProgrammingClass p1=new ProgrammingClass();
		/*pr1.students[0].setName("Luis");
		pr1.students[1].setName("Antonio");
		pr1.students[2].setName("Jorge");
		pr1.students[3].setName("Pablo");
		pr1.students[4].setName("David");
		pr1.students[0].setSurname("Saavedra");
		pr1.students[1].setSurname("Aspiroz");
		pr1.students[2].setSurname("Calle");
		pr1.students[3].setSurname("Olaya");
		pr1.students[4].setSurname("Hoyos");*/
		/*Student st1=new Student("Marcos", "Llorente");
		Student st2=new Student("Luis", "Saavedra");
		Student st3=new Student("Antonio", "Aspiroz");
		Student st4=new Student("Jorge", "Calle");
		Student st5=new Student("Pablo", "Olaya");
		Student st6=new Student("David", "Hoyos");
		pr1.students[0].setName(null);
		//pr1.students[0].getSurname();
		
		pr1.equals(st6);*/
		//By teacher
		p1.addStudent (new Student("Rodrigo","Morales Sanchez"));
		p1.addStudent (new Student("Jorge","Moreno Velez"));
		p1.addStudent (new Student("Diego","Morales de la Rueda"));
		p1.addStudent (new Student("Elsa","IHaveAReallyLongSurnameIMustBeGermanOrSomethingSimilar"));
		p1.addStudent (new Student("Dolores","Delicado Gomez"));
		Student stu6 = new Student ("Booker", "DeWitt Martinez");		
		
		System.out.println(p1);
		
		int position=p1.search(stu6);
		if (position!=-1){
			System.out.println(stu6 +" is at position: "+position);
		}
		else{
			System.out.println("Sorry, "+stu6+" is not here");
		}
	}
}