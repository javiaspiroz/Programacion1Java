package week11;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Exercise1 {

	public static void main(String[] args) {
		int arrNum=(int)(Math.random()*990)+10;
		Rectangle [] rect=new Rectangle [arrNum];
		for (int ii=0; ii<arrNum;ii++){
			double bases=(Math.random()*9)+1, heights=(Math.random()*9)+1;
			rect[ii]=new Rectangle(bases,heights);
		}
		
		//Print squares, as they are doubles it's quite improbable to be one
		for (int ii=0; ii<arrNum; ii++){
			if (rect[ii].isSquare()==true){
				System.out.println(rect[ii]);
			}
		}
		//Print biggest area
		int posArea=0;
		double maxArea=0;
		for (int jj=0; jj<arrNum;jj++){
			if (maxArea<rect[jj].getArea()){
				maxArea=rect[jj].getArea();
				posArea=jj;				
			}
		}
		System.out.println(rect[posArea]);
		//Print biggest perimeter
		int posPer=0;
		double maxPer=0;
		for (int jj=0; jj<arrNum;jj++){
			if (maxPer<rect[jj].getPerimeter()){
				maxPer=rect[jj].getPerimeter();
				posPer=jj;				
			}
		}
		System.out.println(rect[posPer]);
		//Print biggest side of a rectangle
		int posSide=0;
		double maxSide=0;
		for (int jj=0; jj<arrNum;jj++){
			if (maxSide<rect[jj].getSide()){
				maxSide=rect[jj].getSide();
				posSide=jj;				
			}
		}
		System.out.println(rect[posSide]);
	}

}
