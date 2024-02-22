package org.api.lec12;

public class Main {

  public static void main(String[] args) {
    (new Main()).sound(null);
  }

  // Dog인데 짖지 않는 강아지 case
  // 그 외 강아지 case
  public String sound(Animal animal) {
    return switch (animal) {
      case Dog dog -> dog.bark();
      case Cat cat -> cat.purr();
      case null -> "";
    };
  }

  record Point(double x, double y) {
  }

  record Line(Point p1, Point p2) {

  }

  public static void findDistanceIfPoint(Object object) {
    if (object instanceof Point(var x, var y)) {
      double distance = Math.hypot(x, y);
      System.out.printf("원점으로부터의 거리는 %.3f입니다.\n", distance);
    }

    if (object instanceof Line(Point(var x1, var y1), Point(var x2, var y2))) {
      double distance = Math.hypot(x2 - x1, y2 - y1);
      System.out.printf("두 점 사이의 거리는 %.3f입니다.\n", distance);
    }
  }
}
