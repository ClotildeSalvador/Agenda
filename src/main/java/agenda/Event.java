package agenda;

import java.time.*;

public class Event {

	/**
	 * The myTitle of this event
	 */
	private String myTitle;

	/**
	 * The starting time of the event
	 */
	protected LocalDateTime myStart;

	/**
	 * The durarion of the event
	 */
	protected Duration myDuration;

	/**
	 * Constructs an event
	 *
	 * @param title    the title of this event
	 * @param start    the start time of this event
	 * @param duration the duration of this event
	 */
	public Event(String title, LocalDateTime start, Duration duration) {
		this.myTitle = title;
		this.myStart = start;
		this.myDuration = duration;
	}

	/**
	 * Tests if an event occurs on a given day
	 *
	 * @param aDay the day to test
	 * @return true if the event occurs on that day, false otherwise
	 */
	public boolean isInDay(LocalDate aDay) {
		boolean r = true;
		if (this.myStart.isAfter(LocalDateTime.of(aDay, LocalTime.of(0, 0)))) {
			r = false;
		}
		if (this.myStart.plus(myDuration).isBefore(LocalDateTime.of(aDay, LocalTime.of(0, 0)))) {
			r = false;
		}
		return r;
	}

	/**
	 * @return the myTitle
	 */
	public String getTitle() {
		return myTitle;
	}

	/**
	 * @return the myStart
	 */
	public LocalDateTime getStart() {
		return myStart;
	}

	/**
	 * @return the myDuration
	 */
	public Duration getDuration() {
		return myDuration;
	}
        
        
        public String toString(){
            return "Titre : "+myTitle+" ,duree :"+myDuration+" ,date :"+myStart;
        }

}
