package agenda;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Description : A repetitive event that terminates after a given date, or after
 * a given number of occurrences
 */
public class FixedTerminationEvent extends RepetitiveEvent {

	/**
	 * Constructs a fixed terminationInclusive event ending at a given date
	 *
	 * @param title                the title of this event
	 * @param start                the start time of this event
	 * @param duration             the duration of this event
	 * @param frequency            one of :
	 *                             <UL>
	 *                             <LI>ChronoUnit.DAYS for daily repetitions</LI>
	 *                             <LI>ChronoUnit.WEEKS for weekly repetitions</LI>
	 *                             <LI>ChronoUnit.MONTHS for monthly
	 *                             repetitions</LI>
	 *                             </UL>
	 * @param terminationInclusive the date when this event ends
	 */
	private LocalDate termination;

	private long numberOfOccurrences;

	public FixedTerminationEvent(String title, LocalDateTime start, Duration duration, ChronoUnit frequency,
			LocalDate terminationInclusive) {
		super(title, start, duration, frequency);
		// TODO : implémenter cette méthode
		this.termination = terminationInclusive;
//		nb de jour entre le debut et la fin de l'event
		long n = 1 ; 
		n=frequency.between(start.toLocalDate(), terminationInclusive.plusDays(1))+1;
		this.numberOfOccurrences=n ;
	}

	/**
	 * Constructs a fixed termination event ending after a number of iterations
	 *
	 * @param title               the title of this event
	 * @param start               the start time of this event
	 * @param duration            the duration of this event
	 * @param frequency           one of :
	 *                            <UL>
	 *                            <LI>ChronoUnit.DAYS for daily repetitions</LI>
	 *                            <LI>ChronoUnit.WEEKS for weekly repetitions</LI>
	 *                            <LI>ChronoUnit.MONTHS for monthly repetitions</LI>
	 *                            </UL>
	 * @param numberOfOccurrences the number of occurrences of this repetitive event
	 */
	public FixedTerminationEvent(String title, LocalDateTime start, Duration duration, ChronoUnit frequency,
			long numberOfOccurrences) {
		super(title, start, duration, frequency);
		this.numberOfOccurrences = numberOfOccurrences;
		LocalDateTime n = start ; 
		if (frequency == ChronoUnit.DAYS) {
			n=start.plusDays(numberOfOccurrences-1); 
		}
		if (frequency == ChronoUnit.WEEKS) {
			n=start.plusWeeks(numberOfOccurrences-1); 
		}
		if (frequency == ChronoUnit.MONTHS) {
			n=start.plusMonths(numberOfOccurrences-1); 
		}
		int a = n.getYear() ;
		int m = n.getMonthValue();
		int d = n.getDayOfMonth() ;
		this.termination=LocalDate.of(a, m, d) ;
	}

	/**
	 *
	 * @return the termination date of this repetitive event
	 */
	public LocalDate getTerminationDate() {
		// TODO : implémenter cette méthode
		return this.termination;
	}

	public long getNumberOfOccurrences() {
		// TODO : implémenter cette méthode
		return this.numberOfOccurrences;
	}

}
