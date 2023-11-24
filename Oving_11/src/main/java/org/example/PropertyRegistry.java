package org.example;

import java.util.ArrayList;
import java.util.List;

public class PropertyRegistry {
  private final ArrayList<Property> properties;

  public PropertyRegistry() {
    this.properties = new ArrayList<>();
  }

  public void addProperty(Property property) {
    properties.add(property);
  }

  public void removeProperty(Property property) {
    properties.remove(property);
  }

  public int getSumProperties() {
    return properties.size();
  }

  public List<Property> getPropertiesByLotNumber(int lotNumber) {
    return properties.stream()
            .filter(property -> property.getLotNumber() == lotNumber)
            .toList();
  }

  public List<Property> getPropertyByID(int municipalityNumber, int lotNumber, int sectionNumber) {
    return properties.stream()
            .filter(property -> property.getMunicipalityNumber() == municipalityNumber &&
                    property.getLotNumber() == lotNumber && property.getSectionNumber() == sectionNumber)
            .toList();
  }

  public double getAverageAreaPerSquareMeter() {
    return properties.stream()
                      .mapToDouble(Property::getAreaPerSquareMeter)
                      .average()
                      .orElse(0);
  }

  @Override
  public String toString() {
    return properties.stream()
                     .map(Property::toString)
                     .reduce("", (acc, property) -> acc + property + "\n");
  }

}
