package org.api.lec12;

import java.util.Random;

public final class Dog extends Animal {
  private String ownerName;

  public String bark() {
    return "강아지 멍멍!";
  }

  public boolean isQuite() {
    return (new Random()).nextBoolean();
  }

  public String getOwnerName() {
    return this.ownerName;
  }
}
