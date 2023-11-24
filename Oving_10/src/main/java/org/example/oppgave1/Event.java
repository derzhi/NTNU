package org.example.oppgave1;

public class Event {
  private final int id;
  private final String name;
  private final String location;
  private final String organizer;
  private final String type;
  private final long date;

  public Event(int id, String name, String location, String organizer, String type, long date) {
    this.id = id;
    this.name = name;
    this.location = location;
    this.organizer = organizer;
    this.type = type;
    this.date = date;
  }

  public String getLocation() { return location; }
  public String getType() { return type; }

  public long getDate() { return date; }

  @Override
  public String toString() {
    return "id=" + id + ", name='" + name + "', location='" + location + "', organizer='" + organizer +
            "', type='" + type + "', date=" + date;
  }

}
