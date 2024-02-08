package org.domain.service;

import java.util.ArrayList;
import java.util.List;

// 저장소 라는 의미에서 Repository를 사용
public class MemoryStringRepository implements StringRepository {
  private final List<String> strings = new ArrayList<>();

  @Override
  public void save(String newStr) {
    strings.add(newStr);
    System.out.println("문자열 메모리 저장");
  }
}
