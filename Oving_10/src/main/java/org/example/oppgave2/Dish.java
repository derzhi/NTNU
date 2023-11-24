package org.example.oppgave2;

public class Dish {
  private final String name;
  private final String type;
  private final String recipe;
  private final double price;

  public Dish(String name, String type, String recipe, double price) {
    this.name = name;
    this.type = type;
    this.recipe = recipe;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "name='" + name + "', type='" + type + "', recipe='" + recipe + "', price='" + price;
  }
}
