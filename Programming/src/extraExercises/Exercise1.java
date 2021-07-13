package extraExercises;

import java.util.Scanner;

public class Exercise1 {
	
	public static double[] parRam(int up, int low, double arr[]){
		//Checking the bounds
		if (up<low){
			int aux = up;
			up = low;
			low = aux;
		}
		//Filling the array
		for (int ii=0; ii<arr.length; ii++){
			arr[ii]=Math.random()*(up-low)+low;
		}
		return arr;
	}
	public static double[] totRam (double arr[]){
		for (int ii=0; ii<arr.length; ii++){
			arr[ii]=(int)(Math.random()*1000)+1;
		}
		return arr;
	}
	public static double[] shrink (double arr[]){
		double [] res;
		//If the number of elements of the original array is even
		if (arr.length%2==0)
			res = new double [arr.length/2];
		else
			res = new double [arr.length/2+1];
		for (int ii=0; ii<arr.length; ii=ii+2){
			if (ii<arr.length-1)
				res[ii/2] = arr[ii]+arr[ii+1];
			//Special case for arrays with odd number of elements
			else
				res[ii/2] = arr[ii];
		}
		return res;	
	}
	public static double[] invert (double arr[]){
		double []aux=new double[arr.length];
		for (int ii=0;ii<arr.length; ii++){
			aux[ii]=arr[arr.length-ii-1];
		}
		return aux;
	}
	public static void print (double [] arr){
		for (int ii=0; ii<arr.length; ii++)
			System.out.print((int) arr[ii]+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int answer=0, el=0;
		String answer2="";
		double [] arr=null;//This value is set to work with the while
		do{
			System.out.println("How do you want to fill the array?");
			System.out.println("1) Partially random");
			System.out.println("2) Totally random");
			System.out.println("3) Manually");
			answer=sc.nextInt();
			if (answer==1 || answer==2 || answer==3){
				do{
					System.out.println("Enter the number of elements");
					el=sc.nextInt();
					if (el<=0){
						System.out.println("The elements must be bigger than 0");
					}
				}
				while(el<=0);
				arr=new double [el];
			}
			switch (answer){
			case 1:	
				System.out.println("Enter the upper bound");
				int up = sc.nextInt();
				System.out.println("Enter the lower bound");
				int low = sc.nextInt();
				arr=parRam(up,low,arr);
				break;
			case 2:
				arr=totRam(arr);
				break;
			case 3:		
				for (int ii=0; ii<arr.length; ii++){
					System.out.println("Enter the value of the element "+ii);
					arr[ii]=sc.nextDouble();
				}
				break;
			default:	System.out.println("Please, enter 1, 2 or 3!");break;
			}
		}
		while(arr==null/*answer!=1 || answer!=2 || answer!=3*/);
		//I don't know what the previous can be executed
		//Print the array
		System.out.println("The generated array is");
		print(arr);
		do{
			System.out.println("Enter the option");
			System.out.println("A) Shrink the array");
			System.out.println("B) Invert the array");
			System.out.println("C) Quit");
			answer2=sc.next();
			switch (answer2){
			case "A":
				arr=shrink(arr);
				print(arr);
				break;
			case "B":
				arr=invert(arr);
				print(arr);
				break;
			case "C":	System.out.println("Thanks");break;
			default:	System.out.println("Enter a right option!");break;
			}
		}
		while(!answer2.equals("C"));
		sc.close();
	}
}