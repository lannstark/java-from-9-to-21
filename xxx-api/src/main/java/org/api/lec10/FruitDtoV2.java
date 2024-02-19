package org.api.lec10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.LocalDate;

public record FruitDtoV2(
    String name,

    @MyAnnotation
    int price,
    LocalDate date
) {
  private static final double DISCOUNT_RATE = 0.3;

  public int getDiscountPrice() {
    return (int) (price * (1.0 - DISCOUNT_RATE));
  }

  public FruitDtoV2 {
    System.out.println("생성자 호출!");
    if (price < 0) {
      // this.price = 0;
      throw new IllegalArgumentException("과일의 가격은 양수입니다!");
    }
  }

  public String name() {
    return "[재정의] " + this.name;
  }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MyAnnotation {

}