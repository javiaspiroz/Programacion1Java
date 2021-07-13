package week4;
import java.util.Scanner;
public class Exercise10 {

	public static void main(String[] args) {
		System.out.println("Enter only one character of the keybord.");
		Scanner sc=new Scanner(System.in);
		String character = sc.next();
		if (character.length()==1){
		switch (character){
		case "0":
			break;
		case "1": 
		case "2":
		case "3": 
		case "4":
		case "5": 
		case "6": 
		case "7": 
		case "8":
		case "9":System.out.println("It is a number.");
		break;
		default: System.out.println("It is not a number.");
		
		
			
		}
		}
		else {
			System.out.println("You must introduce only one character of the keybord");
		}
		sc.close();

	}

}
