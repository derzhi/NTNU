package org.example.oppgave2;

import java.util.HashMap;
import java.util.Map;

public class Menu {
  private final HashMap<String, Dish> dishes;
  private final String name;

  public Menu(String name, HashMap<String, Dish> dishes) {
    this.name = name;
    this.dishes = new HashMap<>();
  }
  public String getName() {
    return name;
  }
  public void addDishToMenu(Dish dish) {
    this.dishes.put(dish.getName(), dish);
  }

  public double getMenuTotalPrice() {
    double totalPrice = 0;
    for (Map.Entry<String, Dish> entry : dishes.entrySet()) {
      totalPrice += entry.getValue().getPrice();
    }
    return totalPrice;
  }

  @Override
  public String toString() {
    return "Menu: " + name + "\n" + dishes;
  }

}
