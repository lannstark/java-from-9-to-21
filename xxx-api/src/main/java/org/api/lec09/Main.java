package org.api.lec09;

public class Main {

  private String calculateTestGrade(int score) {
    return switch (score) {
      case 5 -> {
        System.out.println("만점입니다!");
        yield "A";
      }
      case 4, 3 -> throw new IllegalArgumentException();
      case 2, 1 -> "C";
      default -> "F";
    };
  }

}
