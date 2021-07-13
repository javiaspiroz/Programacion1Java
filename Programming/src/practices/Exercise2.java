package practices;

public class Exercise2 {

	public static void main(String[] args) {
		float[][] a=new float [][]{{8.3,4.5,0.0},{-1.2,0.0,40000.57}};
		int [][] b=extractComponents(a,2,3,10);
		for (int i=0; i<b.length; i++){
			for (int j=0; j<b[i].length; j++){
				System.out.print(b[i][j]+" ");				
			}
			System.out.println();
		}	
	}
	public static int [][] extractComponents(float[][] a, int n, int m, int x){
		int aux=0x7F800000;
		int [][] b= new int [3][2];
		for (int i=0; i<n; i++){
			for (int j=0; j<m; j++){
				float num=a[i][j];
				num= num AND aux;
				num = num srl 23;
				num=num-127;//num = exponent of the number
				if (num<x){
					b[i][j]=99999;
				}
				else {
					b[i][j]=num;
				}
			}
		}
		return b;		
	}

}
