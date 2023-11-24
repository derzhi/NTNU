package org.example;

public class Property {
  private final int municipalityNumber;
  private final String municipalityName;
  private final int lotNumber;
  private final int sectionNumber;
  private final String propertyName;
  private final double areaPerSquareMeter;
  private final String ownerName;

  public Property(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber, String propertyName, double areaPerSquareMeter, String ownerName) {
    this.municipalityNumber = municipalityNumber;
    this.municipalityName = municipalityName;
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
    this.propertyName = propertyName;
    this.areaPerSquareMeter = areaPerSquareMeter;
    this.ownerName = ownerName;
  }

  public int getMunicipalityNumber() {
    return municipalityNumber;
  }

  public String getMunicipalityName() {
    return municipalityName;
  }

  public int getLotNumber() {
    return lotNumber;
  }

  public int getSectionNumber() {
    return sectionNumber;
  }

  public String getPropertyName() {
    return propertyName;
  }

  public double getAreaPerSquareMeter() {
    return areaPerSquareMeter;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public String getPropertyID() {
    return String.format("%d-%d/%d", municipalityNumber, lotNumber, sectionNumber);
  }

  @Override
  public String toString() {
    return String.format("Property ID: %s, Property name: %s, Area per square meter: %.2f, Owner name: %s",
            getPropertyID(), propertyName, areaPerSquareMeter, ownerName);
  }
}
