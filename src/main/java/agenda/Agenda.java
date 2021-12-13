package agenda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/**
 * Description : An agenda that stores events
 */
public class Agenda {
	/**
	 * Adds an event to this agenda
	 *
	 * @param e the event to add
	 */

	private ArrayList<Event> listEvent;

	public void addEvent(Event e) {
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
		for (Event e : this.listEvent) {
			if (e.isInDay(day)) {
				list.add(e);
			}
		}
		return list;
	}
        
        
        
     /**
     * Trouver les événements de l'agenda en fonction de leur titre
     * @param title le titre à rechercher
     * @return les événements qui ont le même titre
     */
    public List<Event> findByTitle(String title) {
        List<Event> trouves = new ArrayList<>();
        for(Event e : listEvent){
            if(e.getTitle()==title){
                trouves.add(e);
            }
        }
        return trouves;
    }
    
    
    /**
     * Déterminer s’il y a de la place dans l'agenda pour un événement
     * @param e L'événement à tester (on se limitera aux événements simples)
     * @return vrai s’il y a de la place dans l'agenda pour cet événement
     */
    public boolean isFreeFor(Event e) {
        // TODO : implémenter cette méthode
        throw new UnsupportedOperationException("Pas encore implémenté");        
    }
        
        
        
        
        
        

}
