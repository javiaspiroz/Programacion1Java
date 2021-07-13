package week8;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since October 2016
 * @version 1.0
 *
 */

public class RightTriangle {
	public float base;
	public float height;
	public RightTriangle (float base, float height) {
		if (base>0){
			this.base=base;
		}
		else this.base=1.0F;
		if (height>0){
			this.height=height;
		}
		else this.height=1.0F;
	}
	
}
