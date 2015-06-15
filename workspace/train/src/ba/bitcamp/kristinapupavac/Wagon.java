package ba.bitcamp.kristinapupavac;

public class Wagon {
	Round round;
	Rectangle rectangle;
	/**
	 * 
	 * @param round
	 * @param rectangle
	 */
	public Wagon(Round round, Rectangle rectangle) {
		super();
		this.round = round;
		this.rectangle = rectangle;
	}
	/**
	 * 
	 * @param length
	 * @param weidth
	 * @return
	 */
	public static Rectangle newRectangle (int length, int weidth){
		Rectangle rc = new Rectangle(2, 5);	
		return rc;
	}
	/**
	 * 
	 * @param radius
	 * @return
	 */
	public static Round newRound (int radius){
		Round rn = new Round(2);	
		return rn;
	}
	/**
	 * 
	 * @param rectangle
	 * @param round
	 * @return
	 */
	public static double wagonVolume (Rectangle rectangle, Round round) {
		return 2 * rectangle.length + 2 * rectangle.weidth + 4 * Math.PI * round.radius; 
	}
	/**
	 * 
	 * @param rectangle
	 * @param round
	 * @return
	 */
	public static double wagonArea (Rectangle rectangle, Round round) {
		return 2 * rectangle.length * rectangle.weidth + 2 * round.radius * round.radius * Math.PI;	
	}


}
