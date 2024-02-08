package org.api.lec02;

import org.domain.Lec02Person;

import java.lang.reflect.Field;

public class Main {
  public static void main(String[] args) throws Exception {
    Lec02Person p = new Lec02Person();

    Class<Lec02Person> clazz = Lec02Person.class;
    Field name = clazz.getDeclaredField("name");

    // 몸무게를 제가 100으로 바꾸겠습니다.
    name.set(p, "ABC");
    System.out.println(p.getName());
  }
}
