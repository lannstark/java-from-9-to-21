package org.api.lec06;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Optional.ofNullable(3)
        .orElseThrow();
  }

  public static void unmodifiableExample() {
    List<Integer> oldNums = new ArrayList<>();
    oldNums.add(1);
    oldNums.add(2);

    List<Integer> newNums = Collections.unmodifiableList(oldNums);
    oldNums.add(3);

    oldNums.forEach(x -> System.out.println("old : " + x)); // 1, 2, 3
    newNums.forEach(x -> System.out.println("new : " + x)); // 1, 2, 3
  }

  public static void copyOfExample() {
    List<Integer> oldNums = new ArrayList<>();
    oldNums.add(1);
    oldNums.add(2);

    List<Integer> newNums = List.copyOf(oldNums);
    oldNums.add(3);

    oldNums.forEach(x -> System.out.println("old : " + x)); // 1, 2, 3
    newNums.forEach(x -> System.out.println("new : " + x)); // 1, 2
  }


  public static void varExample() {
    Map<String, String> map = Map.of("A", "B");
    var map2 = Map.of("A", "B");

    var var = 3;
  }
}
