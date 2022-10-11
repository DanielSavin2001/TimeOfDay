/**
 * 
 *  @author Daniel
 *
 * Abstractetoestandsinvarianten/publieke invarianten: (WE PRATEN HIER ALLEEN OVER DE GETTER, PUBLIEKE DOC)
 * 
 *  @invar Hours ligt tussen 0 en 23.
 *  	| getHours() >= 0 &&  getHours() <= 23
 * 
 *  @invar Minutes ligt tussen 0 en 59.
 *  	| getMinutes() >= 0 &&  getMinutes() <= 59
 *  
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
	
	private int minutesSinceMidnight;
	/**
	 * 
	 * @throws IllegalArgumentException  | !(0 <= hours && hours <= 23)
	 * @throws IllegalArgumentException  | !(0 <= minutes && minutes <= 59)
	 * @post getHours() == hours
	 * @post getMinutes() == minutes
	 */
	public TimeOfDay(int hours, int minutes){
		if(!(0 <= hours && hours <= 23)) {
			throw new IllegalArgumentException("'hours' should be between 0 and 23");
		}
		if( !(0 <= minutes && minutes <= 59)) {
			throw new IllegalArgumentException("'hours' should be between 0 and 23");
		}
		this.setHours(hours);
		this.setMinutes(minutes);
	}

	public int getHours() {
		return hours;
	}

	/**
	 * @throws IllegalArgumentException  | !(0 <= givenHours && givenHours <= 23)

	 *  @post | getHours() == givenHours
	 *  @post | getMinutes() == old(getMinutes())
	 */
	public void setHours(int givenHours) {
		if(!(0 <= hours && hours <= 23)) {
			throw new IllegalArgumentException("'hours' should be between 0 and 23");
		}
		this.hours = givenHours;
		this.minutesSinceMidnight = hours * 60 + minutesSinceMidnight % 60;
	}

	public int getMinutes() {
		return minutes;
	}

	/**
	 * @throws IllegalArgumentException  | !(0 <= givenMinutes && givenMinutes <= 59)
	 *  @post | getMinutes() == givenMinutes
	 *  @post | getHours() == old(getHours())
	 */
	public void setMinutes(int givenMinutes) {
		if( !(0 <= minutes && minutes <= 59)) {
			throw new IllegalArgumentException("'hours' should be between 0 and 23");
		}
		this.minutes = givenMinutes;
		this.minutesSinceMidnight = minutesSinceMidnight / 60 * 60 + givenMinutes;

	}
	
	
/**
 *  @post
 *  	| result ==getHours() * 60 + getMinutes()
 */
	public int getMinutesSinceMidnight() {
		return minutesSinceMidnight;
	}
	
	/**
	 *  @pre | 0<= minutesSinceMidnight && minutesSinceMidnight < 24 * 60
	 *	@post | getMinutesSinceMidnight() == minutesSinceMidnight
	 */
		public void setMinutesSinceMidnight(int minutesSinceMidnight) {
			this.minutesSinceMidnight = minutesSinceMidnight;
		}

	
	
}
