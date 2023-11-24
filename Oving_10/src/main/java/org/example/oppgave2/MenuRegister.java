package org.example.oppgave2;

import java.util.HashMap;
import java.util.Map;

public class MenuRegister {
  public static HashMap<String, Dish> dishes = new HashMap<>();
  public static HashMap<String, Menu> menus = new HashMap<>();

  public static HashMap<String, Dish> getDishes() {
    return dishes;
  }
  public static void addDishToDishes(Dish dish) {
    dishes.put(dish.getName(), dish);
  }
  public static void addMenuToMenus(Menu menu) {
    menus.put(menu.getName(), menu);
  }

  public static HashMap<String, Menu> getMenusBetweenTotalPrices(double minPrice, double maxPrice) {
    HashMap<String, Menu> menusBetweenTotalPrices = new HashMap<>();
    for (Menu menu : menus.values()) {
      if (menu.getMenuTotalPrice() >= minPrice && menu.getMenuTotalPrice() <= maxPrice) {
        menusBetweenTotalPrices.put(menu.getName(), menu);
      }
    }
    return menusBetweenTotalPrices;
  }

  public static Map<String, Dish> getDishesByType(String type) {
    Map<String, Dish> dishesByType = new HashMap<>();
    for (Dish dish : dishes.values()) {
      if (dish.getType().equals(type)) {
        dishesByType.put(dish.getName(), dish);
      }
    }
    return dishesByType;
  }

}
