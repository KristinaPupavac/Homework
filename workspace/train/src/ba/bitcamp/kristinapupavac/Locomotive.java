package ba.bitcamp.kristinapupavac;

public class Locomotive {
	Round round;
	Rectangle rectangle;
	Square square;

	/**
	 * 
	 * @param round
	 * @param rectangle
	 * @param square
	 */
	public Locomotive(Round round, Rectangle rectangle, Square square) {
		super();
		this.round = round;
		this.rectangle = rectangle;
		this.square = square;
	}

	/**
	 * 
	 * @param length
	 * @param weidth
	 * @return
	 */
	public static Rectangle newRectangle(int length, int weidth) {
		Rectangle rc = new Rectangle(2, 5);
		return rc;
	}

	/**
	 * 
	 * @param length
	 * @param weidth
	 * @return
	 */
	public static Rectangle chimneyRectangle(int length, int weidth) {
		Rectangle chimney = new Rectangle(2, 5);
		return chimney;
	}

	/**
	 * 
	 * @param radius
	 * @return
	 */
	public static Round wheelRound(int radius) {
		Round wheel = new Round(2);
		return wheel;
	}

	/**
	 * 
	 * @param radius
	 * @return
	 */
	public static Round windowRound(int radius) {
		Round window = new Round(2);
		return window;
	}

	/**
	 * 
	 * @param page
	 * @return
	 */
	public static Square newSquare(int page) {
		Square sq = new Square(3);
		return sq;
	}

	/**
	 * 
	 * @param rectangle1
	 * @param rectangle2
	 * @param round1
	 * @param round2
	 * @param square
	 * @return
	 */
	public static double volumeLocomotive(Rectangle rectangle1,
			Rectangle rectangle2, Round round1, Round round2, Square square) {
		return Wagon.wagonVolume(rectangle1, round1) + 2 * rectangle2.length
				+ 2 * rectangle2.weidth + 4 * Math.PI * round2.radius + square.page * 4;
	}
	/**
	 * 
	 * @param rectangle1
	 * @param rectangle2
	 * @param round1
	 * @param round2
	 * @param square
	 * @return
	 */
	public static double areaLocomotive(Rectangle rectangle1,
			Rectangle rectangle2, Round round1, Round round2, Square square) {
		return Wagon.wagonArea(rectangle1, round1) + 2 * rectangle2.length
				* rectangle2.weidth + square.page * square.page +  2 * round2.radius * round2.radius * Math.PI;
	}

}
