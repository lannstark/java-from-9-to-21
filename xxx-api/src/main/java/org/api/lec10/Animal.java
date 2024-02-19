package org.api.lec10;

public sealed abstract class Animal {
}

final class Dog extends Animal {
  public String bark() {
    return "강아지 멍멍!";
  }
}

final class Cat extends Animal {
  public String purr() {
    return "고양이 야옹~";
  }
}
