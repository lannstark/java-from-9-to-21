package org.api.lec02.service;

import org.domain.service.StringRepository;

import java.util.ServiceLoader;

public class StringRepositoryLoader {
  private static final String DEFAULT = "org.domain.service.MemoryStringRepository";

  public static StringRepository getDefault() {
    return getRepository(DEFAULT);
  }

  private static StringRepository getRepository(String name) {
    for (StringRepository repository : ServiceLoader.load(StringRepository.class)) {
      if (repository.getClass().getName().equals(name)) {
        return repository;
      }
    }
    throw new IllegalArgumentException("원하는 서비스를 찾을 수 없습니다!");
  }
}
