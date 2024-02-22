package org.api.lec11;

import org.api.lec10.FruitDto;

import java.util.Comparator;
import java.util.List;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    User user = new User(null);
    boolean isBlank = user.name().isBlank();
  }

  record User(String name) {
  }

  public static void randomExample() {
    RandomGeneratorFactory.all()
        .forEach(f -> System.out.println(f.name()));

    RandomGeneratorFactory.getDefault();
  }

  public static void teeingExample() {
    List<FruitDto> fruits = List.of(
        new FruitDto("사과", 100),
        new FruitDto("바나나", 200),
        new FruitDto("사과", 300),
        new FruitDto("수박", 500)
    );


    int result = fruits.stream()
        .collect(Collectors.teeing(
            Collectors.minBy(Comparator.comparingInt(FruitDto::price)),
            Collectors.maxBy(Comparator.comparingInt(FruitDto::price)),
            (f1, f2) -> {
              f1.ifPresent(f -> System.out.printf("가장 싼 과일은 %s입니다\n", f.name()));
              f2.ifPresent(f -> System.out.printf("가장 비싼 과일은 %s입니다\n", f.name()));
              return 0;
            }
        ));

  }

  public static void indentExample() {
    String str = """
        A
        BC
        DEF
        """.indent(3);
    System.out.println(str);
  }
}
