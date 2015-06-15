package ba.bitcamp.kristinapupavac;

public class Train {
	Locomotive locomotive;
	Wagon wagon;
	
	public Train(Locomotive locomotive, Wagon wagon) {
		super();
		this.locomotive = locomotive;
		this.wagon = wagon;
	}
	/**
	 * 
	 * @param locomotive
	 * @param wagon
	 * @return
	 */
	public static Train  newTrain(Locomotive locomotive, Wagon wagon) {
		Train tr = new Train (locomotive, wagon);
		return tr;
	}
	/**
	 * 
	 * @param locomotive
	 * @param wagon
	 * @return
	 */
	public static double volumeTrain(Locomotive locomotive, Wagon wagon) {
		return locomotive.volumeLocomotive(locomotive.rectangle, locomotive.rectangle, locomotive.round,
				locomotive.round + wagon.wagonVolume(wagon.rectangle, wagon.round) + 
				wagon.wagonVolume(locomotive.rectangle, wagon.round);
	}
}
