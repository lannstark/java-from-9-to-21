package org.api.lec10;

import java.time.LocalDate;
import java.util.Objects;

public final class FruitDto {
  private final String name; // 과일 이름
  private final int price; // 과일 가격
  private final LocalDate date; // 과일 입고 일자

  public FruitDto(String name, int price, LocalDate date) {
    this.name = name;
    this.price = price;
    this.date = date;
  }

  public FruitDto(String name, int price) {
    this(name, price ,null);
  }

  public String name() {
    return name;
  }

  public int price() {
    return price;
  }

  public LocalDate date() {
    return date;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FruitDto fruitDto = (FruitDto) o;
    return price == fruitDto.price && Objects.equals(name, fruitDto.name) && Objects.equals(date, fruitDto.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, price, date);
  }

  @Override
  public String toString() {
    return "FruitDto[" +
        "name='" + name + '\'' +
        ", price=" + price +
        ", date=" + date +
        ']';
  }
}