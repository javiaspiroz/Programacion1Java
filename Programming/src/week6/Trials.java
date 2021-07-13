package week6;

import java.util.Scanner;

public class Trials {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//1st way, doesn't work
		/*int []array=new int[100];
		String answer;
		int cntr=0, check=0;
		do{
			int random=(int)(Math.random()*100)+1;
			System.out.println("Is "+random+" your number?(yes/no)");
			while (array[random-1]!=0){
				System.out.println("This number is repeated");
				random=(int)(Math.random()*100)+1;
				System.out.println("Is "+random+" your number?(yes/no)");
			}
			if(array[random-1]==0){
				array[random-1]=1;
			}
		}*/
		//2nd, doesn't work too
		/*int n1= (int)(Math.random()*100)+1;
		System.out.println("Is "+n1+" your number?(true/false)");
		boolean n=sc.nextBoolean();
		int i=1, num=0;
		int[]array=new int[i];
		if(n==true){
			System.out.println("Ifound the number in 1 attemp.");
		}
		while(n==false){
			i++;
			int n2=(int)(Math.random()*100)+1;
			System.out.println("Is "+n2+" your number?(true/false)");
			n=sc.nextBoolean();
			num=n2;
			array[i]=num;
			if(n==true && array[i]==n2){
				System.out.println("You're lying");
			}
		}*/
		//3rd, I think is not valid because we can't ask the user for a number.
		byte[]array=new byte[100];
		System.out.println("Please, introduce a number between 1 and 100");
		byte num=sc.nextByte(), tries=0, random;
		for(int ii=0;ii<array.length; ii++){
			array[ii]=(byte)(ii+1);
		}
		do{
			random=(byte) ((Math.random()*100)+1);
			if(array[random]!=0)
				tries++;
				System.out.println("Is "+array[random]+" your number?(true/false)");
				boolean answer=sc.nextBoolean();
				if(num==array[random] && answer==false){
					System.out.println("You're lying! The number was "+num+" and I guessed it in "+tries+" tries.");
				}
				else if(num==array[random] && answer==true){
					System.out.println("I guessed it and it took me "+tries+" tries.");
				}
				else if (num!=array[random] && answer==true){
					System.out.println("You're lying, but I'll keep trying.");
					array[random]=0;
				}
				else{
					System.out.println("I'll keep trying.");
					array[random]=0;
				}
				
		}
		while(num!=array[random]);
		sc.close();
	}

}
