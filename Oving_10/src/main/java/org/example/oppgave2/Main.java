package org.example.oppgave2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  private static final Scanner in = new Scanner(System.in);

  public static void main(String[] args) {

    // TODO: SPØR OM VALG AV LISTER
    // TODO: SPØR OM VALG AV STREAM, FOR EACH OSV

    initiateValues();
    registerNewDish();
    findDishByName();
    findDishesByType();
    registerNewMenu();
    findMenusBetweenTotalPrices();

  }

  private static String getUserInputString(String message) {
    System.out.println(message);
    return in.nextLine();
  }

  private static double getUserInputDouble(String message) {
    System.out.println(message);
    return in.nextDouble();
  }

  public static void registerNewDish() {
    // Register a new dish
    System.out.println("\nRegister new dish:");
    String name = getUserInputString("Name:");
    String type = getUserInputString("Type:");
    String recipe = getUserInputString("Recipe:");
    double price = getUserInputDouble("Price:");
    in.nextLine();

    Dish dish = new Dish(name, type, recipe, price);
    MenuRegister.addDishToDishes(dish);
    System.out.println("Dish registered: " + dish);
  }

  public static void findDishByName() {
    // Find a dish by name
    System.out.println("\nFind dish by name:");
    String dishName = getUserInputString("Name:");
    Dish foundDish = MenuRegister.getDishes().get(dishName);
    System.out.println("Found dish: " + foundDish);
  }

  public static void findDishesByType() {
    // Find all dishes by type
    System.out.println("\nFind all dishes by type:");
    String dishType = getUserInputString("Type:");
    Map<String, Dish> dishesByType = MenuRegister.getDishesByType(dishType);
    System.out.println("Found dishes: " + dishesByType);
  }

  public static void registerNewMenu() {
    // Register a new menu
    System.out.println("\nRegister new menu:");

    // Get map of all dishes available
    Map<String, Dish> dishesSelection = MenuRegister.getDishes();

    while (!dishesSelection.isEmpty()) {
      System.out.println("\nType in name of a dish to add to the menu, or type exit to finish menu:");
      for (Dish dish : dishesSelection.values()) {
        System.out.println(dish);
      }
      String userInput = getUserInputString("Dish name / exit: \n");
      if ("exit".equalsIgnoreCase(userInput)) {
        break;
      } else if (dishesSelection.containsKey(userInput)) {
        Dish dish = dishesSelection.get(userInput);
        dishesSelection.remove(userInput);
        System.out.println("Dish added to menu: " + dish + "\n");
      } else {
        System.out.println("Dish not found.");
      }

      if (dishesSelection.isEmpty() ) {
        System.out.println("No more dishes available.");
      }


    }

  }

  public static void findMenusBetweenTotalPrices() {
    // Find all menus between total prices
    System.out.println("\nFind all menus between total prices:");
    double minPrice = getUserInputDouble("Min price:");
    double maxPrice = getUserInputDouble("Max price:");
    Map<String, Menu> menusByTotalPrice = MenuRegister.getMenusBetweenTotalPrices(minPrice, maxPrice);
    System.out.println("Found menus: " + menusByTotalPrice);
  }

  public static void initiateValues() {
    // Initiate values
    Dish dish1 = new Dish("Pizza", "Main", "Tomato, cheese, ham, mushrooms", 100);
    Dish dish2 = new Dish("Pasta", "Main", "Tomato, cheese, ham, mushrooms", 100);
    Dish dish3 = new Dish("Salad", "Main", "Tomato, cheese, ham, mushrooms", 100);
    Dish dish4 = new Dish("Ice cream", "Dessert", "Tomato, cheese, ham, mushrooms", 100);
    Dish dish5 = new Dish("Cake", "Dessert", "Tomato, cheese, ham, mushrooms", 100);
    Dish dish6 = new Dish("Coke", "Drink", "Tomato, cheese, ham, mushrooms", 100);
    Dish dish7 = new Dish("Water", "Drink", "Tomato, cheese, ham, mushrooms", 100);

    MenuRegister.addDishToDishes(dish1);
    MenuRegister.addDishToDishes(dish2);
    MenuRegister.addDishToDishes(dish3);
    MenuRegister.addDishToDishes(dish4);
    MenuRegister.addDishToDishes(dish5);
    MenuRegister.addDishToDishes(dish6);
    MenuRegister.addDishToDishes(dish7);

    Menu menu1 = new Menu("Menu 1", new HashMap<>());
    menu1.addDishToMenu(dish1);
    menu1.addDishToMenu(dish2);
    menu1.addDishToMenu(dish3);
    MenuRegister.addMenuToMenus(menu1);


    Menu menu2 = new Menu( "Menu 2", new HashMap<>());
    menu2.addDishToMenu(dish4);
    menu2.addDishToMenu(dish5);
    menu2.addDishToMenu(dish6);
    menu2.addDishToMenu(dish7);
    MenuRegister.addMenuToMenus(menu1);
  }




}
