package org.domain;

public class Lec02Person {
  private int weight;

  public String name;

  public int getWeight() {
    return weight;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "weight: " + weight;
  }
}