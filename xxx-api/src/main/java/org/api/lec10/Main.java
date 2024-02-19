package org.api.lec10;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    FruitDtoV2 dto = new FruitDtoV2("사과", 1000, LocalDate.of(2024, 1, 1));
    System.out.println(dto.name());
    System.out.println(dto);
  }
}


