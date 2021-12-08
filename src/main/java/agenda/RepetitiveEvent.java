package agenda;

import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * Description : A repetitive Event
 */
public class RepetitiveEvent extends Event {
<<<<<<< HEAD
    /**
     * Constructs a repetitive event
     *
     * @param title the title of this event
     * @param start the start of this event
     * @param duration myDuration in seconds
     * @param frequency one of :
     * <UL>
     * <LI>ChronoUnit.DAYS for daily repetitions</LI>
     * <LI>ChronoUnit.WEEKS for weekly repetitions</LI>
     * <LI>ChronoUnit.MONTHS for monthly repetitions</LI>
     * </UL>
     */
	
	private ChronoUnit frequency ;
	
	
    public RepetitiveEvent(String title, LocalDateTime start, Duration duration, ChronoUnit frequency) {
        super(title, start, duration);
        // TODO : implémenter cette méthode
        this.frequency=frequency ;
       
    }

    /**
     * Adds an exception to the occurrence of this repetitive event
     *
     * @param date the event will not occur at this date
     */
    public void addException(LocalDate date) {
        // TODO : implémenter cette méthode
        throw new UnsupportedOperationException("Pas encore implémenté");
    }

    /**
     *
     * @return the type of repetition
     */
    public ChronoUnit getFrequency() {
        // TODO : implémenter cette méthode
    	return this.frequency ;
    }
    
    
    public String getFrequencyS(){
        if(this.frequency == ChronoUnit.DAYS){
            return "days";
        }
        if(this.frequency == ChronoUnit.WEEKS){
            return "weeks";
        }
        if(this.frequency == ChronoUnit.MONTHS){
            return "months";
        }
        else{
            return "0";
        }
    }
=======
	/**
	 * Constructs a repetitive event
	 *
	 * @param title     the title of this event
	 * @param start     the start of this event
	 * @param duration  myDuration in seconds
	 * @param frequency one of :
	 *                  <UL>
	 *                  <LI>ChronoUnit.DAYS for daily repetitions</LI>
	 *                  <LI>ChronoUnit.WEEKS for weekly repetitions</LI>
	 *                  <LI>ChronoUnit.MONTHS for monthly repetitions</LI>
	 *                  </UL>
	 */

	private ChronoUnit frequency;

	public RepetitiveEvent(String title, LocalDateTime start, Duration duration, ChronoUnit frequency) {
		super(title, start, duration);
		// TODO : implémenter cette méthode
		this.frequency = frequency;

	}

	/**
	 * Adds an exception to the occurrence of this repetitive event
	 *
	 * @param date the event will not occur at this date
	 */
	public void addException(LocalDate date) {
		// TODO : implémenter cette méthode
		throw new UnsupportedOperationException("Pas encore implémenté");
	}

	/**
	 *
	 * @return the type of repetition
	 */
	public ChronoUnit getFrequency() {
		// TODO : implémenter cette méthode
		return this.frequency;
	}
>>>>>>> 7ede82ef9732164a3f1803400f546aeb26d3f299

}
