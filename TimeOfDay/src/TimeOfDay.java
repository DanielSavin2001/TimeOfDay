/**
 *  @author Daniel
 *
 * Abstractetoestandsinvarianten/publieke invarianten: (WE PRATEN HIER ALLEEN OVER DE GETTER, PUBLIEKE DOC)
 * 
 *  @invar Hours ligt tussen 0 en 23.
 *  	| getHours() >= 0
 *  	&&  getHours() <= 23
 * 
 *  @invar Minutes ligt tussen 0 en 59.
 *  	| getMinutes() >= 0 
 *  	&&  getMinutes() <= 59
 */

public class TimeOfDay {
	/**
	 * 
	 * @invar De hours is niet negatief en mag niet groter dan 23
	 *    | 0 <= hours && hours <= 23
	 */
	private int hours;
	/**
	 * 
	 * @invar De minutes is niet negatief en is niet groter dan 59
	 *    | 0 <= minutes && minutes <= 59
	 */
	private int minutes;
	
	public TimeOfDay(int hours, int minutes){
		this.setHours(hours);
		this.setMinutes(minutes);
	}

	public int getHours() {
		return hours;
	}

	/**
	 *  @pre | givenHours >= 0
	 *  @pre | givenHours <= 23
	 *  @post | getHours() == givenHours
	 */
	public void setHours(int givenHours) {
		this.hours = givenHours;
	}

	public int getMinutes() {
		return minutes;
	}

	/**
	 *  @pre | givenMinutes >= 0
	 *  @pre | givenMinutes <= 59
	 *  @post | getMinutes() == givenMinutes
	 */
	public void setMinutes(int givenMinutes) {
		this.minutes = givenMinutes;
	}
	
}
