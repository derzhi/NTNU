package org.example.oppgave1;

import java.util.Scanner;

public class Main {

  public static EventRegister register = new EventRegister();
  public static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Register over arrangementer");

    init();

    while(true) {
      boolean shouldContinue = menu();
      if (!shouldContinue) {
        break;
      }
    }
  }

  public static void init() {
    Event alienConcert = new Event(1, "Alien Jam Fest", "Mars Park", "Martian Council", "Concert", 202210311900L);
    Event pumpkinCarving = new Event(2, "Pumpkin Carving Contest", "Mars Park", "Mars Festivities", "Workshop", 202210311900L);
    Event spaceYoga = new Event(3, "Zero-G Yoga Session", "Space Station Z", "Galactic Fitness", "Exercise Class", 202211051000L);
    Event starGazing = new Event(4, "Interstellar Star Gazing", "Space Station Z", "Astronomy Club", "Observation", 202211052100L);
    Event robotComedyNight = new Event(5, "Robot Comedy Night", "Cyber Cafe", "AI Humor Group", "Comedy Show", 202211152030L);
    Event cyborgKaraoke = new Event(6, "Cyborg Karaoke Contest", "Cyber Cafe", "Techie Tunes", "Karaoke", 202211152030L);
    Event unicornRacing = new Event(7, "Unicorn Grand Prix", "Enchanted Forest", "Magic Events", "Race", 202212011400L);
    Event fairyDanceOff = new Event(8, "Fairy Dance-Off", "Enchanted Forest", "Fairy Council", "Dance", 202212011430L);

    register.addEvent(alienConcert);
    register.addEvent(pumpkinCarving);
    register.addEvent(spaceYoga);
    register.addEvent(starGazing);
    register.addEvent(robotComedyNight);
    register.addEvent(cyborgKaraoke);
    register.addEvent(unicornRacing);
    register.addEvent(fairyDanceOff);
  }

  public static boolean menu() {
    System.out.println();
    System.out.println("[1] - Registrer nytt arrangement");
    System.out.println("[2] - Finn arrangement på et gitt sted");
    System.out.println("[3] - Finn arrangement på en gitt dato");
    System.out.println("[4] - Finn arrangementer innenfor et tidsintervall");
    System.out.println("[5] - Sorter liste etter valgt parameter");
    System.out.println("[6] - Avslutt program");

    int input = in.nextInt();
    in.nextLine();

    switch (input) {
      case 1 -> {
        // New event
        System.out.println("Skriv inn parametere");
        System.out.println("ID: "); int id = in.nextInt(); in.nextLine();
        System.out.println("Navn: "); String name = in.nextLine();
        System.out.println("Lokasjon: "); String location = in.nextLine();
        System.out.println("Organisator: "); String organizer = in.nextLine();
        System.out.println("Type: "); String type = in.nextLine();
        System.out.println("Dato (YYYYMMDD1200): "); long date = in.nextLong();

        Event newEvent = new Event(id, name, location, organizer, type, date);
        register.addEvent(newEvent);

        return true;
      }
      case 2 -> {
        // Events on location
        System.out.println("Skriv inn sted"); String location = in.nextLine();
        register.eventsOnLocation(location);

        System.out.println(register.eventsOnLocation(location));

        return true;
      }
      case 3 -> {
        // Events on date
        System.out.println("Skriv inn dato på tallform");
        System.out.println("År: "); String year = in.nextLine();
        System.out.println("Måned: "); String month = in.nextLine();
        System.out.println("Dato: "); String date = in.nextLine();
        System.out.println("Klokkeslett: "); String time = in.nextLine();

        long fullDate = Long.parseLong(year + month + date + time);
        System.out.println(register.eventsOnDate(fullDate));

        return true;
      }
      case 4 -> {
        // Events between dates
        System.out.println("Skriv inn andre dato");
        System.out.println("Dato (YYYYMMDD): ");
        String date1 = in.nextLine();
        System.out.println("Klokkeslett: ");
        String time1 = in.nextLine();

        long fullDate1 = Long.parseLong(date1 + time1);

        System.out.println("Skriv inn første dato");
        System.out.println("Dato (YYYYMMDD): ");
        String date2 = in.nextLine();
        System.out.println("Klokkeslett: ");
        String time2 = in.nextLine();

        long fullDate2 = Long.parseLong(date2 + time2);

        System.out.println(register.eventsSortedBetweenDates(fullDate1, fullDate2));

        return true;
      }
      case 5 -> {
        // New list of events sorted by a parameter
        System.out.println("Velg parameter");
        System.out.println("[1] - sted");
        System.out.println("[2] - type");
        System.out.println("[3] - tidspunkt");

        int inputParameter = in.nextInt();
        System.out.println(register.eventsSortedBy(inputParameter));

        return true;
      }
      case 6 -> {
        // Exit program
        return false;
      }
      default -> {
        // Invalid input
        System.out.println("Ugyldig inndata, vennligst tast inn gyldig nummer");
        return true;
      }
    }
  }
}