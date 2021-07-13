package practices;

import java.util.Scanner;

public class PracticesMidTerm {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		/*boolean array[]= new boolean[100];
		int trues=0, falses=0;
		for (int ii=0; ii<array.length; ii++){
			int num=(int) (Math.random()*2);
			System.out.println(num);
			if (num==0){
				array[ii]=false;
				falses++;
			}
			else{
				array[ii]=true;
				trues++;
			}
		}
		System.out.println("trues="+trues);
		System.out.println("falses="+falses);*/
		
		
		int [][]mat=new int[4][4];
		for(int ii=0; ii<4; ii++){
			for(int jj=0; jj<4; jj++){
				System.out.print(mat[ii][jj]+'\t');
			}
			System.out.println();
		}
		
		
		
		
		sc.close();
	}

}
