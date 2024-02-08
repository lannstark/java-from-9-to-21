package org.domain.service;

public class DatabaseStringRepository implements StringRepository {
  @Override
  public void save(String newStr) {
    System.out.println("데이터베이스에 저장");
  }
}
