package org.example.oppgave1;

import java.util.ArrayList;
import java.util.Comparator;

public class EventRegister {
  private final ArrayList<Event> events;

  public EventRegister() {
    this.events = new ArrayList<>();
  }

  public void addEvent(Event event) {
    this.events.add(event);
  }

  public EventRegister eventsOnLocation(String location) {
    EventRegister newRegister = new EventRegister();
    for (Event event : events) {
      if (event.getLocation().equals(location)) {
        newRegister.addEvent(event);
      }
    }
    return newRegister;
  }

  public EventRegister eventsOnDate(long date) {
    EventRegister newRegister = new EventRegister();
    for (Event event : events) {
      if (event.getDate() == date) {
        newRegister.addEvent(event);
      }
    }
    return newRegister;
  }

  public EventRegister eventsSortedBetweenDates(long date1, long date2) {
    EventRegister newRegister = new EventRegister();
    events.stream()
            .filter(event -> event.getDate() > date1 && event.getDate() < date2)
            .sorted(Comparator.comparing(Event :: getDate))
            .forEach(newRegister::addEvent);
    return newRegister;
  }

  public EventRegister eventsSortedBy(int input) {
    EventRegister newRegister = new EventRegister();
    switch (input) {
      case 1 -> // Sorted by location
              events.stream()
                      .sorted(Comparator.comparing(Event :: getLocation))
                      .forEach(newRegister :: addEvent);
      case 2 -> // Sorted by type
              events.stream()
                      .sorted(Comparator.comparing(Event :: getType))
                      .forEach(newRegister :: addEvent);
      case 3 -> // Sorted by location
              events.stream()
                      .sorted(Comparator.comparing(Event :: getDate))
                      .forEach(newRegister :: addEvent);
      default -> // Invalid input
              System.out.println("Ugyldig inndata, vennligst tast inn gyldig nummer");
    }


    return newRegister;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("EventRegister:\n");
    for (Event event : events) {
      sb.append(event).append("\n");
    }
    return sb.toString();
  }

}
