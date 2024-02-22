package org.api.lec12;

public sealed abstract class Animal permits Cat, Dog {
  protected AnimalType animalType;

  public AnimalType getType() {
    return this.animalType;
  }
}
