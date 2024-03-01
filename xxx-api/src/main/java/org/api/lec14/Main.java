package org.api.lec14;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.SequencedMap;

public class Main {
  public static void main(String[] args) {
    SequencedMap<Integer, String> map = new LinkedHashMap<>();
    map.put(1, "A");
    map.put(2, "B");

    // var entry = map.firstEntry();
    var entry = map.entrySet().iterator().next();
    entry.setValue("D");
    System.out.println(map);
  }


  public static void sequencedListReversedExample() {
    List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
    List<Integer> reversed = numbers.reversed();

    numbers.add(6);
    System.out.println(reversed);

    reversed.addFirst(7);
    System.out.println(numbers);
  }

  public static void emojiExample() {
    System.out.println(Character.isEmoji(128512));
    System.out.println(Character.isEmoji(65));
  }

  public static void clampExample() {
    int result = Math.clamp(20, 5, 15);
    System.out.println(result);
  }
}
