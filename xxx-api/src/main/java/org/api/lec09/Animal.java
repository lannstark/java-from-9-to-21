package org.api.lec09;

public abstract class Animal {
  public String sound(Animal animal) {
    if (animal instanceof Dog dog) {
      return dog.bark();
    } else if (animal instanceof Cat cat) {
      return cat.purr();
    }
    throw new IllegalArgumentException("다른 경우의 수는 존재하지 않습니다!");
  }

  public String soundIfDog(Animal animal) {
    if (!(animal instanceof Dog dog)) {
      // return 대신 출력을 했다.
      System.out.println("강아지가 아닙니다!");
    }

    // return dog.bark(); // 컴파일 에러 - dog 변수를 찾을 수 없음
    return "";
  }
}
