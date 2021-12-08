package agenda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/**
 * Description : An agenda that stores events
 */
public class Agenda {
<<<<<<< HEAD
    /**
     * Adds an event to this agenda
     *
     * @param e the event to add
     */
	
	private List<Event> listEvent = new ArrayList();
	
    public void addEvent(Event e) {
        // TODO : implémenter cette méthode
        listEvent.add(e) ;
    }

    /**
     * Computes the events that occur on a given day
     *
     * @param day the day toi tes
     * @return and iteraror to the events that occur on that day
     */
   /* public List<Event> eventsInDay(LocalDate day) {
    	List<Event> list = new ArrayList<Event>() ;
        // TODO : implémenter cette méthode
        for (Event e : this.listEvent) {
        	if (e.isInDay(day)) {
                    list.add(e);
        	}
                if (e.getDuration()
                    
            
                    
                }
                
        }
        return list ;
    }*/
=======
	/**
	 * Adds an event to this agenda
	 *
	 * @param e the event to add
	 */

	private ArrayList<Event> listEvent;

	public void addEvent(Event e) {
		// TODO : implémenter cette méthode
		listEvent.add(e);
	}

	/**
	 * Computes the events that occur on a given day
	 *
	 * @param day the day toi tes
	 * @return and iteraror to the events that occur on that day
	 */
	public List<Event> eventsInDay(LocalDate day) {
		List<Event> list = new ArrayList<Event>();
		// TODO : implémenter cette méthode
		for (Event e : this.listEvent) {
			if (e.isInDay(day)) {
				list.add(e);
			}
		}
		return list;
	}
>>>>>>> 7ede82ef9732164a3f1803400f546aeb26d3f299
}
