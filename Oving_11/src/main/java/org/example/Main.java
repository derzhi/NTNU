package org.example;

import java.util.Scanner;

public class Main {

  private static final Scanner in = new Scanner(System.in);
  private static final PropertyRegistry propertyRegistry = new PropertyRegistry();

  public static void main(String[] args) {
    init();
    start();
  }

  /**
   * Presents the menu for the user, and awaits input from the user. The menu
   * choice selected by the user is being returned.
   *
   * @return the menu choice by the user as a positive number starting from 1.
   * If 0 is returned, the user has entered a wrong value
   */
  private static int showMenu() {
    int menuChoice = 0;
    System.out.println("\n***** Property Register Application v0.1 *****\n");
    System.out.println("1. Add property");
    System.out.println("2. List all properties");
    System.out.println("3. Search property");
    System.out.println("4. Calculate average area");
    System.out.println("9. Quit");
    System.out.println("\nPlease enter a number between 2 and 9.\n");
    if (in.hasNextInt()) {
      menuChoice = in.nextInt();
      in.nextLine();
    } else {
      System.out.println("You must enter a number, not text");
    }
    return menuChoice;
  }
  public static void start() {
    boolean finished = false;
    // The while-loop will run as long as the user has not selected
    // to quit the application
    while (!finished) {
      int menuChoice = showMenu();
      switch (menuChoice) {
        case ADD_PROPERTY -> addProperty();
        case LIST_ALL_PROPERTIES -> viewAllProperties();
        case FIND_PROPERTY -> findPropertyByPropertyID();
        case CALCULATE_AVERAGE_AREA -> calculateAverageArea();
        case EXIT -> {
          System.out.println("Thank you for using the Properties app!\n");
          finished = true;
        }
        default -> System.out.println("Unrecognized menu selected..");
      }
    }
  }

  // Constants representing the different menu choices
  private static final int ADD_PROPERTY = 1;
  private static final int LIST_ALL_PROPERTIES = 2;
  private static final int FIND_PROPERTY = 3;
  private static final int CALCULATE_AVERAGE_AREA = 4;
  private static final int EXIT = 9;

  public static String getUserInput(String prompt) {
    System.out.println(prompt);
    return in.nextLine();
  }

  private static void addProperty() {
    System.out.println("Add property selected");
    int municipalityNumber = Integer.parseInt(getUserInput("Enter municipality number:"));
    String municipalityName = getUserInput("Enter municipality name:");
    int lotNumber = Integer.parseInt(getUserInput("Enter lot number:"));
    int sectionNumber = Integer.parseInt(getUserInput("Enter section number:"));
    String propertyName = getUserInput("Enter property name:");
    double areaPerSquareMeter = Double.parseDouble(getUserInput("Enter area per square meter:"));
    String ownerName = getUserInput("Enter owner name:");

    Property property = new Property(municipalityNumber, municipalityName, lotNumber, sectionNumber, propertyName, areaPerSquareMeter, ownerName);
    propertyRegistry.addProperty(property);
    System.out.println("Property added: " + property);
  }

  private static void viewAllProperties() {
    System.out.println("View all properties selected");
    System.out.println(propertyRegistry);
  }

  private static void findPropertyByPropertyID() {
    System.out.println("Find property by property ID selected");
    int municipalityNumber = Integer.parseInt(getUserInput("Enter municipality number:"));
    int lotNumber = Integer.parseInt(getUserInput("Enter lot number:"));
    int sectionNumber = Integer.parseInt(getUserInput("Enter section number:"));
    System.out.println(propertyRegistry.getPropertyByID(municipalityNumber, lotNumber, sectionNumber));
  }

  private static void calculateAverageArea() {
    System.out.println("Calculate average area");
    System.out.println(propertyRegistry.getAverageAreaPerSquareMeter());
  }

  public static void init() {
    Property property1 = new Property(301, "Oslo", 1, 1, "Frognerparken", 1000, "Kommunen");
    Property property2 = new Property(301, "Oslo", 1, 2, "Slottet", 2000, "Kongen");
    Property property3 = new Property(301, "Oslo", 1, 3, "Operaen", 3000, "Operaen");
    Property property4 = new Property(301, "Oslo", 1, 4, "Aker Brygge", 4000, "Kommunen");
    Property property5 = new Property(301, "Oslo", 1, 5, "Sørenga", 5000, "Kommunen");

    propertyRegistry.addProperty(property1);
    propertyRegistry.addProperty(property2);
    propertyRegistry.addProperty(property3);
    propertyRegistry.addProperty(property4);
    propertyRegistry.addProperty(property5);
  }

}