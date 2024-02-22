package org.api.lec12;

public final class Cat extends Animal {
  private String name;
  private int age;

  public String purr() {
    return "고양이 야옹~";
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}
