package agenda;

import java.time.Duration;
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
    	boolean r = true ;
    	
//    	date de l'evenement
    	int y = e.getStart().getYear() ;
    	int m = e.getStart().getMonthValue();
    	int d = e.getStart().getDayOfMonth();
    	LocalDate l = LocalDate.of(y, m, d) ;
//    	heure de l'evenement
    	int h = e.getStart().getHour() ;
    	int min = e.getStart().getMinute() ;
    	LocalTime t = LocalTime.of(h, min) ;
//    	ev l'evenement existant auquel on compare l'evenement e
        for (Event ev : this.eventsInDay(l)) {
//        	recupere l'heure de l'evenement
        	int hev = ev.getStart().getHour() ;
        	int minev = ev.getStart().getMinute() ;
        	LocalTime tev = LocalTime.of(hev, minev) ;
//        	si le debut de ev est avant celui de e, on regarde si la fin de ev est avant le debut de e
        	if (tev.isBefore(t)) {
//        		duree de l'evenement ev existant
        		Duration dev = ev.getDuration() ;
        		LocalTime tevfin=tev.plus(dev) ;
        		if(tevfin.isAfter(t)) {
        			r=false ;
        		}
        	}
//        	si meme nb de minutes et meme heure = meme temps de debut : r=false
        	if (hev==h && minev==min) {
        		r=false ;
        	}
//        	si le debut de ev est apres celui de e, on regarde si la fin de e est avant le debut de ev
        	if (tev.isAfter(t)) {
//        		duree de l'evenement ev existant
        		Duration de = e.getDuration() ;
        		LocalTime tfin=tev.plus(de) ;
        		if(tfin.isAfter(tev)) {
        			r=false ;
        		}
        	}
        	
        }
        return r ;
    }

}
