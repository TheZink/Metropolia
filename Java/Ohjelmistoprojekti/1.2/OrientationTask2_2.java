import java.util.ArrayList;
import java.util.PriorityQueue;

class Event implements Comparable<Event> {
    private long event_time;
    private String event_name;

    public Event(long event_time, String event_name) {
        this.event_time = event_time;
        this.event_name = event_name;
    }

    // Palauttaa aikaleiman
    public long eventTime() {
        return event_time;
    }

    // Palauttaa tapahtuman nimen
    public String eventName() {
        return event_name;
    }

    // Järjestetään aikaleiman perusteella listaan
    public int compareTo(Event other) {
        return Long.compare(this.event_time, other.event_time);
    }

    // Muutetaan listan tulostukset luettavaan muotoon. Muuten ne tulostuvat muodossa 'Event@36baf30c'
    public String toString() {
        return event_name +" "+ event_time;

    }

}

class EventList {
    private PriorityQueue<Event> event_que;
    // private long event_time = 0;

    public EventList() {
        event_que = new PriorityQueue<>();
    }

    // Tulostaa tapahtumat listalta
    public void eventPrint() {
        ArrayList<Event> event_array = new ArrayList<>(event_que);
        for (Event events : event_array) {
            System.out.println(events);
        }
    }
    
    // Poistaa tapahtumat listalta
    public Event eventRemove() {
        return event_que.poll();
    }

    // Lisää tapahtumat listaan
    public void eventCreate(Event event) {
        event_que.add(event);
    }
}

// Main-ohjelma
public class OrientationTask2_2 {
    public static void main(String[] args) {

        // Luodaan aikaleima
        long timestamp = System.currentTimeMillis() + 1000;
        
        // Luodaan kutsu
        EventList eventList = new EventList();

        // Luodaan tapahtumat
        eventList.eventCreate(new Event(timestamp -1500,"Phase A"));
        eventList.eventCreate(new Event(timestamp -2000, "Phase B"));
        eventList.eventCreate(new Event(timestamp -1000, "Phase C"));

        System.out.println("Listalla on seuraavat tapahtumat:" );;
        eventList.eventPrint();

        System.out.println("Käsittelemme tapahtumaa: " + eventList.eventRemove());


        
    }
}
